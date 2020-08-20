package edu.eci.arsw.gof.chainofrep.loanapproval.model;

/*
 * @author Joel Carvajal - Johan Rueda
 */

public class carLoan implements propositos{
	private final String tipo = "Car Loan";
	private propositos siguiente;
	
	public carLoan(propositos sig) {
		this.siguiente = sig;
	}
	
	@Override
	public double getP(String purpT) {
		if (purpT.equalsIgnoreCase(tipo)) {
		return 0.838;
		} else {
			return this.siguiente.getP(purpT);
		}
	}
	
}