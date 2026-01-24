/** 
 * File containing the AstronomicalObject class
 * 
 * @author Technological Anachronism
 * @version v1.0
 */

/** AstronomicalObject class, containing general attributes of any astronomical object */
public abstract class AstronomicalObject {
    
    /** Name of the astronomical object */
    protected String name;
    /** Measurement of the radius of the astronomical object */
    protected double radius;
    /** Measurement of the mass of the astronomical object */
    protected double mass;
    /** Measurement of the density of the astronomical object */
    protected double density;
    /** Unit with which the radius of the astronomical object is measured */
    protected String radiusUnit;
    /** Unit with which the mass of the astronomical object is measured */
    protected String massUnit;
    /** Unit with which the density of the astronomical object is measured */
    protected String densityUnit;

    /** Constructor creating an astronomical object instance with the given parameters */
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
    
    /* --- Getter methods, system is illustrative so no setter methods are neccesary --- */

    /** Accessor method to get the name of the astronmical object */
    public String getName(){
        return name;
    }    
    /** Accessor method to get the radius of the astronomical object */
    public double getRadius(){
        return radius;
    }
    /** Accessor method to get the mass of the astronomical object */
    public double getMass(){
        return mass;
    }
    /** Accessor method to get the density of the astronomical object */
    public double getDensity(){
        return density;
    }
    /** Accessor method to get the unit of the radius of the astronomical object */
    public String getRadiusUnit(){
        return radiusUnit;
    }
    /** Accessor method to get the unit of the mass of the astronomical object */
    public String getMassUnit(){
        return massUnit;
    }
    /** Accessor method to get the unit of the density of the astronomical object */
    public String getDensityUnit(){
        return densityUnit;
    }
    /** Method to calculate the density of the astronomical object using the mass and radius fields */
    protected double calcDensity(){
        return ((mass * (Math.pow(10, 24))) / ((4 * (Math.pow(radius, 3)) * 3.1415) / (3)));    
    }
    /** Method to print a string about the name field */
    public void isCalled(){
        System.out.println("This Astronimcal Object is called " + name);
    }
    /** Method to print a string about the radius field */
    public void isLarge(){
        System.out.println("This Astronomical Object has a radius of " + 
        radius + radiusUnit);
    }
    /** Method to print a string about the mass field */
    public void isHeavy(){
        System.out.println("This Astronomical Object has a mass of " + mass + 
        massUnit);
    }
    /** Method to print a string about the density field */
    public void isDense(){
        System.out.println("This Astronomical Object has a density of " + 
        density + densityUnit);
    }
    /** Equals method override using the class fields */
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
    /** ToString method override */
    @Override
    public String toString(){
        return "name: " + name + "\nradius: " + radius + radiusUnit +
               "\nmass: " + mass + massUnit + "\ndensity: " + density + 
               densityUnit;
    }
}
