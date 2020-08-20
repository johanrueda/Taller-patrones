package edu.eci.arsw.gof.chainofrep.loanapproval.model;

/*
 * @author Joel Carvajal - Johan Rueda
 */

public class homeImprovement implements propositos{
	private final String tipo = "Home Improvement Loan";
	private propositos siguiente;
	
	public homeImprovement(propositos sig) {
		this.siguiente = sig;
	}
	
	@Override
	public double getP(String purpT) {
		if (purpT.equalsIgnoreCase(tipo)) {
		return 0.850;
		} else {
			return this.siguiente.getP(purpT);
		}
	}
	
}