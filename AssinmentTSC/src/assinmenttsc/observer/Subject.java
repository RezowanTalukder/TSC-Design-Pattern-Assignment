
package assinmenttsc.observer;

/**
 *
 * @author USER
 */
public interface Subject {
    
    public void register(Observer obj);

    public void notifyObservers();
	
    public Object getUpdate(Observer obj);
    
}
