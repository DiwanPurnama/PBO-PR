/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal3;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class pembagian {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            System.out.println("Masukkan angka: ");
            int a = in.nextInt();
            System.out.println("Masukkan Pembagi: ");
            int b = in.nextInt();
        
            double hasil = a/b;
            System.out.println("Hasil pembagian : "+ hasil);
        }catch(Exception ex){
            System.out.println("Hasil pembagian tidak terdefinisi");
        }
        
    }
}
