package de.hochzeitsportal.service;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("GPS/mine")
public class MyGpsCoordinates {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Map<String, String> getMyGpsCoordinates(){
		Map<String, String> m = new HashMap<>();
		m.put("y", "47.177546");
		m.put("x", "8.430578");
		return m;
	}
}
