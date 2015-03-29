/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.util;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.RollbackException;
import javax.swing.JOptionPane;
import pkl54.util.AbstractService;
import pkl54.util.JPAConnector;

/**
 *
 * @author Imam Habib Pamungkas <imamhabibpamungkas@gmail.com>
 */
public class DaoService<T> implements AbstractService<Object> {

    private Class<T> model;
    protected EntityManager entityManager = null;
    private EntityManagerFactory emf;

    protected DaoService(Class<T> model) {
        this.model = model;
        //bisa juga diinisialisasi disini sama saja

        entityManager = JPAConnector.getEntity();
    }

    protected EntityManager entity() {
        if (!entityManager.isOpen()) {
            entityManager = JPAConnector.getEntity();
        }
        return entityManager;
    }

    @Override
    public void save(Object t) {
        try {
            // digunakan jika inisialisasi di entitymanager construktor
//            entityManager.getTransaction().begin();
//            entityManager.persist(t);
//            entityManager.getTransaction().commit();
            entity().getTransaction().begin();
            entity().merge(t);
            entity().getTransaction().commit();
        } catch (RollbackException e) {
            String error = e.getCause().getMessage();
            JOptionPane.showMessageDialog(null, error);
//            System.out.println(e.getMessage());
        } finally {
            entity().close();
        }
    }

    @Override
    public void update(Object t) {
        try {
            entity().getTransaction().begin();
            entity().merge(t);
            entity().getTransaction().commit();
        } catch (RollbackException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            entity().getTransaction().rollback();
        } finally {
            entity().close();
        }
    }

    @Override
    public void delete(Object t) {
        try {
            entity().remove(t);
        } catch (RollbackException e) {
            entity().getTransaction().rollback();
        } finally {
            entity().close();
        }
    }

    @Override
    public Object getById(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
