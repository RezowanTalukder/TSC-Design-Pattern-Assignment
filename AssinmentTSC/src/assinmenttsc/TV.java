package assinmenttsc;


public class TV extends Media{

    public TV(Fest fest) {
        super(fest);
    }

    @Override
    public void broascast() {
        fest.publish();

    }

}
