
/**
 * Class that represents a star on a digital image of the night sky.
 */
public class Star
{
    private int x, y;           // Position
    private double brightness;  // Brightness
    
    public Star(int x, int y, double brightness) {
        this.x = x; this.y = y; this.brightness = brightness;
    }
    
    public int getX() { return x; }
    
    public int getY() { return y; }
    
    public double getBrightness() { return brightness; }
}
