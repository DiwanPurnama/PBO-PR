/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasus1jawaban;

/**
 *
 * @author Windows 10
 */
public class Makanan {
    private String nama_makanan;
    private double harga_makanan;
    private int stok;
    
    //constructor
    public Makanan(String nama,double harga,int stk){
        this.nama_makanan=nama;
        this.harga_makanan=harga;
        this.stok=stk;
    }
    
    //encapsulation
    public String getNamaMakanan(){
        return nama_makanan;
    }
    public int getStok(){
        return stok;
    }
    
    public void tampilMakanan(){
        System.out.println(nama_makanan+"["+stok+"]"+"Rp. "+harga_makanan);
    }
    
    //mengurangi stok
    public void kurangStok(int jumlahKurang){
        this.stok-=jumlahKurang;
    }
}
