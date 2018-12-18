package lk.ijse.edu.thogakade.dao;

import lk.ijse.edu.thogakade.dao.custom.impl.ItemDAOImpl;

public class DAOFactory {
    public enum DAOTypes{
        ITEM,ORDER,CUSTOMER;
    }

    private static DAOFactory daoFactory;

    private DAOFactory(){

    }

    public static DAOFactory getInstance(){
        if (daoFactory==null){
            daoFactory=new DAOFactory();
        }
        return daoFactory;
    }

    public <T extends SuperDAO> T getDAO(DAOTypes daoTypes){
        switch (daoTypes) {
            case ITEM:
                return (T) new ItemDAOImpl();
            case ORDER:
                return null;
            case CUSTOMER:
                return null;
                
            default:
                return null;


        }
    }


}
