/** 
 * File containing the Planet class
 * 
 * @author Technological Anachronism
 * @version v1.0
 */

/** TerrestrialPlanet class containing fields with information relevant to any terrestrial planet */
public abstract class TerrestrialPlanet extends Planet {   
    /** Boolean as to whether or not a human has explored the planet */
    private boolean explored;
    /** Boolean as to whether or not a rover has been sent to this planet */
    private boolean roverSent;
    
    /** Constructor creating a terrestrial planet instance with the given parameters */
    public TerrestrialPlanet(String name, double radius, double mass, 
                             double temp, int numMoons, boolean water, 
                             String funFact, double distFromSun, 
                             double rotationalPeriod, double orbitalPeriod, 
                             boolean explored, boolean roverSent){
        super(name, radius, mass, temp, numMoons, water, funFact, distFromSun, 
              rotationalPeriod, orbitalPeriod);
        this.explored = explored;
        this.roverSent = roverSent;
    } 
    
    /* --- Getter methods, system is illustrative so no setter methods are neccesary --- */
    
    /** Accessor method to get the boolean as to whether or not this planet has been explored by humans */
    public boolean getExplored(){
        return explored;
    }
    /** Accessor method to get the boolean as to whether or not a rover has been sent to this planet */
    public boolean getRoverSent(){
        return roverSent;
    }
   
    /** Method to print a string about the temp field */
    @Override
    public void showTemp(){
        System.out.println(name + " has a Surface temperature of " + temp + 
                           "C°");
    }
    /** Method to print a string about the name field */
    @Override
    public  void isCalled(){
        System.out.println("This Terrestrial Planet is called " + name);
    }
    /** Method to print a string about the radius field */
    @Override
    public void isLarge(){
        System.out.println("This Terrestrial Planet has a radius of " + radius + 
                           radiusUnit);
    }
    /** Method to print a string about the mass field */
    @Override
    public void isHeavy(){
        System.out.println("This Terrestrial Planet has a mass of " + mass + 
                           massUnit);
    }
    /** Method to print a string about the density field */
    @Override
    public void isDense(){
        System.out.println("This Terrestrial Planet has a density of " + 
                           density + densityUnit);
    }

    /** Equals method override using the class fields */
    @Override
    public boolean equals(Object other){
        
        if (!(other instanceof TerrestrialPlanet)){
            return false;
        }
        TerrestrialPlanet o = (TerrestrialPlanet)other;
        if((explored == o.getExplored()) && 
           (roverSent == o.getRoverSent()) && 
           (super.equals((Planet)other))){
            return true;
        }
        else{
            return false;
        }
    }
    
    /** ToString method override */
    @Override
    public String toString(){
        return super.toString() + "\nbeen explored: " + explored + 
        "\nrover sent: " + roverSent;
    }
}
