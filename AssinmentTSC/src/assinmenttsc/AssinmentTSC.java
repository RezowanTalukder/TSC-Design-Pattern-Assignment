package assinmenttsc;

import assinmenttsc.mediator.MessagaUI;
import assinmenttsc.singleton.TSC;

/**
 *
 * @author USER
 */
public class AssinmentTSC {

    public static void main(String[] args) {

        
        
        
       TSC tsc = TSC.getInstance() ;
       tsc.run();
        
    }
    
}
