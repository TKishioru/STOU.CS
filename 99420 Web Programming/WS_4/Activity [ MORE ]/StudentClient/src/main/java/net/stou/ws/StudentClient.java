package net.stou.ws;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

public class StudentClient {
	private static String baseURI = "http://localhost:8084/MyWebSite/rest/students";
	
	public static void main(String[] args) {
		//sc_List();	
		//sc_Get();
		//sc_Delete();
		//sc_Update();
		sc_Add();
	}
	
	static void testGet() {
		WebTarget target = getWebTarget();
		String studentId = "1";
		Student student = target.path(studentId)
				.request()
				.accept(MediaType.APPLICATION_JSON)
				.get(Student.class);
		System.out.println(student);
	}
	
	static void sc_List() {
		WebTarget target = getWebTarget();
		String response = target.request()
				.accept(MediaType.APPLICATION_JSON)
				.get(String.class);
		System.out.println(response);
	}
	static void sc_Delete() {
		WebTarget target = getWebTarget();
		String studentId = "5";
		Response response = target.path(studentId)
				.request()
				.delete(Response.class);
		System.out.println(response);
	}
	
	static void sc_Update() {
		WebTarget target = getWebTarget();
		String studentId = "3";
		Student student = new Student("6296002097", "Mr.Tanapon", "chonburi");
		Response response = target.path(studentId)
				.request()
				.put(
				Entity.entity(student, MediaType.APPLICATION_JSON),
				Response.class);
		System.out.println(response);
	}
	
	static void sc_Add() {
		WebTarget target = getWebTarget();
		Student student1 = new Student("6196011842", "Miss.Ratthita", "Saraburi");
		Student student2 = new Student("6296002097", "Mr.Surachai", "Samut-Sakorn");
		Student student3 = new Student("6296002097", "Mr.Tanapon", "chonburi");
		Response response1 = target.request().post(
				Entity.entity(student1, MediaType.APPLICATION_JSON),
				Response.class);
		System.out.println(response1.getLocation().toString());
		Response response2 = target.request().post(
				Entity.entity(student2, MediaType.APPLICATION_JSON),
				Response.class);
		System.out.println(response2.getLocation().toString());
		Response response3 = target.request().post(
				Entity.entity(student3, MediaType.APPLICATION_JSON),
				Response.class);
		System.out.println(response3.getLocation().toString());
	}
	

	
	static WebTarget getWebTarget() {
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		return client.target(baseURI);
	}	
}