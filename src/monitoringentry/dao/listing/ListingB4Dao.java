/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao.listing;

import java.util.List;
import java.util.Vector;
import javax.persistence.Query;
import monitoringentry.entity.listing.ListingB4;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class ListingB4Dao extends DaoService<ListingB4>{
    
  
    
    private ListingB4Dao() {
        super(ListingB4.class);
    }
    
    public static ListingB4Dao getInstance() {
        return ListingB4DaoHolder.INSTANCE;
    }
    
    private static class ListingB4DaoHolder {

        private static final ListingB4Dao INSTANCE = new ListingB4Dao();
    }


    public List<ListingB4> getById(Object id){
       Query q = entity().createQuery("SELECT b FROM B4 b where b.nksB1=:id",ListingB4.class);
       q.setParameter("id", id);
       return q.getResultList();
    }
    
}
