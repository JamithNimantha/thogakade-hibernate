package lk.ijse.edu.thogakade.dao.custom.impl;

import lk.ijse.edu.thogakade.dao.custom.ItemDAO;
import lk.ijse.edu.thogakade.entity.Item;
import lk.ijse.edu.thogakade.resource.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class ItemDAOImpl implements ItemDAO {
    private SessionFactory sessionFactory;

    public ItemDAOImpl() {
        sessionFactory= HibernateUtil.getSessionFactory();
    }

    @Override
    public boolean save(Item entity) throws Exception{
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            session.save(entity);
            session.getTransaction().commit();
        }
        return true;
    }

    @Override
    public boolean update(Item entity) throws Exception {
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            session.update(entity);
            session.getTransaction().commit();
        }
        return true;
    }

    @Override
    public boolean delete(Item entity) throws Exception {
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            session.delete(entity);
            session.getTransaction().commit();
        }
        return true;
    }

    @Override
    public List<Item> getAll() throws Exception {
        List itemList;
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            itemList = session.createQuery("FROM " + Item.class.getName()).list();
            session.getTransaction().commit();
        }
        return itemList;
    }

    @Override
    public Item search(String s) throws Exception {
        Item item;
        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
             item= session.get(Item.class, s);
            session.getTransaction().commit();
        }
        return item;
    }
}
