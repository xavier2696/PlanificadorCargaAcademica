
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xavier2696
 */
public class MyListCellRenderer2 extends DefaultListCellRenderer {

        @Override
        public Component getListCellRendererComponent(
                JList list, Object value, int index,
                boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            Alumno label = (Alumno) value;
            String name = label.getNombre();
            String clases = label.getClasesString();
            String labelText = "<html>Nombre: " + name + "<br/>" + clases+"<br/><br/>";
            setText(labelText);

            return this;
        }

    }
