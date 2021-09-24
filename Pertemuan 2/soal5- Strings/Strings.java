/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.println("Masukkan string A: ");
        String A=str.next();
        System.out.println("Masukkan string B: ");
        String B=str.next();
        
        int jml=A.length()+B.length();
        System.out.println(jml);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
    }
 
}
