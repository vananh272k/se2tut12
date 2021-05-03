package jersey.service;

import java.util.ArrayList;
import java.util.List;

import jersey.model.Professor;

public class ProfessorService {
	public List<Professor> getAllProfessor() {
		Professor s1 = new Professor ("Long Nguyen Dinh Tran", "longndt@hanu.edu.vn");
		Professor s2 = new Professor ("Quan Dang Dinh", "quandd@hanu.edu.vn");
		List<Professor> list = new ArrayList<Professor>();
		list.add(s1);
		list.add(s2);
		return list;
	}
}
