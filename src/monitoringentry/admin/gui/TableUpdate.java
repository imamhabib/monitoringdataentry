/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.admin.gui;

import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import java.util.regex.PatternSyntaxException;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import monitoringentry.component.KuesionerTableModel;
import monitoringentry.component.Table;
import monitoringentry.dao.BsDao;
import monitoringentry.dao.DesaDao;
import monitoringentry.dao.KabupatenDao;
import monitoringentry.dao.KecamatanDao;
import monitoringentry.entity.B1;
import monitoringentry.entity.B2;
import monitoringentry.entity.B3;
import monitoringentry.entity.B4;
import monitoringentry.entity.B5;
import monitoringentry.entity.Bs;
import monitoringentry.entity.Desa;
import monitoringentry.entity.Kabupaten;
import monitoringentry.entity.Kecamatan;
import monitoringentry.util.CleanErrorRenderer;
import monitoringentry.util.LockRenderer;
import monitoringentry.util.TableColorRender;

/**
 *
 * @author M Arif Rosyanto
 */
public class TableUpdate extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    private KuesionerTableModel tableModel;
    private TableModel model;
    private TableRowSorter<KuesionerTableModel> sorter;
    private B1 b1;
    private B2 b2;
    private B3 b3;
    private B4 b4;
    private B5 b5;
    private List<B4> setB4;

    public TableUpdate() {
        initComponents();
        initView();

        inisialisasi();
        initListener();
        initDataKab();
    }

    private void inisialisasi() {
        tableModel = new KuesionerTableModel();
        table1.setModel(tableModel);
        table1.getColumnModel().getColumn(0).setCellRenderer(new TableColorRender());
        table1.getColumnModel().getColumn(1).setCellRenderer(new TableColorRender());
        table1.getColumnModel().getColumn(2).setCellRenderer(new CleanErrorRenderer());
        table1.getColumnModel().getColumn(3).setCellRenderer(new LockRenderer());
        sorter = new TableRowSorter<>(tableModel);
        table1.setRowSorter(sorter);
        renderTable();
    }

    private void initView() {
        jScrollPane1.getViewport().setOpaque(false);
        setOpaque(false);
        table1.setOpaque(false);
        setPreferredSize(new Dimension(563, 474));
    }

    private void initListener() {
//        table1.addMouseListener(new MouseAdapter() {
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                B1 b1 = ((KuesionerTableModel) table1.getModel()).getB1(table1.convertRowIndexToModel(table1.getSelectedRow()));
//                B2 b2 = (B2) B2Dao.getInstance().getById(b1.getNks());
//                B3 b3 = (B3) B3Dao.getInstance().getById(b1.getNks());
//                B5 b5 = (B5) B5Dao.getInstance().getById(b1.getNks());
//                B6 b6 = (B6) B6Dao.getInstance().getById(b1.getNks());
//
//                if (b1.getB4List().size() == 0) {
//                    setB4 = B4Dao.getInstance().getById(b1);
//                    B4 b4 = setB4.get(0);
//                } else {
//                    setB4 = b1.getB4List();
//                    B4 b4 = b1.getB4List().get(0);
//                }
//
//            }
//
//        });

        comboKabupaten.addItemListener(new ComboKabListener());
        comboKecamatan.addItemListener(new ComboKecListener());
        comboDesa.addItemListener(new ComboDesaListener());
        comboBs.addItemListener(new ComboBsListener());

        textFilter.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                initFilter();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                initFilter();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                initFilter();
            }
        });
    }

    private void initFilter() {
        String text = textFilter.getText();
        if (text.isEmpty() || text.equals("ketikkan nks disini.....")) {
            sorter.setRowFilter(null);
        } else {
            try {
                sorter.setRowFilter(RowFilter.regexFilter(text, 0));
            } catch (PatternSyntaxException e) {
                System.out.println(e);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new monitoringentry.component.Table();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        comboKabupaten = new javax.swing.JComboBox();
        comboKecamatan = new javax.swing.JComboBox();
        comboDesa = new javax.swing.JComboBox();
        comboBs = new javax.swing.JComboBox();
        textFilter = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setOpaque(false);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(table1);
        table1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 79, 123));
        jLabel1.setText("DAFTAR RUMAH TANGGA");

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 79, 123));
        jLabel2.setText("Provinsi");

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(45, 79, 123));
        jLabel3.setText("Kabupaten");

        jLabel4.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(45, 79, 123));
        jLabel4.setText("Kecamataan");

        jLabel5.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 79, 123));
        jLabel5.setText("Desa");

        jLabel6.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(45, 79, 123));
        jLabel6.setText("NBS");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jawa Barat(32)" }));

        comboKecamatan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboDesa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboBs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        textFilter.setText("ketikkan nks disini.....");
        textFilter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFilterFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFilterFocusLost(evt);
            }
        });

        jLabel8.setText("Data masuk : ");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, table1, org.jdesktop.beansbinding.ELProperty.create("${model.rowCount}"), jLabel9, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(185, 185, 185))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBs, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboDesa, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboKecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboKabupaten, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboKabupaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboKecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboDesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboBs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void textFilterFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFilterFocusGained
        textFilter.setText("");
    }//GEN-LAST:event_textFilterFocusGained

    private void textFilterFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFilterFocusLost
        textFilter.setText("ketikkan nks disini.....");
    }//GEN-LAST:event_textFilterFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboBs;
    private javax.swing.JComboBox comboDesa;
    private javax.swing.JComboBox comboKabupaten;
    private javax.swing.JComboBox comboKecamatan;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private monitoringentry.component.Table table1;
    private javax.swing.JTextField textFilter;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public void refreshTable() {
        ((KuesionerTableModel) table1.getModel()).update();
    }

    private void renderTable() {
//        table1.setDefaultRenderer(Boolean.class, new RenderWarnaTable());
    }

    private void initDataKab() {
        for (Object kab : KabupatenDao.getInstance().getAll()) {
            comboKabupaten.addItem(kab);
        }
    }

    private void initDataKec() {
        comboKecamatan.removeAllItems();
        Kabupaten kab = (Kabupaten) comboKabupaten.getSelectedItem();
        for (Kecamatan k : KecamatanDao.getInstance().getKecByKab(kab.getId())) {
            comboKecamatan.addItem(k);
        }
    }

    private void initDataDesa() {
        comboDesa.removeAllItems();
        Kecamatan kec = (Kecamatan) comboKecamatan.getSelectedItem();
        if (kec != null) {
            for (Desa d : DesaDao.getInstance().getDesaByKec(kec.getId())) {
                comboDesa.addItem(d);
            }
        }
    }

    private void initDataBs() {
        comboBs.removeAllItems();
        Desa desa = (Desa) comboDesa.getSelectedItem();
        if (desa != null) {
            for (Bs b : BsDao.getInstance().getBsByDesa(desa.getId())) {
                comboBs.addItem(b);
            }
        }
    }

    class ComboKecListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
//            initDataKec();
            initDataDesa();
            initDataBs();
            Kecamatan k = (Kecamatan) comboKecamatan.getSelectedItem();
            if (k != null) {
                ((KuesionerTableModel) table1.getModel()).updateByKec(k);
            }
        }

    }

    class ComboKabListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            initDataKec();
            initDataDesa();
            Kabupaten k = (Kabupaten) comboKabupaten.getSelectedItem();
            if (k != null) {
                ((KuesionerTableModel) table1.getModel()).updateByKab(k);
            }
        }
    }

    class ComboDesaListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            initDataBs();
            Desa d = (Desa) comboDesa.getSelectedItem();
            if (d != null) {
                ((KuesionerTableModel) table1.getModel()).updateByDesa(d);
            }
        }
    }

    class ComboBsListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            Bs b = (Bs) comboBs.getSelectedItem();
            if (b != null) {
                ((KuesionerTableModel) table1.getModel()).updateByBs(b);
            }
        }

    }

    public Table getTable1() {
        return table1;
    }


}
