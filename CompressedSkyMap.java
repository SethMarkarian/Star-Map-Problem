
/**
 * Class that stores a compressed image of the night sky.
 */
import java.util.*;

public class CompressedSkyMap
{
    List<Star> stars;
    int rows, cols;
    
    public CompressedSkyMap(double[][] map) {
        stars = new ArrayList<Star>();
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[0].length; j++) {
                if (map[i][j] != 0) {
                    stars.add(new Star(i, j, map[i][j]));
                }
            }
        }
        rows = map.length;
        cols = map[0].length;
    }   
    public double brightnessAt(int row, int col) {
        for(int i = 0; i < stars.size(); i++) {
            if(stars.get(i).getX() == row && stars.get(i).getY() == col) {
                return stars.get(i).getBrightness();
            }
        }
        return 0.0;
    }
    public int numStars() {
        return stars.size();
    }
    
    public void eliminateLightPollution(double maxBrightness) {
        for(int i = 0; i < stars.size(); i++) {
            if(stars.get(i).getBrightness() >= maxBrightness) {
                stars.remove(i);
                i--;
            }
        }
    }
    
    public void scaleBrightness(double factor) {
        for(int i = 0; i < stars.size(); i++) {
            stars.set(i, new Star((stars.get(i).getX()),(stars.get(i).getY()),(stars.get(i).getBrightness() * factor)));
        }
    }
    
    public void printMap() {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(brightnessAt(i,j)); 
                System.out.print("    ");
                
                    
                }
            System.out.println();
            } 
        }
    }

