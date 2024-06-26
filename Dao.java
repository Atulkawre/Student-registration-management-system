package dao;

	
	import java.sql.SQLException;
	import java.util.List;

	import bean.BatchRecordDTO;
	import bean.Course;
	import bean.Student;
	import bean.BatchSeatDTO;
	import exception.CourseException;
	import exception.StudentException;

	public interface Dao {

		public String registerStudent (Student student) throws StudentException, SQLException;
		
		public boolean registerBatch (int cId, String cName, String sEmail) throws SQLException, CourseException, Exception;
		
		public boolean checkForStudent (String sEmail, String Password) throws StudentException;
		
		public List<Course> getListOfCourses () throws SQLException, CourseException; 
		
		public boolean checkForCourse (String cName) throws SQLException, CourseException;
		
		public int getCourseId (String cName) throws SQLException, CourseException; 
		
		public boolean studentDetailEdit (String sEmail, String sPassword, String sNewPassword, String sNewName, String sNewCourse) throws SQLException, CourseException;
		
		public BatchRecordDTO getBatchRecordForStudent (String sEmail);
		
		public void editStudentProfile (String sEmail, String nSPassword, String nSName) throws SQLException;
		
		public List<BatchSeatDTO> getBatchSeatdetails () throws SQLException;
		
		public String getCourseName (int cId) throws SQLException;
		
		public void displayCourseAvailableWithOrWithoutSeats (String option) throws SQLException;
		
		public boolean checkForAdmin ();
		
		public void displayHomePageOptionToUser();
		
		public void displayOptionsForAdmin();
		
		public void adminAddNewCourse();
		
		public void adminUpdateFeesOfCourse (String cName, int fees);
		
		public void adminDeleteCourse (String cName);
		
		public void adminDisplayCourseInfo (String cName);
		
		public void adminCreatBatchunderaCourse (String cName, int bId, int totalSeats );
		
		public void adminAllocateStudentsInaBatchUnderaCourse();
		
		public List<Student> getListOfStudents();
		
		public String getStudentPassword (String sEmail) throws StudentException;
		
		public void adminUpdateTotalSeatsOfaBatch();
		
		public void adminViewStudentsOfEveryBatch();
		
		public List<String> getSEmailListFromBatchWhoIsIntoACourse();
		
		public String getSNameFromEmail (String sEmail);
	}


