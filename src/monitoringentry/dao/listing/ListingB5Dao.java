/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao.listing;

import monitoringentry.entity.listing.ListingB5;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class ListingB5Dao extends DaoService<ListingB5>{
    
    private ListingB5Dao() {
        super(ListingB5.class);
    }
    
    public static ListingB5Dao getInstance() {
        return ListingB5DaoHolder.INSTANCE;
    }
    
    private static class ListingB5DaoHolder {

        private static final ListingB5Dao INSTANCE = new ListingB5Dao();
    }

    @Override
    public Object getById(Object id) {
        return entity().find(ListingB5.class, id);
    }
    
}
