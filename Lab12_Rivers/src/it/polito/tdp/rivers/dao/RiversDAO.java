package it.polito.tdp.rivers.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.rivers.model.River;

public class RiversDAO {

	public List<River> getAllRivers() {
		
		final String sql = "SELECT id,name FROM river" ;
		List<River> fiumi = new LinkedList<River>() ;
		try {
			
			Connection conn = DBConnect.getConnection() ;
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery() ;
			
			while(rs.next()){
				fiumi.add(new River(rs.getInt("id"),rs.getString("name"))) ;			
			}
			
			return fiumi ;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
