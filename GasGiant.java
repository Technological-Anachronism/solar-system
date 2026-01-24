/** 
 * File containing the GasGiant class
 * 
 * @author Technological Anachronism
 * @version v1.0
 */

/** GasGiant class conataining fields for attributes specific to gas giants */
public class GasGiant extends GiantPlanet 
{
    /** Boolean as to whether or not the gas giant has rings */
    private boolean rings;
    /** The chemical composition of the gas giant if applicable */
    private String ringsComposition;
    /** Constructor creating an instance of the GasGiant class with the given parameters */
    public GasGiant(String name, double radius, double mass, double temp, 
                    int numMoons, boolean water, String funFact, 
                    double distFromSun, double rotationalPeriod, 
                    double orbitalPeriod, String atmosphericComposition, 
                    String centreComposition, boolean rings, 
                    String ringsComposition){
        super(name, radius, mass, temp, "Atmospheric", numMoons, water, funFact, 
              distFromSun, rotationalPeriod, orbitalPeriod, 
              atmosphericComposition, centreComposition);
        this.rings = rings;
        this.ringsComposition = ringsComposition;
    } 
    /** Accessor method to get the boolean as to whether or not the gas giant has rings */
    public boolean getRings(){
        return rings;
    }
    /** Accessor method to get the composition of the gas giants rings if applicable */
    public String getRingsComposition(){
        return ringsComposition;
    }
    /** Method to print a string about the name field */
    @Override
    public void isCalled(){
        System.out.println("This Gas Giant is called " + name);
    }
    /** Method to print a string about the radius field */
    @Override
    public void isLarge(){
        System.out.println("This Gas Giant has a radius of " + radius + 
                           radiusUnit);
    }
    /** Method to print a string about the mass field */
    @Override
    public void isHeavy(){
        System.out.println("This Gas Giant has a mass of " + mass + massUnit);
    }
    /** Method to print a string about the density field */
    @Override
    public void isDense(){
        System.out.println("This Gas Giant has a density of " + density + 
                           densityUnit);
    }
    /** Equals method override using the class fields */
    @Override
    public boolean equals(Object other){
        if (!(other instanceof GasGiant)){
            return false;
        }
        GasGiant o = (GasGiant)other;
        if((rings == o.getRings()) && 
           (ringsComposition.equals(o.getRingsComposition())) && 
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
        return super.toString() + "\nrings: " + rings + 
               "\nrings composition: " + ringsComposition;
    }
}
