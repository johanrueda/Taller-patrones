package edu.eci.arsw.gof.chainofrep.loanapproval.model;


/*
 * @author Joel Carvajal - Johan Rueda
 */

public class workExpRule implements rule{
	private rule siguiente;
	
	public workExpRule(rule sig){
		this.siguiente = sig;
	}
	
	@Override
	public boolean getRule(ApplicationDetails application,String[] outcome) {
		int WorkExp = application.getWork_Ex_Year() * 12 + application.getWork_Ex_Mon();
		
		if (WorkExp < 6) {
            outcome[0]="Too little working experience";
            return true;
        } else {
			return siguiente.getRule(application, outcome);
		}
	}
	
}