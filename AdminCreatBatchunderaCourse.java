package usecase;

import dao.Dao;
import dao.DaoImpl;
import java.util.*;
	
	public class AdminCreatBatchunderaCourse {
		public AdminCreatBatchunderaCourse() {
			Scanner sc = new Scanner(System.in);
			Dao daoObj = new DaoImpl();
			System.out.println("Enter Course name:");
			String cName = sc.next().toUpperCase();
			System.out.println("Enter Batch no:");
			int bId = sc.nextInt();
			System.out.println("Enter total seats in this batch: ");
			int totalSeats = sc.nextInt();
			daoObj.adminCreatBatchunderaCourse(cName, bId, totalSeats);

		}
	}



