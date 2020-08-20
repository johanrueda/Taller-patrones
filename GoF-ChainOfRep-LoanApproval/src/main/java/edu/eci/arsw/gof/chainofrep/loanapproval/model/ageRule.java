package edu.eci.arsw.gof.chainofrep.loanapproval.model;

import java.util.Calendar;

/*
 * @author Joel Carvajal - Johan Rueda
 */

public class ageRule implements rule{
	private rule siguiente;
	
	public ageRule(rule sig){
		this.siguiente = sig;
	}
	
	@Override
	public boolean getRule(ApplicationDetails application,String[] outcome) {
		int curYear = Calendar.getInstance().get(Calendar.YEAR);
        String dobYear = application.getDob();
        int age = curYear - Integer.parseInt(dobYear.substring(0, 4));
        
		if (age > 65 || age < 18) {
            outcome[0]="Too young or too old";
            return true;
        } else {
			return siguiente.getRule(application, outcome);
		}
	}
	
}