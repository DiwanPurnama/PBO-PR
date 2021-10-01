/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigInteger;
import java.util.Scanner;
import java.math.BigInteger;

/**
 *
 * @author Windows 10
 */
public class bigInteger {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        BigInteger a,b;
        a=input.nextBigInteger();
        b=input.nextBigInteger();
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
