
/**
 * 
 */
public class Tester
{
    public static void tester() {
        double[][] rawMap = {{0, 0, 0, 0}, {0, 0, 5.2, 0}, {1.6, 0, 0, 547.3}, {0, 0, 0, 0}, {281.4, 0, 0, 4.8}};
        CompressedSkyMap map = new CompressedSkyMap(rawMap);
        
        System.out.println("Should be 5.2: " + map.brightnessAt(1, 2));
        System.out.println("Should be 0: " + map.brightnessAt(2, 1));
        System.out.println("Should be 0: " + map.brightnessAt(0, 3));
        
        System.out.println("Should be 5: " + map.numStars());
        
        map.eliminateLightPollution(100);
        
        System.out.println("Should be 3: " + map.numStars());
        
        System.out.println("Should be 4.8: " + map.brightnessAt(4, 3));
        
        map.scaleBrightness(0.5);
        
        System.out.println("Should be 2.4: " + map.brightnessAt(4, 3));
        System.out.println("Should be 0.8: " + map.brightnessAt(2, 0));
        
        map.scaleBrightness(2.0);
        
        System.out.println("Should print the original map, with 0.0 in place of the 547.3 and 281.4 ");
        map.printMap();
    }
}
