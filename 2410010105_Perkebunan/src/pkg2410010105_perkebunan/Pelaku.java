/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2410010105_perkebunan;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Pelaku {
    
    // 1. Tetap mempertahankan variabel asli milikmu
    String idUsaha, namaUsaha, alamatUsaha, email;
    
    // 2. Suntikan ArrayList dari dosen untuk menampung banyak data di memori
    private ArrayList<String> dataIdUsaha;
    private ArrayList<String> dataNamaUsaha;
    private ArrayList<String> dataAlamatUsaha;
    private ArrayList<String> dataEmail;
    
    // Constructor 1 (Inisialisasi ArrayList seperti punya dosen)
    public Pelaku(){
        this.dataIdUsaha = new ArrayList<>();
        this.dataNamaUsaha = new ArrayList<>();
        this.dataAlamatUsaha = new ArrayList<>();
        this.dataEmail = new ArrayList<>();
    }
    
    // Constructor 2 (Overload Constructor asli milikmu)
    public Pelaku(String id, String nama, String alamat, String email){
        this.idUsaha = id;
        this.namaUsaha = nama;
        this.alamatUsaha = alamat;
        this.email = email;
        
        this.dataIdUsaha = new ArrayList<>();
        this.dataNamaUsaha = new ArrayList<>();
        this.dataAlamatUsaha = new ArrayList<>();
        this.dataEmail = new ArrayList<>();
    }
    
    // 3. Method Input & List Data (Wajib ada untuk GUI JTable nanti)
    public void inputDataId(String data) { this.dataIdUsaha.add(data); }
    public ArrayList<String> listDataId() { return this.dataIdUsaha; }

    public void inputDataNama(String data) { this.dataNamaUsaha.add(data); }
    public ArrayList<String> listDataNama() { return this.dataNamaUsaha; }

    public void inputDataAlamat(String data) { this.dataAlamatUsaha.add(data); }
    public ArrayList<String> listDataAlamat() { return this.dataAlamatUsaha; }

    public void inputDataEmail(String data) { this.dataEmail.add(data); }
    public ArrayList<String> listDataEmail() { return this.dataEmail; }
    
    // 4. Getter & Setter Asli bawaan kodemu (tetap aman digunakan)
    public String getIdUsaha() { return this.idUsaha; }
    public void setIdUsaha(String idUsaha) { this.idUsaha = idUsaha; }

    public String getAlamatUsaha() { return this.alamatUsaha; }
    public void setAlamatUsaha(String alamatUsaha) { this.alamatUsaha = alamatUsaha; }

    public String getEmail() { return this.email; }
    public void setEmail(String email) { this.email = email; }
         
    public String getNamaUsaha() { return this.namaUsaha; }
    public void setNamaUsaha(String namaUsaha) { this.namaUsaha = namaUsaha; }
    
    // 5. Method Pencarian Index Berdasarkan ID Usaha (Meniru Karyawan dosen)
    public int getIndexData(String id) {
        int index = this.dataIdUsaha.indexOf(id);
        if(index < 0) {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
        }
        return index;
    }
    
    // 6. Method Otoritas CRUD (Ubah & Hapus) Sesuai Standar Dosen
    public void ubahDataPelaku(String id, String nama, String alamat, String email) {
        int i = getIndexData(id);
        if (i >= 0) {
            this.listDataId().set(i, id);
            this.listDataNama().set(i, nama);
            this.listDataAlamat().set(i, alamat);
            this.listDataEmail().set(i, email);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah!");
        }
    }
    
    public void hapusDataPelaku(String id) {
        int i = getIndexData(id);
        if (i >= 0) {
            this.listDataId().remove(i);
            this.listDataNama().remove(i);
            this.listDataAlamat().remove(i);
            this.listDataEmail().remove(i);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
        }
    }
    
    // Method cetak info asli milikmu (jika masih diperlukan)
    public void cetakInfoPelaku() {
        System.out.println("ID Usaha: " + idUsaha);
        System.out.println("Nama Pelaku Usaha: " + namaUsaha);
        System.out.println("Alamat: " + alamatUsaha);
        System.out.println("Email: " + email);
    }
}