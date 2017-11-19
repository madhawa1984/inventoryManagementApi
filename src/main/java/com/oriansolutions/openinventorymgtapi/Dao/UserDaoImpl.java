package com.oriansolutions.openinventorymgtapi.Dao;

import com.oriansolutions.openinventorymgtapi.model.User;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by madhawa on 11/19/17.
 */
@Service("userServiceBean")
public class UserDaoImpl implements UserDao {
    @Qualifier("sessionFactoryBean")
    @Autowired
    private SessionFactory sesionFactory;


    @Override
    public User getUserById(long IdValue) throws Exception {
        Session session = null;
        User userInstance = null;
        try {
            session = this.sesionFactory.openSession();
            //session = this.sessionFactoryBean.getCurrentSession();
            org.hibernate.query.Query query = session.createQuery("from User where Id=:id");
            query.setParameter("id", IdValue);
            List<User> userList = query.list();
            if (!userList.isEmpty()) {
                userInstance = userList.get(0);
                // initialize the other relationships
                // Hibernate.initialize(userInstance.getOtherRelationoships());
            }
            session.clear();
            session.close();



        }catch(Exception e) {
            throw new Exception(); // check on this

        }finally {
            if(session!=null) {
                session.close();
            }
        }
        return userInstance;
    }

    @Override
    public void createUser(User user) throws Exception {
        Session session=null;
        try {
            session = this.sesionFactory.openSession();
            //session = this.sessionFactoryBean.getCurrentSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
            session.clear();
            session.close();
        }catch(Exception e) {
            e.printStackTrace();
            throw new Exception();

        }finally {
            if(session!=null) {
                session.close();
            }
        }

    }

    @Override
    public void modifyUser(User user) throws Exception {

    }

    @Override
    public void dropUser(User user) throws Exception {

    }
}
