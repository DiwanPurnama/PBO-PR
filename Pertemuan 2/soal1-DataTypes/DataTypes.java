/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        int T;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Masukkan Jumlah yang akan diinputkan: ");
        T=keyboard.nextInt();
        for(int i=0;i<=T;i++){
            try{
                System.out.println("Masukkan angka: ");
                long n=keyboard.nextLong();
                System.out.println(n+" can be fitted in: ");
                if(n>=Byte.MIN_VALUE && n<=Byte.MAX_VALUE){
                    System.out.println("*byte");
                }
                else if(n>=Short.MIN_VALUE && n<=Short.MAX_VALUE){
                    System.out.println("*short");
                }
                else if(n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE){
                    System.out.println("*int");
                }
                else if(n>=Long.MIN_VALUE && n<=Long.MAX_VALUE){
                    System.out.println("*long");
                }
            }catch(Exception e){
                System.out.println(keyboard.nextLine()+" can’t be fitted anywhere");
            }
            
        }
    }
}
