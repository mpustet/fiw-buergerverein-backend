package com.buergervereinHSH.BackendProject.auth.dataAccessObject;

//wird überflüssig mit CRUD?

import com.buergervereinHSH.BackendProject.auth.model.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class UserDaoImpl {

    @Autowired
    private EntityManager em;

    public User save(User user) {
        Session session = em.unwrap(Session.class);
        session.persist(user);
        return user;
    }


}