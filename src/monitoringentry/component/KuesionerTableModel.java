/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import monitoringentry.dao.B1Dao;
import monitoringentry.entity.B1;
import monitoringentry.entity.Bs;
import monitoringentry.entity.Desa;
import monitoringentry.entity.Kabupaten;
import monitoringentry.entity.Kecamatan;

/**
 *
 * @author Habib
 */
public class KuesionerTableModel extends AbstractTableModel {

    private int startPosition;
    private List<B1> theList;
    private Vector<String> column;
    private List<B1> row;
    private int counter = 0;

    public KuesionerTableModel() {
        super();
        this.startPosition = 0;
        column = new Vector<>();
        column.add("Nks");
        column.add("Nama Penanggung Jawab");
        column.add("flag");
        column.add("lock");
        row = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return row.size();
    }

    public List<B1> getTheList() {
        return theList;
    }
    
    @Override
    public String getColumnName(int column) {
        return this.column.get(column);
    }

    public void setList(List<B1> list) {
        row = list;
        fireTableDataChanged();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    public B1 getB1(int i){
        return theList.get(i);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        B1 b1 = theList.get(rowIndex);

        Object toReturn = null;
        switch (columnIndex) {
            case 0:
                toReturn = b1.getNks();
                break;
            case 1:
                toReturn = b1.getB1r11();
                break;
            case 2:
                toReturn = b1.getCleanFlag();
                break;
            case 3:
                toReturn = b1.getLockFlag();
                break;
            default:

        }
        return toReturn;
    }

    public void update() {
        theList = B1Dao.getInstance().getList();
        setList(theList);
    }
    
    private List<B1> getItems() {
        return B1Dao.getInstance().getList();
    }

    public void updateByBs(Bs b) {
        theList = B1Dao.getInstance().getByBs(b.getKodebs());
        setList(theList);
    }
    
    public void updateByDesa(Desa d) {
        theList = B1Dao.getInstance().getByBs(d.getId());
        setList(theList);
    }
    
    public void updateByKec(Kecamatan b) {
        theList = B1Dao.getInstance().getByBs(b.getId());
        setList(theList);
    }
    
    public void updateByKab(Kabupaten b) {
        theList = B1Dao.getInstance().getByBs(b.getId());
        setList(theList);
    }
}
