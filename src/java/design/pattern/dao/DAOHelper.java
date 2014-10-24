/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.pattern.dao;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class DAOHelper {
    public static DAO getDAO(){
        
        try {
            return ((DAO) Class.forName(PropertyHandler.getProperty("dao.impl")).newInstance());
            
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            Logger.getLogger(DAOHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
