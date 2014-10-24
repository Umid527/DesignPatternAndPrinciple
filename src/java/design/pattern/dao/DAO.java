/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package design.pattern.dao;

import java.util.List;

/**
 *
 * @author admin
 */
public interface DAO {
    List<TestData> getTestDataList();
    
    TestData getTestData(int id);
    
    TestData setTestData(int id,String name, String surname);
}
