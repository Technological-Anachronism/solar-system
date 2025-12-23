
public class IcyPlanet extends TerrestrialPlanet {
    //this field is unique to icy planets as silicate Planets 
    //do not have subsurface oceans
    private boolean subsurfaceOcean;
    //all Silicate Planets have metal cores by default
    //but Icy planets can exist without one
    private boolean metallicCore;
    
    //constructor
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
    //getters
    public boolean getSubsurfaceOcean(){
        return subsurfaceOcean;
    }
    public boolean getMetallicCore(){
        return metallicCore;
    }
    //overidden unique methods
    @Override
    public void isCalled(){
        System.out.println("This Icy Planet is called " + name);
    }
    @Override
    public void isLarge(){
        System.out.println("This Icy Planet has a radius of " + radius + 
                           radiusUnit);
    }
    @Override
    public void isHeavy(){
        System.out.println("This Icy Planet has a mass of " + mass + massUnit);
    }
    @Override
    public void isDense(){
        System.out.println("This Icy Planet has a density of " + density + 
                           densityUnit);
    }
    //overridden equals method
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
    //overridden toString method
    @Override
    public String toString(){
        return super.toString() + "\nhas subsurface oceans: " + 
               subsurfaceOcean + "\nhas metallic core: " + metallicCore;
    }
}