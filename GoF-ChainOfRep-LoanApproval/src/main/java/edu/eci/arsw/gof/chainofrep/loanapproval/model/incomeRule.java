package edu.eci.arsw.gof.chainofrep.loanapproval.model;


/*
 * @author Joel Carvajal - Johan Rueda
 */

public class incomeRule implements rule{
	private rule siguiente;
	
	public incomeRule(){}
	
	@Override
	public boolean getRule(ApplicationDetails application,String[] outcome) {
		
		if (application.getAnn_Sal() < 10000) {
            outcome[0]="Too little income";
            return true;
        } else {
			return false;
		}
	}
	
}