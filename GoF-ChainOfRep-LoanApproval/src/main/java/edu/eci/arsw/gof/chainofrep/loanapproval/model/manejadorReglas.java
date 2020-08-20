package edu.eci.arsw.gof.chainofrep.loanapproval.model;


/*
 * @author Joel Carvajal - Johan Rueda
 */

public class manejadorReglas {

	private incomeRule incomerule = new incomeRule();
	private workExpRule workexprule = new workExpRule(incomerule);
	private rule agerule = new ageRule(workexprule);
	
	public manejadorReglas(){}
	
	public boolean getRule(ApplicationDetails application,String[] outcome) {
		return this.agerule.getRule(application,outcome);
	}
	
}
