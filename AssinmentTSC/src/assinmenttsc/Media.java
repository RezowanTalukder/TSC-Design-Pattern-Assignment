package assinmenttsc;


public abstract class Media {
    protected Fest fest ;
    
    protected Media(Fest fest){
        this.fest = fest ;
    }
    
    public abstract void broascast() ;
}
