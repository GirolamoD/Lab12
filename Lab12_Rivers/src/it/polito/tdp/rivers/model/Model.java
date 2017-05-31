package it.polito.tdp.rivers.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.rivers.dao.RiversDAO;

public class Model {
	
	List<River> fiumi = new ArrayList<>() ;
	
	public Model(){
	}

	public List<River> getRivers(){
		RiversDAO dao = new RiversDAO();
		this.fiumi = dao.getAllRivers() ;
		return fiumi ;
	}

	public String getStartDate() {
		
		return null;
	}

	public String getEndDate() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNumMeasurements() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getFMed() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
