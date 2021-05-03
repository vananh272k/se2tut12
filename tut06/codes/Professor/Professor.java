package jersey.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Professor {
	private String ProfessorName;
	private String ProfessorEmail;
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professor(String professorName, String professorEmail) {
		super();
		ProfessorName = professorName;
		ProfessorEmail = professorEmail;
	}
	public String getProfessorName() {
		return ProfessorName;
	}
	public void setProfessorName(String professorName) {
		ProfessorName = professorName;
	}
	public String getProfessorEmail() {
		return ProfessorEmail;
	}
	public void setProfessorEmail(String professorEmail) {
		ProfessorEmail = professorEmail;
	}
	
}
