/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao;

import javax.persistence.LockModeType;
import monitoringentry.entity.Mahasiswa;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class MahasiswaDao extends DaoService<Mahasiswa>{
    
    private MahasiswaDao() {
        super(Mahasiswa.class);
    }
    
    public static MahasiswaDao getInstance() {
        return MahasiswaDaoHolder.INSTANCE;
    }
    
    private static class MahasiswaDaoHolder {

        private static final MahasiswaDao INSTANCE = new MahasiswaDao();
    }

    @Override
    public Object getById(Object id) {
        return entity().find(Mahasiswa.class, id);
    }
    
    
}
