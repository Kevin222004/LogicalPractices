/*

https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/

 */

package BabbarSheet.array;

public class array2 {
    class Solution {
        public Pair getMinMax(int[] arr) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0;  i < arr.length; i++) {
                min = Math.min(min, arr[i]);
                max  = Math.max(max, arr[i]);
            }

            return new Pair(min, max);
        }
    }

    static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
