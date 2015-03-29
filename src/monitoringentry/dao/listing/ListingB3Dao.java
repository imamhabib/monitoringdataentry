/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao.listing;

import monitoringentry.entity.listing.ListingB3;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class ListingB3Dao extends DaoService<ListingB3>{
    
    private ListingB3Dao() {
        super(ListingB3.class);
    }
    
    public static ListingB3Dao getInstance() {
        return ListingB3DaoHolder.INSTANCE;
    }
    
    private static class ListingB3DaoHolder {

        private static final ListingB3Dao INSTANCE = new ListingB3Dao();
    }

    @Override
    public Object getById(Object id) {
        return entity().find(ListingB3.class, id);
    }
    
}
