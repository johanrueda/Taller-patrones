package edu.eci.arsw.gof.chainofrep.fileproc;

import java.util.logging.Logger;
/**
 * 
 * @author Joel Carvajal y Johan Rueda
 *
 */
public class FormatoTXT implements Formato {
	private Formato next;
	private static final Logger LOG = Logger.getLogger(DataProcessor.class.getName());
	@Override
	public void nextFormato(String file) {
		// TODO Auto-generated method stub
		 if(file.equals("txt")){
	            LOG.info("Cargando archivo txt");
	            processTXT(file);
	        
	        }else{
	            LOG.info("No hay formatos ");
	            
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
		throw new UnsupportedOperationException("No hay mas formatos.");
	}

	 private void processTXT(String fileName) {
	    	
	        LOG.info("Processing TXT...");
	       
	    }
}
