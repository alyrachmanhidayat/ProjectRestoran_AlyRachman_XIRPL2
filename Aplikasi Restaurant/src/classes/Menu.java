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
public class Menu { //superclass
    private String nama_menu;
    private double harga;
    private String kategori;
    
    //accessor
    public String getNama_menu() { 
        return nama_menu;
    }
    
    //mutator
    public void setNama_menu(String nama_menu) {
        this.nama_menu = nama_menu;
    }
    
    public double getHarga() { 
        return harga; 
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public String getKategori() { 
        return kategori; 
    }
    
    public void setKategori(String kategori) {
    this.kategori = kategori;
    }
}
