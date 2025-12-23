
public class SilicatePlanet extends TerrestrialPlanet {
    //fields
    private boolean surfaceLiquidWater;
    private boolean life;
    //constructor
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
    //getters
    public boolean getSurfaceLiquidWater(){
        return surfaceLiquidWater;
    }
    public boolean getLife(){
        return life;
    }
    //overidden unique methods
    @Override
    public void isCalled(){
        System.out.println("This Silicate Planet is called " + name);
    }
    @Override
    public void isLarge(){
        System.out.println("This Silicate Planet has a radius of " + radius + 
                           radiusUnit);
    }
    @Override
    public void isHeavy(){
        System.out.println("This Silicate Planet has a mass of " + mass + 
                           massUnit);
    }
    @Override
    public void isDense(){
        System.out.println("This Silicate Planet has a density of " + density + 
                           densityUnit);
    }
    //overridden equals method
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
    //overridden toString method
    @Override
    public String toString(){
        return super.toString() + "\nhas liquid water on surface: " + 
               surfaceLiquidWater + "\nhas life: " + life;
    }
}