package edu.eci.arsw.gof.chainofrep.fileproc;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Tipos implements Formato {
	/**
	 * @author Joel Carvajal y Johan Rueda
	 */
	private Formato next;
	private static final Logger LOG = Logger.getLogger(DataProcessor.class.getName());
	
	@Override
	public void nextFormato(String file) {
		// TODO Auto-generated method stub
		
		FormatoCSV fcsv= new FormatoCSV();
		
		try{
			this.setNext(fcsv);
		}catch(DataLoadException e) {
			System.out.println("Algo anda mal.");
			
		}
		
		FormatoJSON fjson = new FormatoJSON();
		try{
			fcsv.setNext(fjson);
		}catch(DataLoadException e) {
			System.out.println("Algo anda mal.");
		}
		
		FormatoXML fxml = new FormatoXML();
		try{
			fjson.setNext(fxml);
		}catch(DataLoadException e) {
			System.out.println("Algo anda mal.");
		}
		
		FormatoTXT ftxt = new FormatoTXT();
		
		try{
			fxml.setNext(ftxt);
		}catch(DataLoadException e) {
			System.out.println("Algo anda mal.");
		}
		
		next.nextFormato(file);
	}

	@Override
	public Formato getNext() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("No hay mas formatos."); 
	}

	@Override
	public void setNext(Formato formato) throws DataLoadException {
		// TODO Auto-generated method stub
		next=formato;
		
	}

}
