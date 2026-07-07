/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2410010105_perkebunan;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class Komoditi {
    
    String idKomoditi, namaKomoditi, produsen;
    int harga;
    
    private ArrayList<String> riwayatNamaBarang = new ArrayList<>();
    
    public Komoditi(){}
    
    public Komoditi(String id, String nama, String prod, int hargaJual){
        this.idKomoditi = id;
        this.namaKomoditi = nama;
        this.produsen = prod;
        this.harga = hargaJual;
    }
    
    public String getKualitas() {
        String kualitas;
        // Mengambil huruf pertama dari ID (A, B, atau C)
        String kode = idKomoditi.substring(0, 1).toUpperCase();
        
        switch (kode) {
            case "A":
                kualitas = "Ekspor (Super)";
                break;
            case "B":
                kualitas = "Nasional (Grade 1)";
                break;
            default:
                kualitas = "Lokal (Grade 2)";
                break;
        }
        return kualitas;
    }
    public int diskon(){
        int potongHarga = 0;
        
        if(harga >= 1000000){
            potongHarga = 100000;
        }else if (harga >= 500000){
            potongHarga = 50000;
        }else {
            potongHarga = 0;
        }
        return potongHarga;
    }
    
    public int hargaAkhir(){
        return harga - diskon();
    }
    
    public int getHarga(){
        return harga;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    public void inputDataNama(String data) {
        this.riwayatNamaBarang.add(data);
    }
    
    public ArrayList<String> listDataNama() {
        return this.riwayatNamaBarang;
    }
            
    public void cetakInfoKomoditi() {
        System.out.println("ID Komoditi    : " + idKomoditi);
        System.out.println("Nama Komoditi  : " + namaKomoditi);
        System.out.println("Kualitas     : " + getKualitas());
        System.out.println("Harga Awal     : Rp" + harga);
        System.out.println("Diskon         : Rp" + diskon());
        System.out.println("HARGA AKHIR    : Rp" + hargaAkhir());
    }

    public void setNama(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

      
    
    
    

            

