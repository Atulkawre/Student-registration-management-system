package usecase;

import dao.Dao;
import dao.DaoImpl;
	
	public class AdminUpdateTotalSeatsOfaBatch {
		public AdminUpdateTotalSeatsOfaBatch() {
			Dao daoObj = new DaoImpl();
			daoObj.adminUpdateTotalSeatsOfaBatch();

		}

}
