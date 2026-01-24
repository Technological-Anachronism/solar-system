/** 
 * File containing the Planet class
 * 
 * @author Technological Anachronism
 * @version v1.0
 */

/** SilicatePlanet class containing fields with information relevant to any silicate planet */
public class SilicatePlanet extends TerrestrialPlanet {
    /** Boolean as to whether or not this planet has liquid water on it's surface */
    private boolean surfaceLiquidWater;
    /** Boolean as to whether or not this planet has life */
    private boolean life;
    
    /** Constructor creating a silicate planet instance with the given parameters */
    public SilicatePlanet(String name, double radius, double mass, double temp, 
                          int numMoons, boolean water, String funFact, 
                          double distFromSun, double rotationalPeriod, 
                          double orbitalPeriod, boolean explored, 
                          boolean roverSent, boolean surfaceLiquidWater, 
                          boolean life){
        super(name, radius, mass, temp, numMoons, water, funFact, distFromSun, 
              rotationalPeriod, orbitalPeriod, explored, roverSent);
        this.surfaceLiquidWater = surfaceLiquidWater;
        this.life = life;
    } 
    
    /* --- Getter methods, system is illustrative so no setter methods are neccesary --- */
    
    /** Accessor method to get the boolean as to whether or not this planet has liquid water on it's surface */
    public boolean getSurfaceLiquidWater(){
        return surfaceLiquidWater;
    }
    /** Accessor method to get the boolean as to whether or not this planet has life */
    public boolean getLife(){
        return life;
    }
    /** Method to print a string about the name field */
    @Override
    public void isCalled(){
        System.out.println("This Silicate Planet is called " + name);
    }
    /** Method to print a string about the radius field */
    @Override
    public void isLarge(){
        System.out.println("This Silicate Planet has a radius of " + radius + 
                           radiusUnit);
    }
    /** Method to print a string about the mass field */
    @Override
    public void isHeavy(){
        System.out.println("This Silicate Planet has a mass of " + mass + 
                           massUnit);
    }
    /** Method to print a string about the density field */
    @Override
    public void isDense(){
        System.out.println("This Silicate Planet has a density of " + density + 
                           densityUnit);
    }
    
    /** Equals method override using the class fields */
    @Override
    public boolean equals(Object other){
        if (!(other instanceof SilicatePlanet)){
            return false;
        }
        SilicatePlanet o = (SilicatePlanet)other;
        if((surfaceLiquidWater == o.getSurfaceLiquidWater()) && 
           (life == o.getLife()) && 
           (super.equals((TerrestrialPlanet)other))){
            return true;
        }
        else{
            return false;
        }
    }
    
    /** ToString method override */
    @Override
    public String toString(){
        return super.toString() + "\nhas liquid water on surface: " + 
               surfaceLiquidWater + "\nhas life: " + life;
    }
}
