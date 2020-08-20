package edu.eci.arsw.gof.chainofrep.loanapproval.model;

/*
 * @author Joel Carvajal - Johan Rueda
 */

public class debtConsolidation implements propositos{
	private final String tipo = "Debt Consolidation";
	private propositos siguiente;
	
	public debtConsolidation(propositos sig) {
		this.siguiente = sig;
	}
	
	@Override
	public double getP(String purpT) {
		if (purpT.equalsIgnoreCase(tipo)) {
		return 0.831;
		} else {
			return this.siguiente.getP(purpT);
		}
	}
	
}