/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myuploaderclient;

import interfaz.VentanaPrincipal;
import javax.swing.JOptionPane;
import mundo.Conexion;

/**
 *
 * @author DMHA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        VentanaPrincipal dialog = new VentanaPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
    }

}
