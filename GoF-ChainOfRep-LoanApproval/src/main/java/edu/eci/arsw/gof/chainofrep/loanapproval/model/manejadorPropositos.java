package edu.eci.arsw.gof.chainofrep.loanapproval.model;


/*
 * @author Joel Carvajal - Johan Rueda
 */

public class manejadorPropositos {

	private houseLoan houseloan = new houseLoan();
	private educationalLoan educationalloan = new educationalLoan(houseloan);
	private homeImprovement homeimprovement = new homeImprovement(educationalloan);
	private debtConsolidation debtconsolidation = new debtConsolidation(homeimprovement);
	private creditCard creditcard = new creditCard(debtconsolidation);
	private carLoan carloan = new carLoan(creditcard);
	
	public manejadorPropositos(){}
	
	public double getP(String pur) {
		return this.carloan.getP(pur);
	}
	
}
