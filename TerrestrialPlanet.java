
public abstract class TerrestrialPlanet extends Planet
{   
    //fields
    private boolean explored;
    private boolean roverSent;
    //constructor
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
    //getters
    public boolean getExplored(){
        return explored;
    }
    public boolean getRoverSent(){
        return roverSent;
    }
    //overridden unique methods
    @Override
    public void showTemp(){
        System.out.println(name + " has a Surface temperature of " + temp + 
                           "C°");
    }
    @Override
    public  void isCalled(){
        System.out.println("This Terrestrial Planet is called " + name);
    }
    @Override
    public void isLarge(){
        System.out.println("This Terrestrial Planet has a radius of " + radius + 
                           radiusUnit);
    }
    @Override
    public void isHeavy(){
        System.out.println("This Terrestrial Planet has a mass of " + mass + 
                           massUnit);
    }
    @Override
    public void isDense(){
        System.out.println("This Terrestrial Planet has a density of " + 
                           density + densityUnit);
    }
    //overridden equals method
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
    //overridden toString method
    @Override
    public String toString(){
        return super.toString() + "\nbeen explored: " + explored + 
        "\nrover sent: " + roverSent;
    }
}