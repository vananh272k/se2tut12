package jersey.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Course {
	private String CourseTitle;
	private String CourseCode;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String courseTitle, String courseCode) {
		super();
		CourseTitle = courseTitle;
		CourseCode = courseCode;
	}
	public String getCourseTitle() {
		return CourseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		CourseTitle = courseTitle;
	}
	public String getCourseCode() {
		return CourseCode;
	}
	public void setCourseCode(String courseCode) {
		CourseCode = courseCode;
	}
	
}
