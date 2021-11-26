/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal3;

/**
 *
 * @author Windows 10
 */
public class ArrayException {
    public static void main(String[] args) {
        
        try{
            int[] angka ={7,3,20,2};
            for (int i= 0; i<=4;i++){
            System.out.println(angka[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index array tidak tersedia");
        }
    }  
}
