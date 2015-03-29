/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.component;

import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import monitoringentry.util.BooleanToChecklistRenderer;
import monitoringentry.util.TableColorRender;

/**
 *
 * @author M Arif Rosyanto
 */
public class Table extends JTable {

    private DefaultTableModel model;

    public Table() {
        model = new DefaultTableModel();
    }
}
