/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl54.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Habib
 */
public class JPAConfigManager {
    
    private JPAConfig jCfg;
    private ObjectInputStream objectInputStream;
    private ObjectOutputStream objectOutputStream;

    public JPAConfig readConfig() {
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("JPAconfig.pkl54"));
            try {
                jCfg =((JPAConfig) objectInputStream.readObject());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(JPAConfig.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(JPAConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jCfg;
    }

    public void saveConfig(JPAConfig j) {
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("JPAconfig.pkl54"));
            objectOutputStream.writeObject(j);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(JPAConfig.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(JPAConfig.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
