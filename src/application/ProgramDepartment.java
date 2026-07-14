package application;

import model.dao.DepartmentDao;
import model.dao.FactoryDao;
import model.entities.Department;

public class ProgramDepartment {
	public static void main(String[]args) {
	
	DepartmentDao departmentDao = FactoryDao.createDepartmentDao();
	Department department = departmentDao.findById(2);
	System.out.println(department);
	}
}
