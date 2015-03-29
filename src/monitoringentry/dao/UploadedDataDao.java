/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao;

import javax.persistence.Query;
import monitoringentry.entity.Uploadeddata;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class UploadedDataDao extends DaoService<Uploadeddata> {

    private UploadedDataDao() {
        super(Uploadeddata.class);
    }

    public static UploadedDataDao getInstance() {
        return UploadedDataDaoHolder.INSTANCE;
    }

    private static class UploadedDataDaoHolder {

        private static final UploadedDataDao INSTANCE = new UploadedDataDao();
    }
    
    public String getUploadedDataByNim(String s){
        Query query = entity().createQuery("SELECT COUNT(c) FROM Uploadeddata c where c.aksi='insert' AND c.uploader='" + s + "'",Long.class);
        Long l = (Long) query.getSingleResult();
        return l.toString();
    }
}
