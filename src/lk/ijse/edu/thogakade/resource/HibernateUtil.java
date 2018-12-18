package lk.ijse.edu.thogakade.resource;

import lk.ijse.edu.thogakade.entity.Item;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        StandardServiceRegistry registry= new StandardServiceRegistryBuilder().loadProperties("../hibernate.properties").build();
        Metadata metadata = new MetadataSources(registry)
                .addAnnotatedClass(Item.class)
                .buildMetadata();
        return metadata.getSessionFactoryBuilder().build();

    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
