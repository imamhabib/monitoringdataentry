/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao;

import java.util.List;
import monitoringentry.entity.Kabupaten;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class KabupatenDao extends DaoService<Kabupaten>{
    
    private KabupatenDao() {
        super(Kabupaten.class);
    }
    
    public static KabupatenDao getInstance() {
        return KabupatenDaoHolder.INSTANCE;
    }
    
    private static class KabupatenDaoHolder {

        private static final KabupatenDao INSTANCE = new KabupatenDao();
    }

    @Override
    public List<Object> getAll() {
        return entity().createQuery("SELECT k FROM Kabupaten k").getResultList();
    }
    
}
