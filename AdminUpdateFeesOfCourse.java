package usecase;
import java.util.*;
import dao.Dao;
import dao.DaoImpl;

	public class AdminUpdateFeesOfCourse {
		public AdminUpdateFeesOfCourse() {
			Scanner sc = new Scanner(System.in);
			Dao daoObj = new DaoImpl();
			System.out.println("Enter Course name: ");
			String cName = sc.next();
			System.out.println("Enter fees to update:");
			int fees = sc.nextInt();
			daoObj.adminUpdateFeesOfCourse(cName, fees);
		}
	

}
