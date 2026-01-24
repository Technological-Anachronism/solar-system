/** 
 * File containing the Planet class
 * 
 * @author Technological Anachronism
 * @version v1.0
 */

/** IcyPlanet class containing fields with information relevant to any icy planet */
public class IcyPlanet extends TerrestrialPlanet {
    /** Boolean as to whether or not this planet has a subsurface ocean */
    private boolean subsurfaceOcean;
    /** Boolean as to whether or not this planet has a core comprised of metal */
    private boolean metallicCore;
    
    /** Constructor creating an icy planet instance with the given parameters */
    public IcyPlanet(String name, double radius, double mass, double temp, 
                          int numMoons, boolean water, String funFact, 
                          double distFromSun, double rotationalPeriod, 
                          double orbitalPeriod, boolean explored, 
                          boolean roverSent, boolean surfaceLiquidWater, 
                          boolean life, boolean subsurfaceOcean,
                          boolean metallicCore){
        super(name, radius, mass, temp, numMoons, water, funFact, distFromSun, 
              rotationalPeriod, orbitalPeriod, explored, roverSent);
        this.subsurfaceOcean = subsurfaceOcean;
        this.metallicCore = metallicCore;
    }
    
    /* --- Getter methods, system is illustrative so no setter methods are neccesary --- */
    
    /** Accessor method to get the boolean as to whether or not this planet has a subsurface ocean */
    public boolean getSubsurfaceOcean(){
        return subsurfaceOcean;
    }
    /** Accessor method to get the boolean as to whether or not this planet has a core comprised of metal */
    public boolean getMetallicCore(){
        return metallicCore;
    }
    
    /** Method to print a string about the name field */
    @Override
    public void isCalled(){
        System.out.println("This Icy Planet is called " + name);
    }
    /** Method to print a string about the radius field */
    @Override
    public void isLarge(){
        System.out.println("This Icy Planet has a radius of " + radius + 
                           radiusUnit);
    }
    /** Method to print a string about the mass field */
    @Override
    public void isHeavy(){
        System.out.println("This Icy Planet has a mass of " + mass + massUnit);
    }
    /** Method to print a string about the density field */
    @Override
    public void isDense(){
        System.out.println("This Icy Planet has a density of " + density + 
                           densityUnit);
    }
    
    /** Equals method override using the class fields */
    @Override
    public boolean equals(Object other){
        if (!(other instanceof IcyPlanet)){
            return false;
        }
        IcyPlanet o = (IcyPlanet)other;
        if((subsurfaceOcean == o.getSubsurfaceOcean()) && 
           (metallicCore == o.getMetallicCore()) && 
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
        return super.toString() + "\nhas subsurface oceans: " + 
               subsurfaceOcean + "\nhas metallic core: " + metallicCore;
    }
}
