/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasus1;

/**
 *
 * @author Windows 10
 */
public class Barang {
    //state
    String kode_barang;
    String nama_barang;
    private int stok;//di ubah menjadi private agar hanya bisa di akses di class Barang
    
    public Barang(String kode, String nama,int stk){
        kode_barang=kode;
        nama_barang=nama;
        stok=stk;
    }
    
    //menambahkan method getter
    public int getStok(){
        return stok;
    }
    
    //menambahkan method addStok agar stok tidak bisa dimanipulasi operasi arithmatika selain tambah 
    public void addStok(int stokTambah){
        this.stok+=stokTambah;
    }
}
