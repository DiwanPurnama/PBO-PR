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
class HexFormatException {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean finish = false;
        do{
        try{
            System.out.print("Masukkan bilangan Hexadecimal: ");
            String input = in.nextLine();
            System.out.println("Bilangan "+input+" = "+ hexToDecimal(input)+" di decimal.");
            System.out.println("Bilangan "+input+" merupakan bilangan Hexadecimal.");
            finish = true;
        }
        catch (NumberFormatException ex){
            System.out.println(ex.getMessage());
        }
        } while (!finish);
    }
    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch) throws NumberFormatException{
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        
        //untuk menghandle huruf kecil
        else if (ch >= 'a' && ch <= 'a')
            return 10 + ch - 'a';
        
        else if (ch>= '0' && ch<= '9') 
            return ch - '0';
        else throw new NumberFormatException("Input bukan bilangan Hexadecimal, silahkan masukkan kembali bilangan!");
    }
}
