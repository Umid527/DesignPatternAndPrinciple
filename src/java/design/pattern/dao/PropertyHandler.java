/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.pattern.dao;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class PropertyHandler {
    public static String getProperty(String key){
        try{
        return ResourceBundle.getBundle("design.pattern.dao.dao").getString(key);
        } catch (MissingResourceException ex) {
            Logger.getLogger(PropertyHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
