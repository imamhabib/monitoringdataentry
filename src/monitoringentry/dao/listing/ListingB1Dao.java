/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao.listing;

import java.util.List;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import org.eclipse.persistence.internal.jpa.querydef.CriteriaBuilderImpl;
import monitoringentry.entity.listing.ListingB1;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class ListingB1Dao extends DaoService<ListingB1> {

    private ListingB1Dao() {
        super(ListingB1.class);
    }

    public static ListingB1Dao getInstance() {
        return ListingB1DaoHolder.INSTANCE;
    }


    private static class ListingB1DaoHolder {

        private static final ListingB1Dao INSTANCE = new ListingB1Dao();
    }

    public List<ListingB1> getByKec(Object kodeObject) {
        TypedQuery<ListingB1> query = entity().createQuery("select b from B1 b where b.b1r2='" + kodeObject + "'", ListingB1.class);
        return query.getResultList();
    }

    public List<ListingB1> getToFrom(int from, int to) {
        Query query = entity().createQuery("SELECT b FROM B1 b").setMaxResults(to - from).setFirstResult(from);
        return query.getResultList();
    }

    public Long getRowCount() {
        return (Long) entity().createQuery("SELECT COUNT(b) from B1 b").getSingleResult();
    }
    
    @Override
    public List<Object> getAll() {
        return entity().createQuery("Select b from B1 b").getResultList();
    }
    
    public List<ListingB1> getList(){
        return entity().createQuery("Select b from B1 b").getResultList();
    }
    
    public List<ListingB1> getByBs(Object bs) {
        Query query = entity().createQuery("SELECT b FROM B1 b WHERE b.nks LIKE '"+bs+"%'");
        return query.getResultList();
    }
    
    public List<ListingB1> getByDesa(Object desa) {
        Query query = entity().createQuery("SELECT b FROM B1 b WHERE b.nks LIKE '"+desa+"%'");
        return query.getResultList();
    }
    
    public List<ListingB1> getByKec(String kec) {
        Query query = entity().createQuery("SELECT b FROM B1 b WHERE b.nks LIKE '"+kec+"%'");
        return query.getResultList();
    }
    
    public List<ListingB1> getByKab(Object kab) {
        Query query = entity().createQuery("SELECT b FROM B1 b WHERE b.nks LIKE '"+kab+"%'");
        return query.getResultList();
    }

    @Override
    public Object getById(Object id) {
       return entity().find(ListingB1.class, id);
    }
    
}
