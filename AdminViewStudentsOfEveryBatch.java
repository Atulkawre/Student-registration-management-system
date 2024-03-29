package usecase;

import dao.Dao;
import dao.DaoImpl;

	public class AdminViewStudentsOfEveryBatch {
		public AdminViewStudentsOfEveryBatch() {
			Dao daoObj = new DaoImpl();
			daoObj.adminViewStudentsOfEveryBatch();

		}
	}


