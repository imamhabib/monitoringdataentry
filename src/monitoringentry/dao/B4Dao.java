/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.dao;

import java.util.List;
import java.util.Vector;
import javax.persistence.Query;
import monitoringentry.entity.B4;
import monitoringentry.util.DaoService;

/**
 *
 * @author Habib
 */
public class B4Dao extends DaoService<B4>{
    
    private Vector<B4> listB4 = new Vector<>();
    
    private B4Dao() {
        super(B4.class);
    }
    
    public static B4Dao getInstance() {
        return B4DaoHolder.INSTANCE;
    }
    
    private static class B4DaoHolder {

        private static final B4Dao INSTANCE = new B4Dao();
    }
    
    public void saveLoop(List<B4> setB4){
        entity().getTransaction().begin();
        for (B4 b4 :setB4) {
            entity().merge(b4);
            entity().flush();
            entity().clear();
        }
         entity().getTransaction().commit();
    }

    public Vector<B4> getListB4() {
        return listB4;
    }

    public void setListB4(Vector<B4> listB4) {
        this.listB4 = listB4;
        System.out.println(this.listB4.get(0).getNksKapal());
    }
    
    public void addB4toList(B4 b4){
        listB4.add(b4);
    }

    public List<B4> getById(Object id){
       Query q = entity().createQuery("SELECT b FROM B4 b where b.nksB1=:id",B4.class);
       q.setParameter("id", id);
       return q.getResultList();
    }
    
}
