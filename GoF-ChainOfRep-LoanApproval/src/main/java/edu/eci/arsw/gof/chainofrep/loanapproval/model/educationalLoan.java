package edu.eci.arsw.gof.chainofrep.loanapproval.model;

/*
 * @author Joel Carvajal - Johan Rueda
 */

public class educationalLoan implements propositos{
	private final String tipo = "Educational Loan";
	private propositos siguiente;
	
	public educationalLoan(propositos sig) {
		this.siguiente = sig;
	}
	
	@Override
	public double getP(String purpT) {
		if (purpT.equalsIgnoreCase(tipo)) {
		return 0.810;
		} else {
			return this.siguiente.getP(purpT);
		}
	}
	
}