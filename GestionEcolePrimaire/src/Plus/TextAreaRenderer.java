/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plus;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Almia
 */
public class TextAreaRenderer extends JTextArea
    implements TableCellRenderer {

    public TextAreaRenderer() {
    setLineWrap(true);
    setWrapStyleWord(true);    
    }

    public Component getTableCellRendererComponent(JTable jTable,
      Object obj, boolean isSelected, boolean hasFocus, int row,
      int column) {
        if(isSelected)
            setBackground(Color.LIGHT_GRAY);
        else setBackground(Color.WHITE);
        
    setText((String)obj);
    return this;
    }
    }