/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.pattern.dao;

/**
 *
 * @author admin
 */
public class DAOHelper2 {
    public static DAO getDAO(){
        return new DummyDAOImpl();
    }
    
}
