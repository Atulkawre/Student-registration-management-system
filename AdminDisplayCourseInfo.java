package usecase;


import java.sql.SQLException;
import java.util.*;

import bean.Course;
import dao.Dao;
import dao.DaoImpl;
import exception.CourseException;

	public class AdminDisplayCourseInfo {

		public AdminDisplayCourseInfo() throws SQLException, CourseException {
			Scanner sc = new Scanner(System.in);
			Dao daoObj = new DaoImpl();
			List<Course> lisOfCourses = daoObj.getListOfCourses();
			System.out.println("List of courses-");
			lisOfCourses.forEach(c ->{
				System.out.println(c.getCname());
			});
			System.out.println("Enter course name to get it's information");
			String cName = sc.next();
			daoObj.adminDisplayCourseInfo(cName);
	}
	}


