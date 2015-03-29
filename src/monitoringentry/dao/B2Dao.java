/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao;

import monitoringentry.entity.B2;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class B2Dao extends DaoService<B2>{
    
    private B2Dao() {
        super(B2.class);
    }
    
    public static B2Dao getInstance() {
        return B2DaoHolder.INSTANCE;
    }
    
    private static class B2DaoHolder {

        private static final B2Dao INSTANCE = new B2Dao();
    }

    @Override
    public Object getById(Object id) {
        return entity().find(B2.class, id);
    }
    
}
