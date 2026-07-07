/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2410010105_perkebunan;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        ArrayList<Komoditi> listBarang = new ArrayList<>();
        
        // Menggunakan Scanner untuk input Nama Pelaku
        System.out.println("======= INPUT DATA ADMIN =======");
        System.out.print("Masukkan Nama Anda: ");
        String namaAdmin = input.nextLine(); // Menyimpan apa yang di ketik ke variabel namaAdmin
        
        // Membuat objek p1 menggunakan nama yang baru saja diketik
        Pelaku p1 = new Pelaku("P001", namaAdmin, "Banjarmasin", "nabila@email.com");
           
        // PERULANGAN: Mengisi data barang menggunakan Scanner
        for (int i = 0; i < 2; i++) {
            System.out.println("\n--- Input Data Barang Ke-" + (i + 1) + " ---");
            
            System.out.print("ID Komoditi (Mulai dgn A/B/C): ");
            String id = input.nextLine();
            
            System.out.print("Nama Komoditi: ");
            String namaK = input.nextLine();
            
            System.out.print("Nama Produsen: ");
            String prod = input.nextLine();
            
            System.out.print("Harga Jual (Angka): ");
            int hrg = input.nextInt();
            input.nextLine(); // Penting: Membersihkan enter agar bisa input teks lagi
            
            Komoditi barangBaru = new Komoditi(id, namaK, prod, hrg);
            barangBaru.inputDataNama(namaK);   
            listBarang.add(barangBaru);
        }

        // PERULANGAN: Mencetak semua hasil input tadi
        System.out.println("\n===========================================");
        System.out.println("       LAPORAN DATA PERKEBUNAN");
        System.out.println("===========================================");
        p1.cetakInfoPelaku();
        
        for (int i = 0; i < listBarang.size(); i++) {
            System.out.println("\n-------------------------------------------");
            listBarang.get(i).cetakInfoKomoditi();
        }
    }
    
}
