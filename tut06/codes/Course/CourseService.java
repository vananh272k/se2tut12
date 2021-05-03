package jersey.service;

import java.util.ArrayList;
import java.util.List;

import jersey.model.Course;

public class CourseService {
	public List<Course> getAllCourse() {
		Course s1 = new Course ("Software Engineering 2", "ewxmuvy");
		Course s2 = new Course ("Software Quality Assurance", "rqohptywfm");
		List<Course> list = new ArrayList<Course>();
		list.add(s1);
		list.add(s2);
		return list;
	}
}

