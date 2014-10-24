/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.rest;

import com.google.gson.Gson;
import design.pattern.dao.DAOHelper;
import design.pattern.dao.TestData;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author admin
 */
@Path("/emp")
public class TestDao {
    @GET
	@Path("/he")
    @Produces("application/json")
	public String getMsg() {
 
            List<TestData> resultlist= DAOHelper.getDAO().getTestDataList();
		String output = "Jersey say : " ;
 
		Gson g = new Gson();
        return g.toJson(resultlist);
 
	}
}
