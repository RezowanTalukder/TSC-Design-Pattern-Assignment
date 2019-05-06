
package assinmenttsc.mediator;

/**
 *
 * @author USER
 */
public interface ChatMediator {
    
    public void sendMessage(String msg, User user);
 
    void addUser(User user);

}
