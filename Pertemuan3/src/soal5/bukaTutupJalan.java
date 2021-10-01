/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal5;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class bukaTutupJalan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String noMobil=input.nextLine();
        String[] s=noMobil.split(" ");
        String gabungan=s[0]+s[1]+s[2]+s[3];
        long hsl=Long.parseLong(gabungan);
        long x=(hsl-999999);
        if(x%5==0){
            System.out.println("berhenti");
        }else{
            System.out.println("jalan");
        }
        
    }
}
