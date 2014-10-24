/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern.dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class DummyDAOImpl implements DAO{

    @Override
    public TestData getTestData(int id) {
        TestData data = new TestData();
        data.setName("test1");
        data.setSurname("test2");
        return data;
    }

    @Override
    public List<TestData> getTestDataList() {
        ArrayList<TestData> list = new ArrayList<TestData>();
        TestData data = new TestData();
        data.setName("test1");
        data.setSurname("test2");
        list.add(data);
        data = new TestData();
        data.setName("test11");
        data.setSurname("test22");
        list.add(data);
        return list;
    }

    @Override
    public TestData setTestData(int id, String name, String surname) {
        TestData data = new TestData();
        data.setId(1);
        return data;
    }

    

}
