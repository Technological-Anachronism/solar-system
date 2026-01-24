/** 
 * File containing the GiantPlanet class
 * 
 * @author Technological Anachronism
 * @version v1.0
 */

/** GiantPlanet class conataining fields for attributes specific to giant planets */
public abstract class GiantPlanet extends Planet {
    /** The chemical composition of the giant planets atmosphere */
    protected String atmosphericComposition;
    /** The chemical composition of the giant planets centre */
    protected String centreComposition;
    /** Constructor creating an instance of the GiantPlanet class with the given parameters */
    protected GiantPlanet(String name, double radius, double mass, double temp, 
                          String tempType, int numMoons, boolean water, 
                          String funFact, double distFromSun, 
                          double rotationalPeriod, double orbitalPeriod, 
                          String atmosphericComposition, 
                          String centreComposition){
        super(name, radius, mass, temp, numMoons, water, funFact, 
              distFromSun, rotationalPeriod, orbitalPeriod);
        this.atmosphericComposition = atmosphericComposition;
        this.centreComposition = centreComposition;
    }

    /* --- Getter methods, system is illustrative so no setter methods are neccesary --- */

    /** Accessor method for the atmospheric composition of the gas giant */
    public String getAtmosphericComposition(){
        return atmosphericComposition;
    }
    /** Accessor method for the centre composition of the gas giant */
    public String getCentreComposition(){
        return centreComposition;
    }
    /** Method to print a string about the temp field */
    @Override
    public void showTemp(){
        System.out.println(name + " has an Atmospheric temperature of " + 
                           temp + "C°");
    }
    /** Method to print a string about the name field */
    @Override
    public void isCalled(){
        System.out.println("This Giant Planet is called " + name);
    }
    /** Method to print a string about the radius field */
    @Override
    public void isLarge(){
        System.out.println("This Giant Planet has a radius of " + radius + 
                           radiusUnit);
    }
    /** Method to print a string about the mass field */
    @Override
    public void isHeavy(){
        System.out.println("This Giant Planet has a mass of " + mass + massUnit);
    }
    /** Method to print a string about the density field */
    @Override
    public void isDense(){
        System.out.println("This Giant Planet has a density of " + density + 
                           densityUnit);
    }
    /** Equals method override using the class fields */
    @Override
    public boolean equals(Object other){
        if (!(other instanceof GiantPlanet)){
            return false;
        }
        GiantPlanet o = (GiantPlanet)other;
        if((atmosphericComposition.equals(o.getAtmosphericComposition())) && 
           (centreComposition.equals(o.getCentreComposition())) && 
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
        return super.toString() + "\natmospheric composition: " + 
               atmosphericComposition + "\ncentre composition: " + 
               centreComposition;
    }
}
