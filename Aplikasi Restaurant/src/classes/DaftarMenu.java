/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author gin0612
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;


public class DaftarMenu {
    private ArrayList<Menu> daftarMenu;
    
    public DaftarMenu() {
        daftarMenu = new ArrayList<>();
    }
    
    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
    }
    
    public void getMenuByKategori(String kategori) {
        System.out.println("======== " + kategori + " ========");
        
        for (int i = 0; i < daftarMenu.size(); i++) {
            Menu m = daftarMenu.get(i);
            if (m.getKategori().equals(kategori)) {
                System.out.println((i + 1) + ". " + m.getNama_menu() + "\t" + m.getHarga());
            }
        }
    }
    
    public void tampilDaftarMenu() {
        System.out.println("======== ICHIRAKU RAMEN ========");
        getMenuByKategori("Ramen");
        getMenuByKategori("Kuah");
        getMenuByKategori("Topping");
        getMenuByKategori("Minuman");
    }
    
    public Menu pilihMenu() {
        try{
            Scanner input = new Scanner(System.in);

            System.out.print("Nomor Menu yang dipesan : ");
            int no_menu = input.nextInt();

            //get menu berdasarkan no_menu, di -l karena arrayList mulai dari 0
            Menu m = daftarMenu.get(no_menu-1);

            //cek apakah menu kuah?
            if(!m.getKategori().equalsIgnoreCase("Kuah")){
                return m;
            } else{
                //jika yang dipilih adalah menu kuah, maka tidak bisa, user harus memilih lagi
                System.out.println("[Err] Pesan dulu Menu Ramen");
                return pilihMenu();
            }

        }catch(IndexOutOfBoundsException err){
            //jika no_menu tidak ada, makan akan masuk kesini
            //no_menu dianggap tidak ada ketika no_menu diluar dari index pada arraylist
            
            System.out.println("[Err] Pesanan Tidak Tersedia");
            //jika no_menu tidak ada, maka user akan diminta untuk mengulang memasukkan nomor mennu
            //teknik ini disebut dengan rekursif
            return pilihMenu();
        }catch(InputMismatchException err){
            //jika input bukan berupa angka akan masuk kesini
            System.out.println("[Err] Mohon masukkan nomor menu");
            return pilihMenu();
        }
    }
}


