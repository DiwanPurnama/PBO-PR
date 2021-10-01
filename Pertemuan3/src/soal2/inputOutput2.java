/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class inputOutput2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] s=new String[3];
        int[] x=new int[3];
        
       for(int i=0;i<3;i++){
           s[i]=input.next();
           x[i]=input.nextInt();
       }
    
        System.out.println("===================");
        for(int j=0;j<3;j++){
            System.out.format("%-15s%03d%n",s[j],x[j]);
        }
        System.out.println("===================");
    }
}
