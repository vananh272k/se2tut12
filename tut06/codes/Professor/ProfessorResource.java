package jersey.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jersey.model.Professor;
import jersey.service.ProfessorService;

@Path("/professor")
public class ProfessorResource {
	ProfessorService professorService = new ProfessorService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Professor> getProfessor() {
		return professorService.getAllProfessor();
	}
}
