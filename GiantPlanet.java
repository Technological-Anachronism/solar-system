
public abstract class GiantPlanet extends Planet {
    //fields
    protected String atmosphericComposition;
    protected String centreComposition;
    //constructor
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
    //getters
    public String getAtmosphericComposition(){
        return atmosphericComposition;
    }
    public String getCentreComposition(){
        return centreComposition;
    }
    //overridden unique methods
    @Override
    public void showTemp(){
        System.out.println(name + " has an Atmospheric temperature of " + 
                           temp + "C°");
    }
    @Override
    public void isCalled(){
        System.out.println("This Giant Planet is called " + name);
    }
    @Override
    public void isLarge(){
        System.out.println("This Giant Planet has a radius of " + radius + 
                           radiusUnit);
    }
    @Override
    public void isHeavy(){
        System.out.println("This Giant Planet has a mass of " + mass + massUnit);
    }
    @Override
    public void isDense(){
        System.out.println("This Giant Planet has a density of " + density + 
                           densityUnit);
    }
    //overidden equals method
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
    //overridden toString method
    @Override
    public String toString(){
        return super.toString() + "\natmospheric composition: " + 
               atmosphericComposition + "\ncentre composition: " + 
               centreComposition;
    }
}