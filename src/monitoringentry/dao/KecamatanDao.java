/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao;

import java.util.List;
import javax.persistence.Query;
import monitoringentry.entity.Kecamatan;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class KecamatanDao extends DaoService<Kecamatan>{
    
    private KecamatanDao(){
        super(Kecamatan.class);
    }
    
     public static KecamatanDao getInstance() {
        return KecamatanDaoHolder.INSTANCE;
    }
    
    private static class KecamatanDaoHolder {

        private static final KecamatanDao INSTANCE = new KecamatanDao();
    }
    
    public List<Kecamatan> getKecByKab(Object kodeKab){
        Query query = entity().createQuery("SELECT k FROM Kecamatan k where k.idKabupaten='"+kodeKab+"'",Kecamatan.class);
        return query.getResultList();
    }
}
