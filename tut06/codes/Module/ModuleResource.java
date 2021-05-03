package jersey.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jersey.model.Module;
import jersey.service.ModuleService;

@Path("/professor")
public class ModuleResource {
	ModuleService moduleService = new ModuleService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Module> getModule() {
		return moduleService.getAllModule();
	}
}
