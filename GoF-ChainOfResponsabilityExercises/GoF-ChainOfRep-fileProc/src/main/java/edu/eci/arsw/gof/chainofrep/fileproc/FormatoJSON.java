package edu.eci.arsw.gof.chainofrep.fileproc;

import java.util.logging.Logger;

public class FormatoJSON implements Formato {
	private Formato next;
	private static final Logger LOG = Logger.getLogger(DataProcessor.class.getName());
	@Override
	public void nextFormato(String file) {
		// TODO Auto-generated method stub
		 if(file.equals("json")){
	            LOG.info("Cargando archivo json");
	            processJSON(file);
	        }else{
	            next.nextFormato(file);
	        }
	    }

	@Override
	public Formato getNext() {
		// TODO Auto-generated method stub
		return next;
	}

	@Override
	public void setNext(Formato formato) throws DataLoadException {
		// TODO Auto-generated method stub
		next=formato;
	}

	  private void processJSON(String fileName) {
	    	
	        LOG.info("Processing JSON file...");
	        
	        
	    }
}
