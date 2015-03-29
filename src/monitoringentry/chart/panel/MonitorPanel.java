/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.chart.panel;

import java.awt.Dimension;
import monitoringentry.chart.CleanDataChart;
import monitoringentry.chart.UploadedDataChart;

/**
 *
 * @author Habib
 */
public class MonitorPanel extends javax.swing.JPanel {

    /**
     * Creates new form MonitorPanel
     */
    public MonitorPanel() {
        initComponents();
        setPreferredSize(new Dimension(800, 650));
        initChart();
    }
    private void initChart() {
        dataMasukPanel.setPreferredSize(new Dimension(300, 300));
        dataMasukPanel.add(new UploadedDataChart());
        cleanDataPanel.setPreferredSize(new Dimension(300, 300));
        cleanDataPanel.add(new CleanDataChart());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dataMasukPanel = new javax.swing.JPanel();
        cleanDataPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        dataMasukPanel.setLayout(new java.awt.BorderLayout());
        jPanel1.add(dataMasukPanel);

        cleanDataPanel.setLayout(new java.awt.BorderLayout());
        jPanel1.add(cleanDataPanel);
        jPanel1.add(jPanel5);
        jPanel1.add(jPanel6);

        add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setPreferredSize(new java.awt.Dimension(10, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MONITORING ENTRY DATA PKL 54 BIDANG EKONOMI");
        jPanel2.add(jLabel1);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cleanDataPanel;
    private javax.swing.JPanel dataMasukPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables

    
}
