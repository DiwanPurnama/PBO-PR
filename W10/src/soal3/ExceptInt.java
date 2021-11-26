/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal3;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ExceptInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            
            System.out.println("Masukkan Integer: ");
            int a = input.nextInt();
            System.out.println("Nilai input : "+ a);
        }catch(InputMismatchException ex){
            System.out.println("Inputan bukan Integer");
        }
        input.close();
        
    }
}
