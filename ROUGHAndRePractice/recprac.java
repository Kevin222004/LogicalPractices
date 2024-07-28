public class recprac {
    public static void main(String[] args) {
    }


    





    // coin change 

    static int coinChangecode(int n, int[] arr) {
        if (n == 0) {
            return 0;
        }

        if (n < 0) {
            return Integer.MAX_VALUE;
        }
        
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int ans = coinChangecode(n-arr[i], arr);
            if (ans != Integer.MAX_VALUE) {
                mini = Math.min(ans+1, mini);
            }
        }

        return mini;
    }


    // cut into seg

    static int cutIntoSegments(int l, int x, int y, int z) {
        if (l == 0) {
            return 0;
        }
        if (l < 0) {
            return Integer.MAX_VALUE;
        }

        int xl = cutIntoSegments(l-x, x, y, z) + 1;
        int yl = cutIntoSegments(l-y, x, y, z)+ 1;
        int zl = cutIntoSegments(l-z, x, y, z)+ 1;

        return Math.max(xl, Math.max(yl, zl));
    }

    static void printSubsequence(String s, StringBuilder output, int i) {
        if (i >= s.length()) {
            System.out.println(output.toString());
            return;
        }

        // including the character in the string
        printSubsequence(s, output.append(s.charAt(i)), i+1);
        output.deleteCharAt(output.length()-1);
        // exclude
        printSubsequence(s, output, i+1);
    }
}