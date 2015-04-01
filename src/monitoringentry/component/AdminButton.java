/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.component;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author M Arif Rosyanto
 */
public class AdminButton extends MyButton{
    
    private ImageIcon icon;
    private boolean active;
    
    public AdminButton(){
        
        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        
        icon = new ImageIcon(getClass().getResource("/monitoringentry/image/admin.png"));
        setIcon(icon);
        
        setPreferredSize(new Dimension(268,63));
        setVisible(true);
        setText(null);
        active = false;
        
        
                        
        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/monitoringentry/image/admin-hover.png"));
                setIcon(icon);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(isActive()==true){
                    icon = new ImageIcon(getClass().getResource("/monitoringentry/image/admin-active.png"));
                    setIcon(icon);
                }
                else{
                    resetButton();
                }
            }

            @Override
            public void mousePressed(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/monitoringentry/image/admin-clicked.png"));
                setIcon(icon);
                setActive(true);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                icon = new ImageIcon(getClass().getResource("/monitoringentry/image/admin-active.png"));
                setIcon(icon);
                //setActive(true);
            }
        });
        
    }
    
    public void resetButton(){
        icon = new ImageIcon(getClass().getResource("/monitoringentry/image/admin.png"));
        setIcon(icon);
        setActive(false);
    }

    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
       
        this.active = active;
    }
    
    public void Activebutton(){
        icon = new ImageIcon(getClass().getResource("/monitoringentry/image/admin-active.png"));
        setIcon(icon);
        setActive(true);
    }
}
