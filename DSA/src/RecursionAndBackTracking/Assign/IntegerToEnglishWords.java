package RecursionAndBackTracking.Assign;

import java.util.ArrayList;
import java.util.List;

public class IntegerToEnglishWords {
    public static void main(String[] args) {
        int num = 12345;

        solution s = new solution();

        System.out.println(s.numberToWords(num));
    }

    static class solution {

        public String numberToWords(int num) {

            List<Pair> mp = new ArrayList<>();
            mp.add(new Pair(1000000000, "Billion"));
            mp.add(new Pair(1000000, "Million"));
            mp.add(new Pair(1000, "Thousand"));
            mp.add(new Pair(100, "Hundered"));
            mp.add(new Pair(90, "Ninety"));
            mp.add(new Pair(80, "Eighty"));
            mp.add(new Pair(70, "Seventy"));
            mp.add(new Pair(60, "Sixty"));
            mp.add(new Pair(50, "Fifty"));
            mp.add(new Pair(40, "Forty"));
            mp.add(new Pair(30, "Thirty"));
            mp.add(new Pair(20, "Twenty"));
            mp.add(new Pair(19, "Nineteen"));
            mp.add(new Pair(18, "Eighteen"));
            mp.add(new Pair(17, "Seventeen"));
            mp.add(new Pair(16, "Sixteen"));
            mp.add(new Pair(15, "Fifteen"));
            mp.add(new Pair(14, "Fourteen"));
            mp.add(new Pair(13, "Thirteen"));
            mp.add(new Pair(12, "Twelve"));
            mp.add(new Pair(11, "Eleven"));
            mp.add(new Pair(10, "Ten"));
            mp.add(new Pair(9, "Nine"));
            mp.add(new Pair(8, "Eight"));
            mp.add(new Pair(7, "Seven"));
            mp.add(new Pair(6, "Six"));
            mp.add(new Pair(5, "Five"));
            mp.add(new Pair(4, "Four"));
            mp.add(new Pair(3, "Three"));
            mp.add(new Pair(2, "Two"));
            mp.add(new Pair(1, "One"));

            if (num == 0) {
                return "Zero";
            }

            for (int i = 0; i < mp.size(); i++) {
                if (num >= mp.get(i).getI()) {
                    StringBuilder a = new StringBuilder();
                    if (num >= 100) {
                        a.append(numberToWords(num / mp.get(i).getI())).append(" ");
                    }
                    StringBuilder b = new StringBuilder(mp.get(i).getS());

                    StringBuilder c = new StringBuilder();

                    if (num % mp.get(i).getI() != 0) {
                        c.append(" ").append(numberToWords(num % mp.get(i).getI()));
                    }

                    return a.toString() + b.toString() + c.toString();
                }
            }
            return "";
        }

        class Pair {
            private int i;
            private String s;

            public String getS() {
                return s;
            }

            public void setS(String s) {
                this.s = s;
            }

            Pair(int i, String s) {
                this.i = i;
                this.s = s;
            }

            public int getI() {
                return i;
            }

            public void setI(int i) {
                this.i = i;
            }
        }
    }
}
