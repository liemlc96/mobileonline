package api;

import core.dao.CustomerDao;
import core.daoimpl.factory.DAOFactory;

public class Test {

    @org.junit.Test
    public void daoTest(){
        DAOFactory daoFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        CustomerDao customerDao = daoFactory.getCustomerDao();
        customerDao.addCustomer(null);
        /**/
    }

}
