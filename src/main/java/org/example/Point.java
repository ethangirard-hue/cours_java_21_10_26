package org.example;
import java.util.Random;
public record Point(double x, double y){
    public static final Point ORIGIN = new Point(0,0);
    public double distanceTo(Point other){
        return Math.sqrt((x-other.x)*(x-other.x)+(y-other.y)*(y-other.y));
    }
    public double distanceToOrigine(){ return distanceTo(ORIGIN); }
    public static final Random random =new Random();
    public static Point createUnitPoint(){
        return new Point(random.nextDouble(-1,1),random.nextDouble(-1,1));
    }
}


