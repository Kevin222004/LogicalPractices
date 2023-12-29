package RecursionAndBackTracking.l3;

public class SubSequencesOfString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abc");
        StringBuilder output= new StringBuilder();
        int i = 0;

        printSubSequence(str, output, i);

    }

    static void printSubSequence(StringBuilder input, StringBuilder output, int index) {
        if (index >= input.length()){
            System.out.println("{" +output+"},");
            return;
        }

        // exclude
        printSubSequence(input, output, index+1);

        // include
        output.append(input.charAt(index));
        printSubSequence(input, output, index+1);
        // backtrack (remove the included character)
        output.deleteCharAt(output.length() - 1);

    }
}
