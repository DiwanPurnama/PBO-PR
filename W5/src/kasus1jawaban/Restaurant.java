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
public class Restaurant {
    private Makanan[] menuMakanan;
    private static byte id=0;
    
    public Restaurant(){
        menuMakanan=new Makanan[10];
    }
    
    public void tampilMenuMakanan(){
        for(int i=0;i<=id;i++){
            if(!isOutOfstock(i)){
                this.menuMakanan[i].tampilMakanan();
            }
        }
    }
    
    public void tambahMenuMakanan(String nama, double harga,int stok){
        this.menuMakanan[id]=new Makanan(nama,harga,stok);
    }
    
    public boolean isOutOfstock(int id){
        return menuMakanan[id].getStok()==0;
    }
    public static void nextId(){
        id++;
    }
    //fitur tambahan,pemesanan
    public void pemesanan(String namaMakanan,int jumlah){
        for(int i=0;i<=id;i++){
            if(namaMakanan.equals(menuMakanan[i].getNamaMakanan())){
                if(menuMakanan[i].getStok()>=jumlah){
                    System.out.println(jumlah+" "+menuMakanan[i].getNamaMakanan()+"Terjual");
                    menuMakanan[i].kurangStok(jumlah);
               }else{
                    System.out.println("stok"+ menuMakanan[i].getNamaMakanan()+"Tidak cukup");
                }
            }
        }
    }
}
