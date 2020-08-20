package edu.eci.arsw.gof.chainofrep.loanapproval.model;

/*
 * @author Joel Carvajal - Johan Rueda
 */

public class creditCard implements propositos{
	private final String tipo = "Credit Card";
	private propositos siguiente;
	
	public creditCard(propositos sig) {
		this.siguiente = sig;
	}
	
	@Override
	public double getP(String purpT) {
		if (purpT.equalsIgnoreCase(tipo)) {
		return 0.877;
		} else {
			return this.siguiente.getP(purpT);
		}
	}
	
}