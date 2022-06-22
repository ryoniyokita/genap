/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genap;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Genap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String awal = JOptionPane.showInputDialog("Masukkan Batas Awal :");
        String akhir = JOptionPane.showInputDialog("Masukkan Batas Akhir :");
        int genap = Integer.parseInt(awal);
        int gnp = Integer.parseInt(akhir);
        
        for(int i=genap; i<=gnp; i++)
       if (i % 2 == 0){
   System.out.print(i + " ");
    }

    }
    
}
