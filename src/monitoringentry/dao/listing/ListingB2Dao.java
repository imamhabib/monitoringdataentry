/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao.listing;

import monitoringentry.entity.listing.ListingB2;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class ListingB2Dao extends DaoService<ListingB2>{
    
    private ListingB2Dao() {
        super(ListingB2.class);
    }
    
    public static ListingB2Dao getInstance() {
        return ListingB2DaoHolder.INSTANCE;
    }
    
    private static class ListingB2DaoHolder {

        private static final ListingB2Dao INSTANCE = new ListingB2Dao();
    }

    @Override
    public Object getById(Object id) {
        return entity().find(ListingB2.class, id);
    }
    
}
