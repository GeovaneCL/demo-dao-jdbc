package application;

import model.dao.DepartmentDao;
import model.dao.FactoryDao;

import model.entities.Department;

public class ProgramDepartment {
	public static void main(String[]args) {
	Department department = new Department(8,"Ifood");
	
	DepartmentDao departmentDao = FactoryDao.createDepartmentDao();
	
	System.out.println(department);
	}
}
