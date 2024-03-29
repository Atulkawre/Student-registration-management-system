package usecase;

import java.sql.SQLException;
import java.util.*;

import bean.Course;
import exception.StudentException;
import exception.CourseException;

import dao.Dao;
import dao.DaoImpl;
	public class AdminDeleteCourse {
		public AdminDeleteCourse() throws SQLException, CourseException {
			Scanner sc = new Scanner(System.in);
			Dao daoObj = new DaoImpl();
			List<Course> lisOfCourses = daoObj.getListOfCourses();
			System.out.println("List of courses-");
			lisOfCourses.forEach(c ->{
				System.out.println(c.getCname());
				});
			System.out.println("Enter course name to delete:");
			String cName = sc.next();
			daoObj.adminDeleteCourse(cName);
		}


	}


