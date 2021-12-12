/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasTeori;

/**
 *
 * @author Windows 10
 */
public class Main {
    public static void main(String[] args) {
        Family family = new Family();
        //Add niece
        family.addNiece("Ardi", 12, 8);
        family.addNiece("Mira", 7, 11);
        //checking if add same niece
        if(!family.addNiece("Ardi", 12, 8)) System.out.println("You add duplicate value");        
        //Add Uncle
        family.addUncle("Rian");
        family.addUncle("Zain");
        
        //Find Uncle
        Uncle uncle = family.findUncle("Rian");
        Uncle uncle1 = family.findUncle("Zain");
        if(family.findUncle("Om") == null) System.out.println("Uncle didn't found!");
        
        //Add Present
        uncle.addPresent(family.findNiece("Ardi"), "Laptop");
        family.addNiece("Putri", 14, 7);
        
        //Checking uncle give same present to nieces
        uncle.addPresent(family.findNiece("Mira"), "Buku");
        uncle.addPresent(family.findNiece("Putri"), "Buku");
        //Check that two uncles give the same gift to one niece
        uncle1.addPresent(family.findNiece("Mira"), "Buku");
        //Checking list Nieces, Uncles and Presents
        family.listNieces();
        family.listUncles();
        uncle.listPresents();
        family.findNiece("Ardi").listPresents();
        family.findNiece("Mira").listPresents();
        
    }
}
