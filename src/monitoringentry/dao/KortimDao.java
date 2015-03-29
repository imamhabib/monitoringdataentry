/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao;

import monitoringentry.entity.Kortim;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class KortimDao extends DaoService<Kortim>{
    
    private KortimDao() {
        super(Kortim.class);
    }
    
    public static KortimDao getInstance() {
        return KortimDaoHolder.INSTANCE;
    }
    
    private static class KortimDaoHolder {

        private static final KortimDao INSTANCE = new KortimDao();
    }

    @Override
    public Object getById(Object id) {
        return entity().find(Kortim.class, id);
    }
    
    
}
