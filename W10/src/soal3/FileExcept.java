/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal3;
import java.io.*;

/**
 *
 * @author Windows 10
 */
public class FileExcept {
    public static void main(String[] args){
        FileInputStream file = null;
        try {
            file = new FileInputStream(
                "test.txt");
        }
        catch (FileNotFoundException e) {

            System.out.println("File does not exist");
        }
    }
}
