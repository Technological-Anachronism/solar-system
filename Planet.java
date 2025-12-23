//this class covers all major planets in our solar system
public abstract class Planet extends AstronomicalObject {
    //fields
    protected double temp;
    protected int numMoons;
    protected boolean water;
    protected String funFact;
    protected double distFromSun;
    protected String distFromSunUnit;
    protected double rotationalPeriod;
    protected double orbitalPeriod;
    protected String rotationalPeriodUnit;
    protected String orbitalPeriodUnit;
    //constructor
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
    //getters
    public double getTemp(){
        return temp;
    }
    public int getNumMoons() {
        return numMoons;
    }
    public boolean getWater(){
        return water;
    }
    public String getFunFact(){
        return funFact;
    }
    public double getDistFromSun(){
        return distFromSun;
    }
    public String getDistFromSunUnit(){
        return distFromSunUnit;
    }
    public double getRotationalPeriod(){
        return rotationalPeriod;
    }
    public double getOrbitalPeriod(){
        return orbitalPeriod;
    }
    public String getRotationalPeriodUnit(){
        return rotationalPeriodUnit;
    }
    public String getOrbitalPeriodUnit() {
        return orbitalPeriodUnit;
    }
    //unique methods
    public void rotates(){
        System.out.println(name + " completes one rotation every " + 
                           rotationalPeriod + rotationalPeriodUnit + ".\n");
    }
    public void orbits(){
        System.out.println(name + " completes one orbit every " + 
                           orbitalPeriod + orbitalPeriodUnit + ".\n");
    }
    public void showTemp(){
        System.out.println(name + " has a temperature of " + temp + "C°");
    }
    //overridden unique methods
    @Override
    public void isCalled(){
        System.out.println("This Planet is called " + name);
    }
    @Override
    public void isLarge(){
        System.out.println("This Planet has a radius of " + radius + 
                           radiusUnit);
    }
    @Override
    public void isHeavy(){
        System.out.println("This Planet has a mass of " + mass + massUnit);
    }
    @Override
    public void isDense(){
        System.out.println("This Planet has a density of " + density + 
                           densityUnit);
    }
    //overidden equals method
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
    //overidden toString method
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