/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao;

import monitoringentry.entity.Uploaddata;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class UploadedDao extends DaoService<Uploaddata>{
    
    private UploadedDao() {
        super(Uploaddata.class);
    }
    
    public static UploadedDao getInstance() {
        return UploadedDaoHolder.INSTANCE;
    }
    
    private static class UploadedDaoHolder {

        private static final UploadedDao INSTANCE = new UploadedDao();
    }
    
    public Long getUploadCount() {
        return (Long) entity().createQuery("SELECT COUNT(nim) from uploaddata nim").getSingleResult();
    }
}
