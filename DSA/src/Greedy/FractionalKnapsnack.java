package Greedy;

import java.util.ArrayList;
import java.util.Collections;

public class FractionalKnapsnack {
    public static void main(String[] args) {
        int[] weight = {10, 20, 30};
        int[] value = {60, 100, 120};
        double capacity = 50;
        int items = 3;

        ArrayList<pair> pair = new ArrayList<>();

        for (int i = 0; i < items; i++) {
            pair.add(new pair(weight[i], value[i]));
        }

        Collections.sort(pair, (p1, p2) -> Double.compare(((1.0) * (p2.value / p2.weight)), ((1.0) * (p1.value / p1.weight))));
        // for (int i = 0; i < items; i++) {
        //     System.out.println(pair.get(i).value);
        // }

        double valueInBag = 0;
        for (int i = 0; i < items; i++) {
            if (capacity == 0) {
                return;
            }
            if (pair.get(i).weight <= capacity) {
                capacity = capacity - pair.get(i).weight;
                valueInBag += pair.get(i).value;
            } else {
                double ratio = (((1.0) * pair.get(i).value) / pair.get(i).weight);
                valueInBag += ratio * capacity;
                capacity = 0;
            }
        }

        System.out.println(valueInBag);
    }

    static class pair {
        int weight;
        int value;

        pair(int w, int v) {
            weight = w;
            value = v;
        }
    }
}
