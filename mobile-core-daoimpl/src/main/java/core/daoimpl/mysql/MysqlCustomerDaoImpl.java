package core.daoimpl.mysql;

import core.dao.CustomerDao;
import core.daoimpl.factory.DAOFactory;
import core.daoimpl.factory.MysqlDAOFactory;
import core.dto.model.customer.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MysqlCustomerDaoImpl implements CustomerDao{
    Connection con = null;
    PreparedStatement pr = null;
    ResultSet rs = null;

    public MysqlCustomerDaoImpl() {
        con = MysqlDAOFactory.createConnection();
    }

    public void addCustomer(Customer customer) {
        String sql = "INSERT INTO tets(id, tetscol) VALUES(16,1)";
        try {
            pr = con.prepareStatement(sql);
            pr.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        DAOFactory daoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        CustomerDao customerDao = daoFactory.getCustomerDao();
        customerDao.addCustomer(null);
    }

    /*To do everything in here*/
}
