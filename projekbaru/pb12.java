/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projekbaru;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


/**
 *
 * @author PC 12 - LAB R1
 */
public class pb12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       SwingUtilities.invokeLater(() -> {
            int pilihan = JOptionPane.showConfirmDialog(
                null,
                "Pilih Yes atau No?",
                "Pertanyaan",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );

            if (pilihan == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Kamu memilih Yes.", "Hasil", JOptionPane.INFORMATION_MESSAGE);
            } else if (pilihan == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Kamu memilih No.", "Hasil", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Dialog dibatalkan atau ditutup.", "Hasil", JOptionPane.WARNING_MESSAGE);
            }
        });
        
    }
    
}
