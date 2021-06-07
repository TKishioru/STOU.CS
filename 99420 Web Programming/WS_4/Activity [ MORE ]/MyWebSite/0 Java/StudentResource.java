package net.stou.ws;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/students")
public class StudentResource {
	/*
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getName() {
		return "--- TEST ---";
	}*/
	
	private StudentDAO dao = StudentDAO.getInstance();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> list() {
		return dao.listALL();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add(Student student) throws URISyntaxException {
		int newStudentId = dao.add(student);
		URI uri = new URI("/students/" + newStudentId);
		return Response.created(uri).build();
	}
	
	@GET
	@Path("{id}")
	public Response get(@PathParam("id") int id) {
		Student student = dao.get(id);
		if(student != null) {
			return Response.ok(student,
					MediaType.APPLICATION_JSON).build();
		} else {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public Response update(@PathParam("id") int id, Student student) {
		student.setId(id);
		if(dao.update(student)) {
			return Response.ok().build();
		} else {
			return Response.notModified().build();
		}
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") int id) {
		if(dao.delete(id)) {
			return Response.ok().build();
		} else {
			return Response.notModified().build();
		}
	}

}
