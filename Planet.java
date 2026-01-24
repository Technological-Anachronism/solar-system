/*
 * File containing the Planet class
 * 
 * @author Technological Anachronism
 * @version v1.0
 */

/** Planet class containing fields with information relevant to any planet */
public abstract class Planet extends AstronomicalObject {
    /** Average temperature of the planet */
    protected double temp;
    /** Number of moons orbiting the planet */
    protected int numMoons;
    /** Boolean as to whether or not the planets composition contains H2O */
    protected boolean water;
    /** A fun fact about the planet */
    protected String funFact;
    /** Distance between the plant and the sun */
    protected double distFromSun;
    /** Unit used to measure the distance between the plant and the sun */
    protected String distFromSunUnit;
    /** Time taken for the planet to complete one full rotation on its axis */
    protected double rotationalPeriod;
    /** Time taken for the planet to complete one full orbit around the sun */
    protected double orbitalPeriod;
    /** Unit of time used to measure the rotational period of the planet */
    protected String rotationalPeriodUnit;
    /** Unit of time used to measure the orbital period of the planet */
    protected String orbitalPeriodUnit;
    
    /** Constructor creating a planet instance with the given parameters */
    protected Planet(String name, double radius, double mass, double temp, 
                     int numMoons, boolean water, String funFact, 
                     double distFromSun, double rotationalPeriod, 
                     double orbitalPeriod) {
                         
        super(name, radius, mass, " km", " E24 kg", " kg/m^(3)");
        this.temp = temp;
        this.numMoons = numMoons;
        this.water = water;
        this.funFact = funFact;
        this.distFromSun = distFromSun;
        this.distFromSunUnit = " E6 km";
        this.rotationalPeriod = rotationalPeriod;
        this.orbitalPeriod = orbitalPeriod;
        this.rotationalPeriodUnit = " hrs";
        this.orbitalPeriodUnit = " Earth Days";
    }
    
    /* --- Getter methods, system is illustrative so no setter methods are neccesary --- */
    
    /** Accessor method to get the average temperature of the planet */
    public double getTemp(){
        return temp;
    }
    /** Accessor method to get the number of moons orbiting the planet */
    public int getNumMoons() {
        return numMoons;
    }
    /** Accessor method to get the boolean as to whether or not the planets composition contains H2O */
    public boolean getWater(){
        return water;
    }
    /** Accessor method to get the fun fact about the planet */
    public String getFunFact(){
        return funFact;
    }
    /** Accessor method to get the distance between the plant and the sun */
    public double getDistFromSun(){
        return distFromSun;
    }
    /** Accessor method to get the unit used to measure the distance between the plant and the sun */
    public String getDistFromSunUnit(){
        return distFromSunUnit;
    }
    /** Accessor method to get the time taken for the planet to complete one full rotation on its axis */
    public double getRotationalPeriod(){
        return rotationalPeriod;
    }
    /** Time taken for the planet to complete one full orbit around the sun */
    public double getOrbitalPeriod(){
        return orbitalPeriod;
    }
    /** Unit of time used to measure the rotational period of the planet */
    public String getRotationalPeriodUnit(){
        return rotationalPeriodUnit;
    }
    /** Unit of time used to measure the orbital period of the planet */
    public String getOrbitalPeriodUnit() {
        return orbitalPeriodUnit;
    }
     
    /** Method to print a string about the rotationalPeriod field */
    public void rotates(){
        System.out.println(name + " completes one rotation every " + 
                           rotationalPeriod + rotationalPeriodUnit + ".\n");
    }
    /** Method to print a string about the orbitalPeriod field */
    public void orbits(){
        System.out.println(name + " completes one orbit every " + 
                           orbitalPeriod + orbitalPeriodUnit + ".\n");
    }
    /** Method to print a string about the temp field */
    public void showTemp(){
        System.out.println(name + " has a temperature of " + temp + "C°");
    }
    /** Method to print a string about the name field */
    @Override
    public void isCalled(){
        System.out.println("This Planet is called " + name);
    }
    /** Method to print a string about the radius field */
    @Override
    public void isLarge(){
        System.out.println("This Planet has a radius of " + radius + 
                           radiusUnit);
    }
    /** Method to print a string about the mass field */
    @Override
    public void isHeavy(){
        System.out.println("This Planet has a mass of " + mass + massUnit);
    }
    /** Method to print a string about the density field */
    @Override
    public void isDense(){
        System.out.println("This Planet has a density of " + density + 
                           densityUnit);
    }
    
    /** Equals method override using the class fields */
    @Override
    public boolean equals(Object other){
        if (!(other instanceof Planet)){
            return false;
        }
        Planet o = (Planet)other;
        if((temp == o.getTemp()) &&
            (numMoons == o.getNumMoons()) &&
            (water == o.getWater()) &&
            (funFact.equals(o.getFunFact())) &&
            (distFromSun == o.getDistFromSun()) &&
            (distFromSunUnit.equals(o.getDistFromSunUnit())) &&
            (rotationalPeriod == o.getRotationalPeriod()) &&
            (orbitalPeriod == o.getOrbitalPeriod()) &&
            (rotationalPeriodUnit.equals(o.getRotationalPeriodUnit())) &&
            (orbitalPeriodUnit.equals(o.getOrbitalPeriodUnit())) && 
            ((super.equals((AstronomicalObject)other)))){
            return true;
        }
        else{
            return false;
        }
    }
    /** ToString method override */
    @Override
    public String toString(){
        return super.toString() + "\ntemp: " + 
        temp + "\n№ of moons: " + numMoons + 
        "\nhas water: " + water + "\nfun fact: " + funFact + 
        "\ndistance from sun: " + distFromSun + distFromSunUnit + 
        "\nrotation: " + rotationalPeriod + rotationalPeriodUnit + 
        "\norbit: " + orbitalPeriod + orbitalPeriodUnit;
    }
}
