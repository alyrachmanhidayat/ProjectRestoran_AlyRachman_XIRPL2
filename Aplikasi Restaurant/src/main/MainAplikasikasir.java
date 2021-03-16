/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author gin0612
 */
import classes.*;
import java.util.Scanner;
public class MainAplikasikasir {
    //tambahkan
    public DaftarMenu daftarMenu;
    public static double PAJAK_PPN = 0.10;
    public static double BIAYA_SERVICE = 0.05;
    //akhir tambahan
    
    public static void main(String[] args) {
        //inisialisasi kelas Scanner untuk mengambil
        //input dari keyboard
        Scanner input = new Scanner(System.in);
        //tambahkan
        String no_transaksi, nama_pemesan, tanggal, no_meja = "";
        String transaksi_lagi = "", pesan_lagi = "", keterangan = "", makan_ditempat;
        int jumlah_pesanan, no_menu;
        //akhir tambahan
        MainAplikasikasir app = new MainAplikasikasir();
        //tampilkan daftar menu
        app.generateDaftarMenu();
        //mulai transaksi
        System.out.println("========== TRANSAKSI ==========");
        
        //ambil data transaksi
        System.out.print("No Transaksi : ");
        no_transaksi = input.next();
        System.out.print("Pemesan : ");
        nama_pemesan = input.next();
        System.out.print("Tangal : [dd-mm-yyyy] ");
        tanggal = input.next();
        System.out.print("Makan ditempat? [Y/N] ");
        makan_ditempat = input.next();
        
        if (makan_ditempat.equalsIgnoreCase("Y")) {
            System.out.print("Nomor Meja : ");
            no_meja = input.next();
        }
    }
    
    public void generateDaftarMenu() {
        daftarMenu = new DaftarMenu();
        daftarMenu.tambahMenu(new Ramen("Ramen Seafood", 25000));
        daftarMenu.tambahMenu(new Ramen("Ramen Original", 18000));
        daftarMenu.tambahMenu(new Ramen("Ramen Vegetarian", 22000));
        daftarMenu.tambahMenu(new Ramen("Ramen Karnivor", 28000));
        daftarMenu.tambahMenu(new Kuah("Kuah Orisinil"));
        daftarMenu.tambahMenu(new Kuah("Kuah Internasional"));
        daftarMenu.tambahMenu(new Kuah("Kuah Spicy Lada"));
        daftarMenu.tambahMenu(new Kuah("Kuah Soto Padang"));
        daftarMenu.tambahMenu(new Topping("Crab Stick Bakar", 6000));
        daftarMenu.tambahMenu(new Topping("Chicken Katsu", 8000));
        daftarMenu.tambahMenu(new Topping("Gyoza Goreng", 4000));
        daftarMenu.tambahMenu(new Topping("Bakso Goreng", 7000));
        daftarMenu.tambahMenu(new Topping("Enoki Goreng", 5000));
        daftarMenu.tambahMenu(new Minuman("Jus Alpukat SCP", 10000));
        daftarMenu.tambahMenu(new Minuman("Jus Stroberi", 11000));
        daftarMenu.tambahMenu(new Minuman("Cappucino Coffee", 15000));
        daftarMenu.tambahMenu(new Minuman("Vietnam Dripp", 14000));
        
        daftarMenu.tampilDaftarMenu();
    }
}

