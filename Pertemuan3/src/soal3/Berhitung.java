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
public class Berhitung {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char lagi;
        do{
            //input operasi
            int a=input.nextInt();
            char op=input.next().charAt(0);
            int b=input.nextInt();
            if((a<1 || a>1000) && (b<1 || b>1000)) {
                System.out.println("Angka melebihi batas");
            }else{
            
            switch(op){
                case '+':
                    System.out.println(a+b);
                    break;
                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                case '/':
                     if(a%b!=0){
                        System.out.println("bilangan a tidak habis dibagi b");
                    }else{
                         System.out.println(a/b);
                    }
                    
                    break;
                case '%':
                    System.out.println(a%b);
                    break;
                default:
                    System.out.println("Operator salah");
                    break;
            
            }
            }
            System.out.println("Ingin berhitung lagi?(y/n)");
            lagi=input.next().charAt(0);
        }while(lagi=='y');
        
        
    }
}
