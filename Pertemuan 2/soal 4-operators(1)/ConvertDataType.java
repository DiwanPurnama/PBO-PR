/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
public class ConvertDataType {
    static short MethodeOne(long l){
        int i=(int) l;
        return (short)l;
    }
    public static void main(String[] args) {
        double d=10.25;
        float f=(float)d;
        byte b=(byte) MethodeOne((long)f);
        System.out.println(b);
    }
}
