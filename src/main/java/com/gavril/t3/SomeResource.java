package com.gavril.t3;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
class Pers {
	String  age;
	String id;
	String name;

	public Pers() {
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Pers(String age, String id, String name) {
		this.age = age;
		this.id = id;
		this.name = name;
	}

}

@Path("resourceX")
public class SomeResource {

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Pers getData() {
		Pers pers1 = new Pers("1","2","3");
		return pers1;
	}

	@Path("rs")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public Pers createData (Pers a) {
		return a;
	}

	@Path("put/{id}")
	@PUT
	public Pers createPers(@PathParam("id") int id) {
		Pers x= new Pers();
		x.setId(id+"");
		return x;
	}

	@Path("delete/{id}")
	@DELETE
	public Pers deletePers(@PathParam("id") int id) {
		Pers x = new Pers();
		x.setId(id + "");
		return x;
	}
}
