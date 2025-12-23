//AstronomicalObject class used to break up number of fields 
//in planet class and to allow code ot be extendable
public abstract class AstronomicalObject {
    //fields
    protected String name;
    protected double radius;
    protected double mass;
    protected double density;
    protected String radiusUnit;
    protected String massUnit;
    protected String densityUnit;
    //constructor
    protected AstronomicalObject(String name, double radius, double mass, 
                                 String radiusUnit, String massUnit, 
                                 String densityUnit) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        density = calcDensity();
        this.radiusUnit = radiusUnit;
        this.massUnit = massUnit;
        this.densityUnit = densityUnit;
    }
    //getters
    public String getName(){
        return name;
    }    
    public double getRadius(){
        return radius;
    }
    public double getMass(){
        return mass;
    }
    public double getDensity(){
        return density;
    }
    public String getRadiusUnit(){
        return radiusUnit;
    }
    public String getMassUnit(){
        return massUnit;
    }
    public String getDensityUnit(){
        return densityUnit;
    }
    //calculates approximate density
    protected double calcDensity(){
        return ((mass * (Math.pow(10, 24))) / ((4 * (Math.pow(radius, 3)) * 3.1415) / (3)));    
    }
    //unique methods
    public void isCalled(){
        System.out.println("This Astronimcal Object is called " + name);
    }
    public void isLarge(){
        System.out.println("This Astronomical Object has a radius of " + 
        radius + radiusUnit);
    }
    public void isHeavy(){
        System.out.println("This Astronomical Object has a mass of " + mass + 
        massUnit);
    }
    public void isDense(){
        System.out.println("This Astronomical Object has a density of " + 
        density + densityUnit);
    }
    //overridden equals method
    @Override
    public boolean equals(Object other){
        if (!(other instanceof AstronomicalObject)){
            return false;
        }
        AstronomicalObject o = (AstronomicalObject)other;
        if((name.equals(o.getName())) &&
           (radius == o.getRadius()) &&
           (mass == o.getMass()) &&
           (density == o.getDensity()) &&
           (radiusUnit.equals(o.getRadiusUnit())) &&
           (massUnit.equals(o.getMassUnit())) &&
           (densityUnit.equals(o.getDensityUnit()))){
            return true;
        }
        else{
            return false;
        }
    }
    //overriden string method
    @Override
    public String toString(){
        return "name: " + name + "\nradius: " + radius + radiusUnit +
               "\nmass: " + mass + massUnit + "\ndensity: " + density + 
               densityUnit;
    }
}
