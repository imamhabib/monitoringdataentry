/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl54.util;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Habib
 */
public class JPAConnector {

    private static EntityManager entityManager;
    private static EntityManagerFactory emf;

    public static EntityManager getEntity() {
        Map<String, String> properties = new HashMap<String, String>();
        JPAConfigManager jPAConfigManager = new JPAConfigManager();
        JPAConfig j = jPAConfigManager.readConfig();
        properties.put("javax.persistence.jdbc.url", "jdbc:mysql://"+j.getUrl()+":"+j.getPort()+"/"+j.getDbName());
        properties.put("javax.persistence.jdbc.user", j.getUser());
        properties.put("javax.persistence.jdbc.password", j.getPassword());

        emf = Persistence.createEntityManagerFactory("MonitoringEntryPU", properties);
        entityManager = emf.createEntityManager();

        return entityManager;
    }
    
    public static void close(){
        entityManager.close();
        emf.close();
    }
}
