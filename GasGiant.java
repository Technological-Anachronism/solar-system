
public class GasGiant extends GiantPlanet 
{
    //fields
    private boolean rings;
    private String ringsComposition;
    //constructor
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
    //getters
    public boolean getRings(){
        return rings;
    }
    public String getRingsComposition(){
        return ringsComposition;
    }
    //overridden unique methods
    @Override
    public void isCalled(){
        System.out.println("This Gas Giant is called " + name);
    }
    @Override
    public void isLarge(){
        System.out.println("This Gas Giant has a radius of " + radius + 
                           radiusUnit);
    }
    @Override
    public void isHeavy(){
        System.out.println("This Gas Giant has a mass of " + mass + massUnit);
    }
    @Override
    public void isDense(){
        System.out.println("This Gas Giant has a density of " + density + 
                           densityUnit);
    }
    //overridden equals method
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
    //overridden toString method
    @Override
    public String toString(){
        return super.toString() + "\nrings: " + rings + 
               "\nrings composition: " + ringsComposition;
    }
}