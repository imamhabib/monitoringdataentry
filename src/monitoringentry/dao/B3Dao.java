/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao;

import monitoringentry.entity.B3;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class B3Dao extends DaoService<B3>{
    
    private B3Dao() {
        super(B3.class);
    }
    
    public static B3Dao getInstance() {
        return B3DaoHolder.INSTANCE;
    }
    
    private static class B3DaoHolder {

        private static final B3Dao INSTANCE = new B3Dao();
    }

    @Override
    public Object getById(Object id) {
        return entity().find(B3.class, id);
    }
    
}
