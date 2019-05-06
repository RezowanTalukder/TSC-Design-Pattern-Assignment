package assinmenttsc;


public class Newspaper extends Media{

    public Newspaper(Fest fest) {
        super(fest);
    }
      

    @Override
    public void broascast() {
        fest.publish();

    }

}
