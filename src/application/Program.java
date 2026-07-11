package application;

import model.entities.Department;
import model.entities.Seller;
import java.util.Date;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(6, "Music");
		
		Seller seller = new Seller(120,"Victor","victor@gmail.com",new Date(),1621.00,obj);
		
		System.out.println(seller);
	}
}