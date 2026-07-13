package application;

import model.dao.FactoryDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = FactoryDao.createSellerDao();
		
		System.out.println("----TEST 1: seller findById----");
		Seller seller = sellerDao.findById(2);
		
		System.out.println(seller);
	}
}
