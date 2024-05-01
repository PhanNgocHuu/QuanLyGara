/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author huuph
 */
public class MsgBox {
    public static void alert(Object parent, String message) {
        JOptionPane.showMessageDialog((parent instanceof JOptionPane) ? null : (java.awt.Component) parent, message);
    }

 public static boolean confirm(Component parentComponent, String message) {
     
        int option = JOptionPane.showConfirmDialog(parentComponent, message, "Thông Báo", JOptionPane.YES_NO_OPTION);
        return option == JOptionPane.YES_OPTION;
        
    }
}
