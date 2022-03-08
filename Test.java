package com.app.test;

import com.app.model.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String json="{\"eid\":10,\"ename\":\"A\",\"esal\":200.0}";
			
			System.out.println(json);
			//String json="{}"; //valid JSON 
			
			
			/*
			 * String json= "{'eid' : 1, " + "'ename': 'HR'," + "'esal': 213.44," +
			 * "'prjs' : [" + "{'p1': 'Alex','id': 1}, " + "{'p2': 'Brian','id':2}, " +
			 * "{'p3': 'Charles','id': 3}]}";
			 */
			
	
			/*
			 * String json1 = "{'eid' :1 ," +" 'ename':'ss' ," +"'esal':12.7 ,"
			 * +" 'prjs' :[{\"P1\",\"P2\",\"P3\"]}}";
			 */
			//String[] jsone={"eid":50203,"ename":"SYED","esal":20.30, "prjs":["P1","P2","P3"],"vers":{"M1":3.3,"M2":4.4},"addr":{"hno":"5-A/1","loc":"HYD"}}
			ObjectMapper om = new ObjectMapper();
			Employee emp = om.readValue(json, Employee.class);

			System.out.println(emp);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
	}

}
