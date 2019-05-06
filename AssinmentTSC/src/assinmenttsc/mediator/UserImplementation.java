package assinmenttsc.mediator;


public class UserImplementation extends User {
 
    public UserImplementation(ChatMediator med, String name) {
        super(med, name);
    }
 
    @Override
    public void send(String msg){
        System.out.println(this.name+": Sending Message="+msg);
        mediator.sendMessage(msg, this);
    }
    @Override
    public void receive(String msg) {
        System.out.println(this.name+": Received Message:"+msg);
    }
 
}