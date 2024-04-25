package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DepartmentDao depDao = DaoFactory.createDepartmentDAO();

		System.out.println("\n*** TEST 1: seller insert *** ");
		Department newDep = new Department(null, "Music");
		depDao.insert(newDep);
		System.out.println("Inserted! New id = " + newDep.getId());

		System.out.println("\n*** TEST 2: seller findById *** ");
		Department department = depDao.findById(1);
		System.out.println(department);

		System.out.println("\n*** TEST 3: seller update *** ");
		department = depDao.findById(8);
		department.setName("Clothers");
		depDao.update(department);
		System.out.println("Update complete");

		System.out.println("\n=== TEST 4: seller findyByAll === ");
		List<Department> list = depDao.findAll();
		for (Department depart : list) {
			System.out.println(depart);
			System.out.println();
		}

		sc.close();
	}

}
