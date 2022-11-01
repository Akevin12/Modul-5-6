package Model;

public class DataKTP {

    private String NIK;
    private String nama;
    private String tmptLahir;
    private String tglLahir;
    private String jenisKelamin;
    private String golDarah;
    private String alamat;
    private String RTRW;
    private String kelDesa;
    private String kecamatan;
    private String agama;
    private String status;
    private String pekerjaan;
    private String kewarganegaraan;
    private String fotoPath;
    private String ttdPath;
    private String berlaku;
    private String kotaPembuatan;
    private String tglPembuatan;
    private boolean pencarian = false;

    public DataKTP(String NIK, String nama, String tmptLahir, String tglLahir, String jenisKelamin, String golDarah, String alamat, String RTRW, String kelDesa, String Kecamatan, String agama, String status, String pekerjaan, String kewarganegaraan, String fotoPath, String ttdPath, String berlaku, String kotaPembuatan, String tglPembuatan) {
        this.NIK = NIK;
        this.nama = nama;
        this.tmptLahir = tmptLahir;
        this.tglLahir = tglLahir;
        this.jenisKelamin = jenisKelamin;
        this.golDarah = golDarah;
        this.alamat = alamat;
        this.RTRW = RTRW;
        this.kelDesa = kelDesa;
        this.kecamatan = Kecamatan;
        this.agama = agama;
        this.status = status;
        this.pekerjaan = pekerjaan;
        this.kewarganegaraan = kewarganegaraan;
        this.fotoPath = fotoPath;
        this.ttdPath = ttdPath;
        this.berlaku = berlaku;
        this.kotaPembuatan = kotaPembuatan;
        this.tglPembuatan = tglPembuatan;
        this.pencarian = true;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTmptLahir() {
        return tmptLahir;
    }

    public void setTmptLahir(String tmptLahir) {
        this.tmptLahir = tmptLahir;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getGolDarah() {
        return golDarah;
    }

    public void setGolDarah(String golDarah) {
        this.golDarah = golDarah;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRTRW() {
        return RTRW;
    }

    public void setRTRW(String RTRW) {
        this.RTRW = RTRW;
    }

    public String getKelDesa() {
        return kelDesa;
    }

    public void setKelDesa(String kelDesa) {
        this.kelDesa = kelDesa;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getFotoPath() {
        return fotoPath;
    }

    public void setFotoPath(String fotoPath) {
        this.fotoPath = fotoPath;
    }

    public String getTtdPath() {
        return ttdPath;
    }

    public void setTtdPath(String ttdPath) {
        this.ttdPath = ttdPath;
    }

    public String getBerlaku() {
        return berlaku;
    }

    public void setBerlaku(String berlaku) {
        this.berlaku = berlaku;
    }

    public String getKotaPembuatan() {
        return kotaPembuatan;
    }

    public void setKotaPembuatan(String kotaPembuatan) {
        this.kotaPembuatan = kotaPembuatan;
    }

    public String getTglPembuatan() {
        return tglPembuatan;
    }

    public void setTglPembuatan(String tglPembuatan) {
        this.tglPembuatan = tglPembuatan;
    }

    public boolean isPencarian() {
        return pencarian;
    }

    public void setPencarian(boolean pencarian) {
        this.pencarian = pencarian;
    }
}
