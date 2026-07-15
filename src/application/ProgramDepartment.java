package application;

import java.util.List;

import model.dao.DepartmentDao;
import model.dao.FactoryDao;
import model.entities.Department;


public class ProgramDepartment {
	public static void main(String[]args) {
	
	DepartmentDao departmentDao = FactoryDao.createDepartmentDao();
	System.out.println("~~~~TEST 1: department findById~~~~");
	Department department = departmentDao.findById(2);
	System.out.println(department);
	
	System.out.println("\n~~~~ TEST 2: findAll ~~~~");
	List<Department> list = departmentDao.findAll();
	for (Department d : list) {
		System.out.println(d);
	}
	
	System.out.println("\n~~~~TEST 3: insert~~~~");
	Department newDepartment = new Department(null,"RH");
	departmentDao.insert(newDepartment);
	
	System.out.println("Inserted! New id = "+ newDepartment.getId());
	}
}
