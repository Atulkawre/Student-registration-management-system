package usecase;

import java.sql.SQLException;
import java.util.*;
import dao.Dao;
import dao.DaoImpl;
import exception.CourseException;
import exception.StudentException;

public class LoginStudent {
	

		public LoginStudent() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your e-mail:");
			String sEmail = sc.next();
			System.out.println("Enter your password:");
			String sPassword = sc.next();
			
			Dao daoObj = new DaoImpl();
			
			try {
				boolean isStudentPresent = daoObj.checkForStudent(sEmail, sPassword);
				
				if(isStudentPresent) {
					System.out.println("Welcome "+ daoObj.getSNameFromEmail(sEmail));
					System.out.println("Please select-");
					System.out.println("1. Update my details");
					System.out.println("2. View all available courses and seat availability");
					int opt = sc.nextInt();
					
					if(opt == 1) {
						System.out.println("Enter your new password:");
						String sNewPassword = sc.next();
						sc.nextLine();
						System.out.println("Enter your new name:");
						String sNewName = sc.nextLine();
						daoObj.editStudentProfile(sEmail, sNewPassword, sNewName);
						
						System.out.println("Enter yes to change course:");
						System.out.println("Enter no to leave");
						String opt2 = sc.next().toLowerCase();
						
						if(opt2.equalsIgnoreCase("yes")) {
							System.out.println("Enter your new course:");
							String sNewCourse = sc.next().toUpperCase();
							List<String>SEmailListFromBatchWhoIsIntoACourse = daoObj.getSEmailListFromBatchWhoIsIntoACourse();
							
							if(SEmailListFromBatchWhoIsIntoACourse.contains(sEmail)) {
								boolean check = daoObj.studentDetailEdit(sEmail, sPassword, sNewPassword, sNewName, sNewCourse);
							}
							else
							{
								int cId = daoObj.getCourseId(sNewCourse);
								daoObj.registerBatch(cId, sNewCourse, sEmail);
								System.out.println("Student name "+sNewName+ " registered into course "+ sNewCourse);
							}
							
						
							
						}
							
					}
					else if(opt == 2) {
						
						daoObj.displayCourseAvailableWithOrWithoutSeats("includeSeat");
						
					}
					
				}
				else System.out.println("Student with e-mail "+ sEmail +" does not exists");
				
			}
			catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			catch (StudentException e) {
				System.out.println(e.getMessage());
			}
			catch (InputMismatchException e) {
				System.out.println(e.getMessage());
			}
			catch (CourseException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {		
				System.out.println(e.getMessage());
			}
			
		}
		
	}


