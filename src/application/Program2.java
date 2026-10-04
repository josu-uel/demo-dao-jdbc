package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program2 {
    static void main() {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();


        System.out.println("=== TEST 1: department findById ===");
        Department department =  departmentDao.findById(2);
        System.out.println(department);

        System.out.println();
        System.out.println("=== TEST 2: department findByAll ===");
        List<Department> list =  departmentDao.findAll();
        for(Department obj : list) {
            System.out.println(obj);
        }
    }
}
