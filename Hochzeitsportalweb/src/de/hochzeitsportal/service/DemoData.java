package de.hochzeitsportal.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Servlet implementation class DemoData
 */
@Path("/DemoData")
public class DemoData{

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String onGet(){
		return "This one generates demo data on put";
	}

}
