package edu.eci.arsw.gof.chainofrep.loanapproval.model;

/*
 * @author Joel Carvajal - Johan Rueda
 */

public class houseLoan implements propositos{
	private final String tipo = "House Loan";
	private propositos siguiente;
	
	public houseLoan(){}
	
	@Override
	public double getP(String purpT) {
		if (purpT.equalsIgnoreCase(tipo)) {
		return 0.819;
		} else {
			return 0.815;
		}
	}
	
}