
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        //illustrates polymorhpism
        Planet planet1 = new SilicatePlanet("Earth", 3378.0, 5.97, 15.0, 1, true, 
                                           "You're here!", 149.6, 23.9, 365.2, 
                                           true, true, true, true);
                                           
        Planet planet2 = new SilicatePlanet("Earth", 3378.0, 5.97, 15.0, 1, true, 
                                           "You're here!", 149.6, 23.9, 365.2, 
                                           true, true, true, true);
                                           
        TerrestrialPlanet planet3 = new IcyPlanet("Pluto", 2185.0, 0.0146, 
                                                  -225.0, 5, true,
                                                  "Pluto used to be a planet" +
                                                  " of the solar system but " +
                                                  "is now a dwarf planet", 
                                                  5906.4, 153.3, 90560.0, 
                                                  false, false, false, false, 
                                                  false, true);
        
        GiantPlanet planet4 = new IceGiant("Neptune", 24764.0, 102.0, -200.0,
                                           5, true, 
                                           "Neptune has winds that can reach" +
                                           " supersonic speeds", 4495.1, 16.1,
                                           59800.0,
                                           "Hydrogen, helium, methane", 
                                           "Iron, Nickel, Silicate Rock",
                                           5400.0, true);
        
        GiantPlanet planet5 = new GasGiant("Jupiter", 71492, 1898, -110, 79,
                                           true, "Jupiter has a large spot", 
                                           778.6, 9.9, 4331.0,
                                           "Hydrogen, Helium",
                                           "Iron, Oxygen, Carbon", false, 
                                           "N/A");
        
        GiantPlanet planet6 = new GasGiant("Saturn", 60268, 568, -140, 62, true, 
                                           "Saturn's rings are visible!", 1433.5, 
                                           10.7, 10747.0, "Hydrogen, Helium", 
                                           "Iron, Nickel", true, "Ice and Rock");
        //tests planets that are equal
        equalsTest(planet1, planet2);
        //tests planets that aren't equal
        equalsTest(planet1, planet4);
        equalsTest(planet5, planet6);
        
        uniqueMethodsTest(planet1);
        //toStrign override
        System.out.println(planet1);
                                           
    }
    //methods to make testing more effecient
    public static void equalsTest(Object o1, Object o2){
        System.out.println(o1.equals(o2));
    }
    public static void uniqueMethodsTest(Planet o){
        o.isCalled();
        o.isLarge();
        o.isHeavy();
        o.isDense();
        o.rotates();
        o.orbits();
        o.showTemp();
    }
}