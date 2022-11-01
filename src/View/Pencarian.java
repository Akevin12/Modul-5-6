package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author kevin
 */
public class Pencarian {

    public Pencarian() {

        JFrame frame = new JFrame("Pencarian");
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        Font myFont = new Font("Serif", Font.BOLD, 18);

        //enter name label
        JLabel label = new JLabel();
        JLabel label2 = new JLabel();

        label.setText("FORM PENCARIAN DATA KTP");
        label.setBounds(10, 30, 500, 30);
        Font myFont5 = new Font("Arial Black", Font.BOLD, 24);
        label.setFont(myFont5);
        label.setForeground(Color.BLUE);

        label2.setText("NIK");
        label2.setBounds(10, 100, 200, 30);
        label2.setFont(myFont);

        JTextField nik = new JTextField();
        nik.setBounds(100, 100, 200, 30);

        JButton btnCari = new JButton("CARI");
        btnCari.setBounds(310, 100, 100, 30);

        frame.add(label);
        frame.add(label2);
        frame.add(nik);
        frame.add(btnCari);
        frame.setLayout(null);
        frame.setVisible(true);

        btnCari.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String kondisi = Controller.Controller.PencarianController(nik.getText());
                JOptionPane.showMessageDialog(null, kondisi);
                if (kondisi.equals("berhasil")) {
                    frame.dispose();
                    //new FormUpdateDelete(nik.getText());
                }
            }

        });
    }
}
