package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

/*  Esta classe foi criada para realizar a injeção de dependencia
*   instanciando um objeto do tipo sellerDaoJDBC, passando como argumento
*   um metodo static da classe DB para que seja feita a conexao com o banco de dados. */

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
