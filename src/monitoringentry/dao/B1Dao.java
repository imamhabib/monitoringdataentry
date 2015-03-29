/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao;

import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import monitoringentry.entity.B1;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class B1Dao extends DaoService<B1> {

    private B1Dao() {
        super(B1.class);
    }

    public static B1Dao getInstance() {
        return B1DaoHolder.INSTANCE;
    }


    private static class B1DaoHolder {

        private static final B1Dao INSTANCE = new B1Dao();
    }

    public List<B1> getByKec(Object kodeObject) {
        TypedQuery<B1> query = entity().createQuery("select b from B1 b where b.b1r2='" + kodeObject + "'", B1.class);
        return query.getResultList();
    }

    public List<B1> getToFrom(int from, int to) {
        Query query = entity().createQuery("SELECT b FROM B1 b").setMaxResults(to - from).setFirstResult(from);
        return query.getResultList();
    }

    public Long getRowCount() {
        return (Long) entity().createQuery("SELECT COUNT(b) from B1 b").getSingleResult();
    }
    
    public Long getCleanCount(){
        return (Long) entity().createQuery("SELECT COUNT(b) from B1 b where b.cleanFlag=true").getSingleResult();
    }
    
    @Override
    public List<Object> getAll() {
        return entity().createQuery("Select b from B1 b").getResultList();
    }
    
    public List<B1> getList(){
        return entity().createQuery("Select b from B1 b").getResultList();
    }
    
    public List<B1> getByBs(Object bs) {
        Query query = entity().createQuery("SELECT b FROM B1 b WHERE b.nks LIKE '"+bs+"%'");
        return query.getResultList();
    }
    
    public List<B1> getByDesa(Object desa) {
        Query query = entity().createQuery("SELECT b FROM B1 b WHERE b.nks LIKE '"+desa+"%'");
        return query.getResultList();
    }
    
    public List<B1> getByKec(String kec) {
        Query query = entity().createQuery("SELECT b FROM B1 b WHERE b.nks LIKE '"+kec+"%'");
        return query.getResultList();
    }
    
    public List<B1> getByKab(Object kab) {
        Query query = entity().createQuery("SELECT b FROM B1 b WHERE b.nks LIKE '"+kab+"%'");
        return query.getResultList();
    }

    @Override
    public Object getById(Object id) {
       return entity().find(B1.class, id);
    }
    
}
