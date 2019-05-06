package assinmenttsc;


public class Radio extends Media{

    public Radio(Fest fest) {
        super(fest);
    }

    @Override
    public void broascast() {

        fest.publish();
        
        
    }

}
