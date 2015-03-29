/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao;

import java.util.List;
import javax.persistence.Query;
import monitoringentry.entity.Desa;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class DesaDao extends DaoService<Desa>{
    
    private DesaDao(){
        super(Desa.class);
    }
    
     public static DesaDao getInstance() {
        return DesaDaoHolder.INSTANCE;
    }
    
    private static class DesaDaoHolder {

        private static final DesaDao INSTANCE = new DesaDao();
    }
    
    public List<Desa> getDesaByKec(Object kodeKec){
        Query query = entity().createQuery("SELECT d FROM Desa d where d.idKecamatan='"+kodeKec+"'",Desa.class);
        return query.getResultList();
    }
    
}
