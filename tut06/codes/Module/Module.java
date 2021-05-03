package jersey.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Module {
	private String ModuleTitle;
	private String Credit;
	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Module(String moduleTitle, String credit) {
		super();
		ModuleTitle = moduleTitle;
		Credit = credit;
	}
	public String getModuleTitle() {
		return ModuleTitle;
	}
	public void setModuleTitle(String moduleTitle) {
		ModuleTitle = moduleTitle;
	}
	public String getCredit() {
		return Credit;
	}
	public void setCredit(String credit) {
		Credit = credit;
	}
	
}
