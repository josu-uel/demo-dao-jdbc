package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

/* Esta interface estabelece assinaturas/contratos que qualquer classe que
* implemente essa interface devera sobreescrever seus metodos obrigatoriamente.*/

public interface SellerDao {
    void insert (Seller obj);
    void update (Seller obj);
    void deleteById (Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
    List<Seller> findByDepartment(Department department);
}
