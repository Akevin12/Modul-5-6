package Controller;

import Database.DatabaseHandler;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author kevin
 */
public class Controller {

    static DatabaseHandler conn = new DatabaseHandler();

    public static String findJK(JRadioButton jk1, JRadioButton jk2) {
        String jk = "";
        if (jk1.isSelected()) {
            jk = "Male";
        } else if (jk2.isSelected()) {
            jk = "Female";
        }
        return jk;
    }

    public static String findGoldar(JRadioButton gd1, JRadioButton gd2, JRadioButton gd3, JRadioButton gd4) {
        String goldar = "";
        if (gd1.isSelected()) {
            goldar = "A";
        } else if (gd2.isSelected()) {
            goldar = "B";
        } else if (gd3.isSelected()) {
            goldar = "AB";
        } else if (gd4.isSelected()) {
            goldar = "O";
        }
        return goldar;
    }

    public static String listPekerjaan(JCheckBox pk1, JCheckBox pk2, JCheckBox pk3, JCheckBox pk4, JCheckBox pk5) {
        String listPkj = "";

        if (pk1.isSelected()) {
            listPkj = "Karyawan Swasta";
        } else if (pk2.isSelected()) {
            listPkj = "PNS";
        } else if (pk3.isSelected()) {
            listPkj = "Wiraswasta";
        } else if (pk4.isSelected()) {
            listPkj = "Akademisi";
        } else {
            listPkj = "Pengangguran";
        }

        if (pk1.isSelected() && pk2.isSelected() && pk3.isSelected() && pk4.isSelected()) {
            listPkj = "Karyawan Swasta, PNS, Wiraswasta, Akademisi";
        } else if (pk1.isSelected() && pk2.isSelected() && pk3.isSelected()) {
            listPkj = "Karyawan Swasta, PNS, Wiraswasta";
        } else if (pk1.isSelected() && pk2.isSelected()) {
            listPkj = "Karyawan Swasta, PNS";
        } else if (pk1.isSelected() && pk3.isSelected()) {
            listPkj = "Karyawan Swasta, Wiraswasta";
        } else if (pk1.isSelected() && pk4.isSelected()) {
            listPkj = "Karyawan Swasta, Akademisi";
        } else if (pk2.isSelected() && pk3.isSelected()) {
            listPkj = "PNS, Wiraswasta";
        } else if (pk2.isSelected() && pk4.isSelected()) {
            listPkj = "PNS, Akademisi";
        } else if (pk3.isSelected() && pk4.isSelected()) {
            listPkj = "Wriswasta, Akademisi";
        }
        return listPkj;
    }

    public static String findWNA(JRadioButton wni, JRadioButton wna, JTextField cWNA) {
        String wargaNegara = null;
        if (wni.isSelected()) {
            wargaNegara = "WNI";
        } else if (wna.isSelected()) {
            cWNA.setVisible(true);
            wargaNegara = "WNA " + cWNA.getText();
        }
        return wargaNegara;
    }

    public static BufferedImage loadImage(String foto) {
        BufferedImage bi = null;
        try {
            bi = ImageIO.read(new File(foto));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bi;
    }

    public static BufferedImage resize(BufferedImage img, int newW, int newH) {

        int w = img.getWidth();
        int h = img.getHeight();
        BufferedImage dimg = dimg = new BufferedImage(newW, newH, img.getType());
        Graphics2D g = dimg.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(img, 0, 0, newW, newH, 0, 0, w, h, null);

        g.dispose();

        return dimg;

    }

    public static void insertData(String nik, String nama, String tmptL, String tglL, String jk, String goldar, String almt, String rt, String kel, String kec,
            String agama, String status, String pekerjaan, String warga, String foto, String ttd, String berlaku,
            String kota, String tglBuat) {

        conn.connect();

        String query = "INSERT INTO tbl_user_ktp (nik, nama, tmpt_lahir, tgl_lahir, jenis_kelamin, g_darah, alamat, rt, desa, kecamatan, agama, status_kawin, pekerjaan, kewarganegaraan, foto, tanda_tangan, berlaku, kota, tgl_buat) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, nik);
            stmt.setString(2, nama);
            stmt.setString(3, tmptL);
            stmt.setString(4, tglL);
            stmt.setString(5, jk);
            stmt.setString(6, goldar);
            stmt.setString(7, almt);
            stmt.setString(8, rt);
            stmt.setString(9, kel);
            stmt.setString(10, kec);
            stmt.setString(11, agama);
            stmt.setString(12, status);
            stmt.setString(13, pekerjaan);
            stmt.setString(14, warga);
            stmt.setString(15, foto);
            stmt.setString(16, ttd);
            stmt.setString(17, berlaku);
            stmt.setString(18, kota);
            stmt.setString(19, tglBuat);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insert Succesfull");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Insert Gagal !");

        }

    }

    public static void updateData(String nik, String nama, String tmptL, String tglL, String jk, String goldar, String almt, String rt, String kel, String kec,
            String agama, String status, String pekerjaan, String warga, String foto, String ttd, String berlaku,
            String kota, String tglBuat) {
        conn.connect();

        String query = "UPDATE tbl_user_ktp SET nama='" + nama + "', "
                + "tmpt_lahir='" + tmptL + "', "
                + "tgl_lahir='" + tglL + "' "
                + "jenis_kelamin='" + jk + "' "
                + "g_darah='" + goldar + "' "
                + "alamat='" + almt + "' "
                + "rt='" + rt + "' "
                + "desa='" + kel + "' "
                + "kecamatan='" + kec + "' "
                + "agama='" + agama + "' "
                + "status_kawin='" + status + "' "
                + "pekerjaan='" + pekerjaan + "' "
                + "kewarganegaraan='" + warga + "' "
                + "foto='" + foto + "' "
                + "tanda_tangan='" + ttd + "' "
                + "berlaku='" + berlaku + "' "
                + "kota='" + kota + "' "
                + "tgl_buat='" + tglBuat + "' "
                + "WHERE nik='" + nik + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil melakukan update");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal melakukan update");
        }
    }

    public static void deleteData(String nik) {
        conn.connect();

        String query = "DELETE FROM tbl_user_ktp WHERE nik='" + nik + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil menghapus data");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal menghapus data");
        }
    }

    public static String PencarianController(String nik) {
        String query;
        try {
            DatabaseHandler conn = new DatabaseHandler();
            conn.connect();
            java.sql.Statement stat = conn.con.createStatement();
            ResultSet result = stat.executeQuery("select * from tbl_user_ktp where nik='" + nik + "'");
            if (result.next()) {
                return "berhasil";
            } else {
                return "tidak ditemukan";
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "error";
        }
    }
}
