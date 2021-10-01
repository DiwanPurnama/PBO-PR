/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal4;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class gajiAgent {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int gajiPokok=500000;
        int item=50000;
        int gajiAkhir,b;
        
        //input jumlah penjualan
        int penjualan=input.nextInt();
        
        //ketentuan bonus penjualan
        if(penjualan>=40 && penjualan<=80){
            b=(25*(item*penjualan))/100;
            gajiAkhir=gajiPokok+b;
            System.out.println(gajiAkhir);
        }else if(penjualan>80){
            b=(35*(item*penjualan))/100;
            gajiAkhir=gajiPokok+b;
            System.out.println(gajiAkhir);
        }else if(penjualan>=15 && penjualan<40){
            b=(10*(item*penjualan)/100);
            gajiAkhir=gajiPokok+b;
            System.out.println(gajiAkhir);
        }else if(penjualan<15){
            b=(15*((15-penjualan)*item))/100;
            gajiAkhir=gajiPokok-b;
            System.out.println(gajiAkhir);
        }
    }
}
