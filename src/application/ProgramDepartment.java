package application;

import model.dao.DepartmentDao;
import model.dao.FactoryDao;
import model.entities.Department;

public class ProgramDepartment {
	public static void main(String[]args) {
	
	DepartmentDao departmentDao = FactoryDao.createDepartmentDao();
	System.out.println("~~~~TEST 1: department findById~~~~");
	Department department = departmentDao.findById(2);
	System.out.println(department);
	}
}
