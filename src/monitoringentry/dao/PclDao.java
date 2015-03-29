/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao;

import monitoringentry.entity.Pcl;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class PclDao extends DaoService<Pcl>{
    
    private PclDao() {
        super(Pcl.class);
    }
    
    public static PclDao getInstance() {
        return PclDaoHolder.INSTANCE;
    }
    
    private static class PclDaoHolder {

        private static final PclDao INSTANCE = new PclDao();
    }

    @Override
    public Object getById(Object id) {
        return entity().find(Pcl.class, id);
    }
    
    
}
