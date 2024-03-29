package usecase;
import dao.Dao;
import dao.DaoImpl;
public class AdminAddNewCourse {
	
	

		public AdminAddNewCourse() {
			Dao daoObj = new DaoImpl();
			daoObj.adminAddNewCourse();
		}

}
