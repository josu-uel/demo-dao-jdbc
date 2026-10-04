package model.dao;

import model.entities.Department;
import java.util.List;

/* Esta interface estabelece os assinatura/contratos que qualquer classe que
*  implemente essa interface deve sobreescrever esses metodos */


/* Os metododos estabelence assinaturas para a manipulação do BD */

public interface DepartmentDao {
    void insert (Department obj);
    void update (Department obj);
    void deleteById (Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
