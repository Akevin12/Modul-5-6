package View;

import java.awt.Font;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author kevin
 */
public class HasilKTP {

    public HasilKTP() {

    }

    public HasilKTP(String title, String nik, String nama, String tempatLahir, String tglLahir, String jk, 
            String goldar, String alamat, String rt, String kel, String kec,
            String agama, String status, String pekerjaan, String warga, Icon foto, Icon ttd, String berlaku,
            String kota, String tglBuat) {
        
        JFrame frame = new JFrame("KTP");
        frame.setSize(900, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font1 = new Font("Serif", Font.BOLD, 20);

        JLabel titleLabel = new JLabel(title);
        titleLabel.setBounds(280, 0, 400, 70);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 30));

        JLabel nikLabel = new JLabel("NIK");
        nikLabel.setBounds(50, 70, 100, 70);
        nikLabel.setFont(new Font("Serif", Font.BOLD, 30));

        JLabel nikKTP = new JLabel(":  " + nik);
        nikKTP.setBounds(200, 70, 700, 70);
        nikKTP.setFont(new Font("Serif", Font.BOLD, 30));

        JLabel namaLabel = new JLabel("Nama");
        namaLabel.setBounds(50, 110, 100, 80);
        namaLabel.setFont(font1);

        JLabel namaKTP = new JLabel(": " + nama);
        namaKTP.setBounds(250, 110, 700, 80);
        namaKTP.setFont(font1);

        JLabel ttglLabel = new JLabel("Tempat/Tgl Lahir");
        ttglLabel.setBounds(50, 140, 200, 80);
        ttglLabel.setFont(font1);

        JLabel ttgl = new JLabel(": " + tempatLahir + ", " + tglLahir);
        ttgl.setBounds(250, 140, 700, 80);
        ttgl.setFont(font1);

        JLabel jkLabel = new JLabel("Jenis Kelamin");
        jkLabel.setBounds(50, 170, 200, 80);
        jkLabel.setFont(font1);

        JLabel jkKTP = new JLabel(": " + jk);
        jkKTP.setBounds(250, 170, 700, 80);
        jkKTP.setFont(font1);

        JLabel goldarLabel = new JLabel("Gol. Darah");
        goldarLabel.setBounds(400, 170, 200, 80);
        goldarLabel.setFont(font1);

        JLabel goldarKTP = new JLabel(": " + goldar);
        goldarKTP.setBounds(500, 170, 200, 80);
        goldarKTP.setFont(font1);

        JLabel alamatLabel = new JLabel("Alamat");
        alamatLabel.setBounds(50, 200, 200, 80);
        alamatLabel.setFont(font1);

        JLabel alamatKTP = new JLabel(": " + alamat);
        alamatKTP.setBounds(250, 200, 700, 80);
        alamatKTP.setFont(font1);
        
        JLabel rtLabel = new JLabel("RT / RW");
        rtLabel.setBounds(65, 230, 200, 80);
        rtLabel.setFont(font1);
        
        JLabel rtRw = new JLabel(": " + rt);
        rtRw.setBounds(270, 230, 700, 80);
        rtRw.setFont(font1);
        
        JLabel kelLabel = new JLabel("Kelurahan");
        kelLabel.setBounds(65, 260, 200, 80);
        kelLabel.setFont(font1);
        
        JLabel kelurahan = new JLabel(": " + kel);
        kelurahan.setBounds(270, 260, 700, 80);
        kelurahan.setFont(font1);
        
        JLabel kecLabel = new JLabel("Kecamatan");
        kecLabel.setBounds(65, 290, 200, 80);
        kecLabel.setFont(font1);
        
        JLabel kecamatan = new JLabel(": " + kec);
        kecamatan.setBounds(270, 290, 700, 80);
        kecamatan.setFont(font1);
        
        JLabel agmLabel = new JLabel("Agama");
        agmLabel.setBounds(50, 320, 200, 80);
        agmLabel.setFont(font1);
        
        JLabel agm = new JLabel(": " + agama);
        agm.setBounds(250, 320, 700, 80);
        agm.setFont(font1);
        
        JLabel statusLabel = new JLabel("Status Perkawinan");
        statusLabel.setBounds(50, 350, 200, 80);
        statusLabel.setFont(font1);
        
        JLabel nikah = new JLabel(": " + status);
        nikah.setBounds(250, 350, 700, 80);
        nikah.setFont(font1);
        
        JLabel pkjLabel = new JLabel("Pekerjaan");
        pkjLabel.setBounds(50, 380, 200, 80);
        pkjLabel.setFont(font1);
        
        JLabel pkj = new JLabel(": " + pekerjaan);
        pkj.setBounds(250, 380, 700, 80);
        pkj.setFont(font1);
        
        JLabel wargaLabel = new JLabel("Kewarganegaraan");
        wargaLabel.setBounds(50, 410, 200, 80);
        wargaLabel.setFont(font1);
        
        JLabel wargaNegara = new JLabel(": " + warga);
        wargaNegara.setBounds(250, 410, 700, 80);
        wargaNegara.setFont(font1);
        
        JLabel photo = new JLabel(foto);
        photo.setBounds(370, 85, 700, 200);
        
        JLabel kotaPembuatan = new JLabel(kota);
        kotaPembuatan.setBounds(680, 210, 700, 200);
        kotaPembuatan.setFont(font1);
        
        JLabel buat = new JLabel(tglBuat);
        buat.setBounds(680, 240, 700, 200);
        buat.setFont(font1);
        
        JLabel tandaTangan = new JLabel(ttd);
        tandaTangan.setBounds(370, 300, 700, 200);
        
        JLabel berlakuLabel = new JLabel("Berlaku Hingga");
        berlakuLabel.setBounds(50, 440, 200, 80);
        berlakuLabel.setFont(font1);
        
        JLabel masa = new JLabel(": " + berlaku);
        masa.setBounds(250, 440, 700, 80);
        masa.setFont(font1);
        
        frame.add(titleLabel);
        frame.add(nikLabel);
        frame.add(nikKTP);
        frame.add(namaLabel);
        frame.add(namaKTP);
        frame.add(ttglLabel);
        frame.add(ttgl);
        frame.add(jkLabel);
        frame.add(jkKTP);
        frame.add(goldarLabel);
        frame.add(goldarKTP);
        frame.add(alamatLabel);
        frame.add(alamatKTP);
        frame.add(rtLabel);
        frame.add(rtRw);
        frame.add(kelLabel);
        frame.add(kelurahan);
        frame.add(kecLabel);
        frame.add(kecamatan);
        frame.add(agmLabel);
        frame.add(agm);
        frame.add(statusLabel);
        frame.add(nikah);
        frame.add(pkjLabel);
        frame.add(pkj);
        frame.add(wargaLabel);
        frame.add(wargaNegara);
        frame.add(photo);
        frame.add(tandaTangan);
        frame.add(berlakuLabel);
        frame.add(masa);
        frame.add(kotaPembuatan);
        frame.add(buat);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }
}
