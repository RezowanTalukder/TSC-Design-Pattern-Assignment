package assinmenttsc.observer;

import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class MgsReciever implements Observer{

        private String name;
	private Subject topic;
	
	public MgsReciever(String nm){
		this.name=nm;
	}
	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if(msg == null){
			//System.out.println(name+":: No new message");
                }
                else{
                    System.out.println(name+" :: recieved message:: "+msg);
                

                }
	}

	@Override
	public void setSubject(Subject sub) {
		this.topic=sub;
	}


}
