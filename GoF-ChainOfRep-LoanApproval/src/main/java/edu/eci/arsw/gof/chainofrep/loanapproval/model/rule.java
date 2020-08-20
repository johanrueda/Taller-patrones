package edu.eci.arsw.gof.chainofrep.loanapproval.model;

/*
 * @author Joel Carvajal - Johan Rueda
 */

public interface rule {

	public default boolean getRule(ApplicationDetails application,String[] outcome) {
		return false;
	}
	
}