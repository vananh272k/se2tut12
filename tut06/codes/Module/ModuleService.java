package jersey.service;

import java.util.ArrayList;
import java.util.List;

import jersey.model.Module;

public class ModuleService {
	public List<Module> getAllModule() {
		Module s1 = new Module ("BA", "139");
		Module s2 = new Module ("BSc", "139");
		List<Module> list = new ArrayList<Module>();
		list.add(s1);
		list.add(s2);
		return list;
	}
}
