package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    static void main() {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== TEST 1: department findById ===");
        Department department =  departmentDao.findById(2);
        System.out.println(department);

        System.out.println();
        System.out.println("=== TEST 2: department findByAll ===");
        List<Department> list =  departmentDao.findAll();
        for(Department obj : list) {
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("=== TEST 4: department insert ===");
        Department newDepartment = new Department(null, "sport equipments");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println();
        System.out.println("=== TEST 5: department update ===");
        department = departmentDao.findById(1);
        department.setName("utilities");
        departmentDao.update(department);
        System.out.println("updated! completed!");

        System.out.println();
        System.out.println("=== TEST 6: department DELETE ===");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("deleted completed");
        sc.close();
    }
}
