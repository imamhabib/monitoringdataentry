/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao;

import monitoringentry.entity.B6;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class B6Dao extends DaoService<B6>{
    
    private B6Dao() {
        super(B6.class);
    }
    
    public static B6Dao getInstance() {
        return B6DaoHolder.INSTANCE;
    }
    
    private static class B6DaoHolder {

        private static final B6Dao INSTANCE = new B6Dao();
    }

    @Override
    public Object getById(Object id) {
        return entity().find(B6.class, id);
    }
    
}
