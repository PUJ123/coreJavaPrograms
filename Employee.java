package com.app.model;

import java.util.List;
import java.util.Map;

public class Employee {

	private int eid;
	private String ename;
	private double esal;
	private List<String> prjs; //set,array
	//private Map<String,Double> vers;
	public Employee() {
		super();
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public List<String> getPrjs() {
		return prjs;
	}
	public void setPrjs(List<String> prjs) {
		this.prjs = prjs;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", prjs=" + prjs + "]";
	}

	/*
	 * public Map<String, Double> getVers() { return vers; } public void
	 * setVers(Map<String, Double> vers) { this.vers = vers; }
	 */
	


}
