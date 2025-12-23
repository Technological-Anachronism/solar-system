
public class IceGiant extends GiantPlanet
{
    //fields
    private double coreTemp;
    private boolean solidCore;
    //constructor
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
    //getters
    public double getCoreTemp(){
        return coreTemp;
    }
    public boolean getSolidCore(){
        return solidCore;
    }
    //overidden unique methods
    @Override
    public void isCalled(){
        System.out.println("This Ice Giant is called " + name);
    }
    @Override
    public void isLarge(){
        System.out.println("This Ice Giant has a radius of " + radius + 
                           radiusUnit);
    }
    @Override
    public void isHeavy(){
        System.out.println("This Ice Giant has a mass of " + mass + massUnit);
    }
    @Override
    public void isDense(){
        System.out.println("This Ice Giant has a density of " + density + 
                           densityUnit);
    }
    //overridden equals method
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
    //overridden toString method
    @Override
    public String toString(){
        return super.toString() + "\ncore temp: " + 
               coreTemp + "K" + "\nsolid core : " + solidCore;
    }
}