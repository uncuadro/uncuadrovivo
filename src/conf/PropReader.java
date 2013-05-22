/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juan
 */
public class PropReader {
    
    private static PropReader reader=new PropReader();
    private Properties props;
    
    
    public PropReader(){
        try {
            props = new Properties();
            props.load(new FileInputStream("conf.properties"));
             
        }catch (FileNotFoundException ex) {
            Logger.getLogger(PropReader.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(PropReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static PropReader getReader(){
        
        return reader;
    }
    
    public String getKey(String key){
        
        return props.getProperty(key);
        
    }
    
    
    
}
