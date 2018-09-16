/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plus;

/**
 *
 * @author Almia
 */
public class Conversion {
    public static int StringtoInt(String x){
        Integer i;
        i = 0;
        if (x !=null && !"".equals(x) ){
        try {
            i= Integer.parseInt(x); 
        } catch (NumberFormatException e) {
        }
    }
        return i;
    }
    
}
