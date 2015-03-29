/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao;

import monitoringentry.entity.B5;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class B5Dao extends DaoService<B5>{
    
    private B5Dao() {
        super(B5.class);
    }
    
    public static B5Dao getInstance() {
        return B5DaoHolder.INSTANCE;
    }
    
    private static class B5DaoHolder {

        private static final B5Dao INSTANCE = new B5Dao();
    }

    @Override
    public Object getById(Object id) {
        return entity().find(B5.class, id);
    }
    
}
