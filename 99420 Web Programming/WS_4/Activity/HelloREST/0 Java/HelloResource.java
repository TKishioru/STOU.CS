package net.codejava.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/stou")
public class HelloResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getStou() {
		return "(Exercise4) STOU Welcome : 6296002626 Khampeerada Phoothong";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public student getJSON() {
		return new student("6296002626", "Khampeerada", "Angthong");
	}

}
