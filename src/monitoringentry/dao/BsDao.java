/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao;

import java.util.List;
import javax.persistence.Query;
import monitoringentry.entity.Bs;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class BsDao extends DaoService<Bs>{
    
    private BsDao() {
        super(Bs.class);
    }
    
    public static BsDao getInstance() {
        return BsDaoHolder.INSTANCE;
    }
    
    private static class BsDaoHolder {

        private static final BsDao INSTANCE = new BsDao();
    }
    
    public List<Bs> getBsByDesa(Object kodeDesa){
        Query query = entity().createQuery("SELECT b FROM Bs b where b.kodedesa='"+kodeDesa+"'",Bs.class);
        return query.getResultList();
    }
}
