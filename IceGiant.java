/** 
 * File containing the IceGiant class
 * 
 * @author Technological Anachronism
 * @version v1.0
 */

/** IceGiant class conataining fields for attributes specific to ice giants */
public class IceGiant extends GiantPlanet
{
    /** Measurement of the temperature of the core of the ice giant*/
    private double coreTemp;
    /** Boolean as to whether or not the core of the ice giant is solid */
    private boolean solidCore;
    /** Constructor creating an ice giant instance with the given parameters */
    protected IceGiant(String name, double radius, double mass, double temp,
                       int numMoons, boolean water, 
                       String funFact, double distFromSun, 
                       double rotationalPeriod, double orbitalPeriod, 
                       String atmosphericComposition, String centreComposition,
                       double coreTemp, boolean solidCore){
        super(name, radius, mass, temp, "Atmospheric", numMoons, water, funFact, 
              distFromSun, rotationalPeriod, orbitalPeriod, 
              atmosphericComposition, centreComposition);
        this.coreTemp = coreTemp;
        this.solidCore = solidCore;
    }
    

    /** Accessor method for the core temperature of the ice giant */
    public double getCoreTemp(){
        return coreTemp;
    }
    /** Accessor method to get the boolean as to whether or not the ice giant has a solid core */
    public boolean getSolidCore(){
        return solidCore;
    }
    /** Method to print a string about the name field */
    @Override
    public void isCalled(){
        System.out.println("This Ice Giant is called " + name);
    }
    /** Method to print a string about the radius field */
    @Override
    public void isLarge(){
        System.out.println("This Ice Giant has a radius of " + radius + 
                           radiusUnit);
    }
    /** Method to print a string about the mass field */
    @Override
    public void isHeavy(){
        System.out.println("This Ice Giant has a mass of " + mass + massUnit);
    }
    /** Method to print a string about the density field */
    @Override
    public void isDense(){
        System.out.println("This Ice Giant has a density of " + density + 
                           densityUnit);
    }
    /** Equals method override using the class fields */
    @Override
    public boolean equals(Object other){
        if (!(other instanceof IceGiant)){
            return false;
        }
        IceGiant o = (IceGiant)other;
        if((coreTemp == o.getCoreTemp()) && 
           (solidCore == o.getSolidCore()) && 
           (super.equals((GiantPlanet)other))){
            return true;
        }
        else{
            return false;
        }
    }
    /** ToString method override */
    @Override
    public String toString(){
        return super.toString() + "\ncore temp: " + 
               coreTemp + "K" + "\nsolid core : " + solidCore;
    }
}
