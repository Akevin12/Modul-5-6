
package View;

import Model.Singleton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Properties;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import org.jdatepicker.UtilDateModel;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;

/**
 *
 * @author kevin
 */
public class FormUpdateDelete {

    public FormUpdateDelete() {

        JFrame frame = new JFrame("DATA KTP");
        frame.setSize(1600, 800);
        frame.setLocationRelativeTo(null);
        Font myFont = new Font("Serif", Font.BOLD, 18);

        //enter name label
        JLabel label = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();
        JLabel label5 = new JLabel();
        JLabel label6 = new JLabel();
        JLabel label7 = new JLabel();
        JLabel label8 = new JLabel();
        JLabel label9 = new JLabel();
        JLabel label10 = new JLabel();
        JLabel label11 = new JLabel();
        JLabel label12 = new JLabel();
        JLabel label13 = new JLabel();
        JLabel label14 = new JLabel();
        JLabel label15 = new JLabel();
        JLabel label16 = new JLabel();
        JLabel label17 = new JLabel();
        JLabel label18 = new JLabel();
        JLabel label19 = new JLabel();
        JLabel label20 = new JLabel();
        JLabel infoFoto = new JLabel();
        JLabel infoTTD = new JLabel();
        JLabel iconGbr = new JLabel();
        iconGbr.setVisible(false);
        JLabel iconTTD = new JLabel();
        iconTTD.setVisible(false);

        infoFoto.setText("File");
        infoFoto.setBounds(1070, 415, 600, 30);

        infoTTD.setText("File");
        infoTTD.setBounds(1070, 470, 600, 30);

        label20.setText("FORM ISI DATA KTP");
        label20.setBounds(10, 30, 400, 30);
        Font myFont5 = new Font("Arial Black", Font.BOLD, 28);
        label20.setFont(myFont5);
        label20.setForeground(Color.BLUE);

        label.setText("NIK");
        label.setBounds(10, 100, 200, 30);
        label.setFont(myFont);
        

        label2.setText("Nama");
        label2.setBounds(10, 150, 100, 30);
        label2.setFont(myFont);
        
        label3.setText("Tempat Lahir");
        label3.setBounds(10, 200, 150, 30);
        label3.setFont(myFont);

        label4.setText("Tanggal Lahir");
        label4.setBounds(10, 250, 150, 30);
        label4.setFont(myFont);

        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new Controller.DateLabelFormatter());
        datePicker.setBounds(210, 250, 200, 30);

        label5.setText("Jenis Kelamin");
        label5.setBounds(10, 300, 150, 30);
        label5.setFont(myFont);

        label6.setText("Golongan Darah");
        label6.setBounds(10, 370, 200, 30);
        label6.setFont(myFont);

        label7.setText("Alamat");
        label7.setBounds(10, 430, 100, 30);
        label7.setFont(myFont);

        label8.setText("RT/RW");
        label8.setBounds(10, 520, 100, 30);
        label8.setFont(myFont);

        label9.setText("Kel/Desa");
        label9.setBounds(10, 570, 100, 30);
        label9.setFont(myFont);

        label10.setText("Kecamatan");
        label10.setBounds(10, 620, 200, 30);
        label10.setFont(myFont);

        label11.setText("Agama");
        label11.setBounds(700, 100, 100, 30);
        label11.setFont(myFont);

        label12.setText("Status Perkawinan");
        label12.setBounds(700, 150, 200, 30);
        label12.setFont(myFont);

        label13.setText("Pekerjaan");
        label13.setBounds(700, 200, 100, 30);
        label13.setFont(myFont);

        label14.setText("Kewarganegaraan");
        label14.setBounds(700, 350, 200, 30);
        label14.setFont(myFont);

        label15.setText("Foto");
        label15.setBounds(700, 420, 100, 30);
        label15.setFont(myFont);

        label16.setText("Tanda Tangan");
        label16.setBounds(700, 470, 200, 30);
        label16.setFont(myFont);

        label17.setText("Berlaku Hingga");
        label17.setBounds(700, 520, 200, 30);
        label17.setFont(myFont);

        label18.setText("Kota Pembuatan");
        label18.setBounds(700, 570, 200, 30);
        label18.setFont(myFont);

        label19.setText("Tanggal Pembuatan KTP");
        label19.setBounds(700, 620, 300, 30);
        label19.setFont(myFont);

        // textfield
        JTextField nik = new JTextField();
        JTextField nama = new JTextField();
        JTextField tmptLahir = new JTextField();
        JTextArea alamat = new JTextArea();
        JTextField rt = new JTextField();
        JTextField kel = new JTextField();
        JTextField kec = new JTextField();
        JTextField cWNA = new JTextField();
        JTextField masa = new JTextField();
        JTextField kota = new JTextField();

        nik.setBounds(210, 100, 120, 30);

        nama.setBounds(210, 150, 200, 30);

        tmptLahir.setBounds(210, 200, 200, 30);

        JRadioButton jk1 = new JRadioButton(" Laki-laki");
        JRadioButton jk2 = new JRadioButton(" Perempuan");
        JRadioButton gd1 = new JRadioButton("A");
        JRadioButton gd2 = new JRadioButton("B");
        JRadioButton gd3 = new JRadioButton("AB");
        JRadioButton gd4 = new JRadioButton("O");
        JRadioButton wni = new JRadioButton("WNI");
        JRadioButton wna = new JRadioButton("WNA");

        jk1.setBounds(210, 300, 200, 30);
        jk1.setFont(myFont);
        jk2.setBounds(210, 330, 200, 30);
        jk2.setFont(myFont);

        gd1.setBounds(210, 370, 70, 30);
        gd1.setFont(myFont);
        gd2.setBounds(280, 370, 70, 30);
        gd2.setFont(myFont);
        gd3.setBounds(360, 370, 70, 30);
        gd3.setFont(myFont);
        gd4.setBounds(440, 370, 70, 30);
        gd4.setFont(myFont);

        alamat.setBounds(210, 430, 250, 60);

        rt.setBounds(210, 520, 250, 30);

        kel.setBounds(210, 570, 250, 30);

        kec.setBounds(210, 620, 250, 30);

        String religious[] = {"Kristen", "Islam", "Katolik", "Hindu", "Budha", "Konghucu"};
        JComboBox agama = new JComboBox(religious);
        agama.setBounds(950, 105, 100, 20);
        agama.setFont(myFont);

        String wedding[] = {"Belum Menikah", "Menikah", "Janda/Duda"};
        JComboBox pernikahan = new JComboBox(wedding);
        pernikahan.setBounds(950, 155, 150, 20);
        pernikahan.setFont(myFont);

        JCheckBox pk1 = new JCheckBox("Karyawan Swasta");
        pk1.setBounds(950, 200, 200, 50);
        pk1.setFont(myFont);
        JCheckBox pk2 = new JCheckBox("PNS");
        pk2.setBounds(950, 240, 150, 50);
        pk2.setFont(myFont);
        JCheckBox pk3 = new JCheckBox("Wiraswasta");
        pk3.setBounds(950, 280, 200, 50);
        pk3.setFont(myFont);
        JCheckBox pk4 = new JCheckBox("Akademisi");
        pk4.setBounds(1150, 200, 150, 50);
        pk4.setFont(myFont);
        JCheckBox pk5 = new JCheckBox("Pengangguran");
        pk5.setBounds(1150, 240, 200, 50);
        pk5.setFont(myFont);

        wni.setBounds(950, 350, 100, 30);
        wni.setFont(myFont);
        wna.setBounds(1050, 350, 100, 30);
        wna.setFont(myFont);

        cWNA.setBounds(1070, 380, 100, 30);
        cWNA.setFont(myFont);
        if (wna.isSelected()) {
            cWNA.setVisible(true);
        } else {
            cWNA.setVisible(false);
        }

        JButton btnFoto = new JButton("Open File");
        btnFoto.setBounds(950, 410, 100, 40);

        JButton btnTTD = new JButton("Open File");
        btnTTD.setBounds(950, 465, 100, 40);

        masa.setBounds(950, 520, 200, 30);

        kota.setBounds(950, 570, 200, 30);

        UtilDateModel mdl = new UtilDateModel();
        Properties pro = new Properties();
        pro.put("text.today", "Today");
        pro.put("text.month", "Month");
        pro.put("text.year", "Year");
        JDatePanelImpl datePanel2 = new JDatePanelImpl(mdl, pro);
        JDatePickerImpl datePickerPembuatan = new JDatePickerImpl(datePanel2, new Controller.DateLabelFormatter());
        datePickerPembuatan.setBounds(950, 620, 200, 30);
        // Absolute Position
        JButton btnUpdate = new JButton("UPDATE");
        btnUpdate.setBounds(400, 680, 150, 40);

        JButton btnDelete = new JButton("DELETE");
        btnDelete.setBounds(560, 680, 150, 40);

        JButton btnBack = new JButton("BACK");
        btnBack.setBounds(720, 680, 150, 40);

        frame.add(label);
        frame.add(label2);
        frame.add(datePicker);
        frame.add(datePickerPembuatan);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
        frame.add(label8);
        frame.add(label9);
        frame.add(label10);
        frame.add(label11);
        frame.add(label12);
        frame.add(label13);
        frame.add(label14);
        frame.add(label15);
        frame.add(label16);
        frame.add(label17);
        frame.add(label18);
        frame.add(label19);
        frame.add(label20);
        frame.add(infoFoto);
        frame.add(infoTTD);
        frame.add(nik);
        frame.add(nama);
        frame.add(jk1);
        frame.add(jk2);
        frame.add(tmptLahir);
        frame.add(gd1);
        frame.add(gd2);
        frame.add(gd3);
        frame.add(gd4);
        frame.add(alamat);
        frame.add(rt);
        frame.add(kel);
        frame.add(kec);
        frame.add(agama);
        frame.add(pernikahan);
        frame.add(pk1);
        frame.add(pk2);
        frame.add(pk3);
        frame.add(pk4);
        frame.add(pk5);
        frame.add(wni);
        frame.add(wna);
        frame.add(cWNA);
        frame.add(pk5);
        frame.add(wni);
        frame.add(wna);
        frame.add(cWNA);
        frame.add(btnFoto);
        frame.add(btnTTD);
        frame.add(masa);
        frame.add(kota);
        frame.add(btnUpdate);
        frame.add(btnDelete);
        frame.add(btnBack);
        frame.setLayout(null);
        frame.setVisible(true);

        jk1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (jk1.isSelected()) {
                    jk2.setEnabled(false);
                } else {
                    jk2.setEnabled(true);
                }
            }
        });

        jk2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (jk2.isSelected()) {
                    jk1.setEnabled(false);
                } else {
                    jk1.setEnabled(true);
                }
            }
        });

        gd1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (gd1.isSelected()) {
                    gd2.setEnabled(false);
                    gd3.setEnabled(false);
                    gd4.setEnabled(false);
                } else {
                    gd2.setEnabled(true);
                    gd3.setEnabled(true);
                    gd4.setEnabled(true);
                }
            }
        });

        gd2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (gd2.isSelected()) {
                    gd1.setEnabled(false);
                    gd3.setEnabled(false);
                    gd4.setEnabled(false);
                } else {
                    gd1.setEnabled(true);
                    gd3.setEnabled(true);
                    gd4.setEnabled(true);
                }
            }
        });

        gd3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (gd3.isSelected()) {
                    gd1.setEnabled(false);
                    gd2.setEnabled(false);
                    gd4.setEnabled(false);
                } else {
                    gd1.setEnabled(true);
                    gd2.setEnabled(true);
                    gd4.setEnabled(true);
                }
            }
        });

        gd4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (gd4.isSelected()) {
                    gd1.setEnabled(false);
                    gd2.setEnabled(false);
                    gd3.setEnabled(false);
                } else {
                    gd1.setEnabled(true);
                    gd2.setEnabled(true);
                    gd3.setEnabled(true);
                }
            }
        });

        wna.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (wna.isSelected()) {
                    wni.setEnabled(false);
                } else {
                    wni.setEnabled(true);
                }
                cWNA.setVisible(true);
            }
        });

        wni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (wni.isSelected()) {
                    wna.setEnabled(false);
                } else {
                    wna.setEnabled(true);
                }
                cWNA.setVisible(false);
            }
        });

        pk5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (pk5.isSelected()) {
                    pk1.setEnabled(false);
                    pk2.setEnabled(false);
                    pk3.setEnabled(false);
                    pk4.setEnabled(false);
                    pk1.setSelected(false);
                    pk2.setSelected(false);
                    pk3.setSelected(false);
                    pk4.setSelected(false);

                } else {
                    pk1.setEnabled(true);
                    pk2.setEnabled(true);
                    pk3.setEnabled(true);
                    pk4.setEnabled(true);
                }
            }
        });

        btnFoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "png");
                j.addChoosableFileFilter(filter);
                int r = j.showSaveDialog(null);
                if (r == JFileChooser.APPROVE_OPTION) {
                    File f = j.getSelectedFile();
                    infoFoto.setText(j.getSelectedFile().getAbsolutePath());
                    BufferedImage loadImg = Controller.Controller.loadImage(f.toString());

                    //proses resize gambar
                    BufferedImage gambar_c = Controller.Controller.resize(loadImg, 130, 150);
                    ImageIcon imageicon = new ImageIcon(gambar_c);

                    iconGbr.setIcon(imageicon);

                }
            }
        });

        btnTTD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JFileChooser file = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "png");
                file.addChoosableFileFilter(filter);
                int ret = file.showSaveDialog(null);
                if (ret == JFileChooser.APPROVE_OPTION) {
                    File f = file.getSelectedFile();
                    infoTTD.setText(file.getSelectedFile().getAbsolutePath());
                    BufferedImage loadImg = Controller.Controller.loadImage(f.toString());

                    //proses resize gambar
                    BufferedImage gambar = Controller.Controller.resize(loadImg, 130, 65);
                    ImageIcon imageicon2 = new ImageIcon(gambar);

                    iconTTD.setIcon(imageicon2);

                }
            }
        });
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ttl = datePicker.getModel().getDay() + "-" + datePicker.getModel().getMonth() + "-" + datePicker.getModel().getYear();
                String buatKTP = datePickerPembuatan.getModel().getDay() + "-" + datePickerPembuatan.getModel().getMonth()
                        + "-" + datePickerPembuatan.getModel().getYear();

                if (nik.getText().isEmpty() || nama.getText().isEmpty() || tmptLahir.getText().isEmpty() || Controller.Controller.findJK(jk1, jk2).isEmpty()
                        || Controller.Controller.findGoldar(gd1, gd2, gd3, gd4).isEmpty() || alamat.getText().isEmpty() || rt.getText().isEmpty() || kec.getText().isEmpty()
                        || kel.getText().isEmpty() || Controller.Controller.listPekerjaan(pk1, pk2, pk3, pk4, pk5).isEmpty() || Controller.Controller.findWNA(wni, wna, cWNA).isEmpty()
                        || masa.getText().isEmpty() || kota.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Semua kolom wajib diisi!");
                } else {
                    Controller.Controller.updateData(nik.getText(), nama.getText(),
                            tmptLahir.getText(), ttl, Controller.Controller.findJK(jk1, jk2),
                            Controller.Controller.findGoldar(gd1, gd2, gd3, gd4), alamat.getText(), rt.getText(),
                            kel.getText(), kec.getText(), (String) agama.getSelectedItem(),
                            (String) pernikahan.getSelectedItem(), Controller.Controller.listPekerjaan(pk1, pk2, pk3, pk4, pk5),
                            Controller.Controller.findWNA(wni, wna, cWNA), infoFoto.getText(), infoTTD.getText(),
                            masa.getText(), kota.getText(), buatKTP);
                    new MainMenu();
                }
            }

        });

        btnDelete.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Controller.Controller.deleteData(nik.getText());
                new MainMenu();
            }

        });
        
        if (Singleton.getInstance().getData().isPencarian()) {
            nik.setText(Singleton.getInstance().getData().getNIK());
            nama.setText(Singleton.getInstance().getData().getNama());
            tmptLahir.setText(Singleton.getInstance().getData().getTmptLahir());
            if (Singleton.getInstance().getData().getJenisKelamin().equals("Laki-laki")) {
                jk1.setSelected(true);
            } else {
                jk2.setSelected(true);
            }
            if (Singleton.getInstance().getData().getGolDarah().equals("A")) {
                gd1.setSelected(true);
            } else if (Singleton.getInstance().getData().getGolDarah().equals("B")) {
                gd2.setSelected(true);
            } else if (Singleton.getInstance().getData().getGolDarah().equals("AB")) {
                gd3.setSelected(true);
            } else {
                gd4.setSelected(true);
            }
            alamat.setText(Singleton.getInstance().getData().getAlamat());
            rt.setText(Singleton.getInstance().getData().getRTRW());
            kel.setText(Singleton.getInstance().getData().getKelDesa());
            kec.setText(Singleton.getInstance().getData().getKecamatan());
            agama.setSelectedItem(Singleton.getInstance().getData().getAgama());
            pernikahan.setSelectedItem(Singleton.getInstance().getData().getStatus());
            infoFoto.setText(Singleton.getInstance().getData().getFotoPath());
            infoTTD.setText(Singleton.getInstance().getData().getTtdPath());
            masa.setText(Singleton.getInstance().getData().getBerlaku());
            kota.setText(Singleton.getInstance().getData().getKotaPembuatan());

        }
        
    }
}
