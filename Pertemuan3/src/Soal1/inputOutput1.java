/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1;
import java.util.*;

/**
 *
 * @author Windows 10
 */
public class inputOutput1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String s=input.nextLine();
        
        String[] arr=s.split("[ !,?._'@]");
        System.out.println(arr.length);
        for(String a:arr)
            System.out.println(a);      
    }
}
