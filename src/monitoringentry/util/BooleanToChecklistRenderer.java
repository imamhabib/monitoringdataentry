/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monitoringentry.util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author M Arif Rosyanto
 */
public class BooleanToChecklistRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        JCheckBox checkBox = new JCheckBox();
        Boolean b = (Boolean)o;
        
        if(b){
            checkBox.setText("Clean");
        } else {
            checkBox.setText("Error");
             checkBox.setForeground(Color.red);
        }
        
        checkBox.setSelected(b);
        checkBox.setOpaque(true);
        checkBox.setFont(checkBox.getFont().deriveFont(Font.PLAIN));
        
//        if(bln){
//            checkBox.setBackground(jtable.getSelectionBackground());
//            checkBox.setForeground(Color.white);
//        } else {
//            checkBox.setBackground(jtable.getBackground());
//        }
        
        return checkBox;
    }
    
}
