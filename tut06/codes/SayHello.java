package jersey.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//Specifies the path to the RESTful service
@Path("/sayhello")
public class SayHello {
	
	// Specifies that the method processes HTTP GET requests 
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		String text = "Software Engineering 2 - FIT HANU";
		return text;
	}
}
