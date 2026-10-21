package org.example.calcul_pi;

import java.util.Random;

public class PointTester{
    static void main(String[] args){
        Random r =new Random();
        long testNumber=1_000_000_000L;
        long inSquare =0;
        for (long i=1; true;i++){
            var randomPoint= Point.createUnitPoint();
            if (randomPoint.distanceToOrigine()<=1.0){
                inSquare++;
            }
            if (i%1000==0){
                var approxPI =inSquare/(double)i*4;
                System.out.printf("Pi value after %d points: %f %n", i,approxPI);
            }
        }
    }
}


