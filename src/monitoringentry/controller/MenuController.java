/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.controller;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import monitoringentry.admin.gui.PanelMaster;
import monitoringentry.panelcomponent.SidebarButton;

/**
 *
 * @author M Arif Rosyanto
 */
public class MenuController {
    private CardLayoutController controller;
    private JPanel MainPanel;
    private SidebarButton sidebarButton;
    private PanelMaster master;

    public MenuController(PanelMaster master, JPanel MainPanel, SidebarButton sidebarButton) {
        this.MainPanel = MainPanel;
        this.sidebarButton = sidebarButton;
        this.master = master;
        
        controller = new CardLayoutController();
        controller.setCardLayout((CardLayout) MainPanel.getLayout());
        controller.setParentCard(MainPanel);
        
        sidebarButton.getDashboardButton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                controller.show("dashboard");
                master.getLineHeader().setBackground(new Color(222, 96, 99));
            }
        });
        
        sidebarButton.getAdminButton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                controller.show("admin");
                master.getLineHeader().setBackground(new Color(85, 167, 226));
            }
        });
        
        sidebarButton.getAdminButton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                controller.show("users");
                master.getLineHeader().setBackground(new Color(154, 91, 225));
            }
        });
        
        sidebarButton.getLogoutButton1().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                controller.show("logout");
                master.getLineHeader().setBackground(new Color(99, 165, 151));
            }
        });
    }
    
}
