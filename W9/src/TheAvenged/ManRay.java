/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheAvenged;

/**
 *
 * @author Windows 10
 */
public class ManRay extends SuperHero {
    public ManRay(String name, int powerLevel) {
        super(name, powerLevel);        //Call SuperHero constructor 
        addPower(new LaserEye());
        addPower(new Strength());
    }


    //Prints out Identity of the hero
    @Override
    public void identity(){
        System.out.println("It's " + this.getName() + ", the ManRay! It has the power level of " + this.getPowerLevel());
    }
}
