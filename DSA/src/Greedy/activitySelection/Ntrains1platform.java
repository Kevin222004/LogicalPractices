/*
 
    There are n trains and arrival and departure time is given of each train 
    find the maximum amount of train that can accomodate by the platform


 */

package Greedy.activitySelection;

import java.util.*;

public class Ntrains1platform {
    public static void main(String[] args) {
        int n = 4;
        int[] arrivalTime = {5, 8, 2, 4};
        int[] departureTime = {7, 11, 6, 5};   
        System.out.println(maxTrain(n, arrivalTime, departureTime));
    }

    public static int maxTrain(int n, int[] arrivalTime, int[] departureTime) {
    
        List<Pair> pair = new ArrayList<>();
        for (int i = 0; i < departureTime.length; i++) {
            pair.add(new Pair(arrivalTime[i], departureTime[i]));
        }

        Collections.sort(pair, (p1, p2) -> Integer.compare(p1.last, p2.last));

        int count = 1;
        System.out.println("[" + pair.get(0).first + ", " + pair.get(0).last + "]");
        int lastDep = pair.get(0).last;
        for (int i = 1; i < pair.size(); i++) {
            if ( pair.get(i).first >= lastDep) {
                count++;
                System.out.println("["+pair.get(i).first + ", " + pair.get(i).last+"]");
                lastDep = pair.get(i).last;
            }   
        }

        return count;
    }

    static class Pair {

        int first;
        int last;
        
        Pair(int first, int last) {
            this.first = first;
            this.last = last;
        }
    }
}