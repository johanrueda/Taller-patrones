package edu.eci.arsw.gof.chainofrep.fileproc;
/**
 * 
 * @author Joel Carvajal y Johan Rueda
 *
 */
public interface  Formato {
	public void nextFormato(String file);
	public Formato getNext();
	public void setNext(Formato formato) throws DataLoadException;
	
    
}
