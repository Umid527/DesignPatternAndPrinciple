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
public class Test {
    public static void main(String[] args) {
        
        System.out.println(DAOHelper.getDAO().getTestData(1).getName());
    }
}
