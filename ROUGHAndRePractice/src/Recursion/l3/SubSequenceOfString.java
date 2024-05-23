package Recursion.l3;

public class SubSequenceOfString {
    public static void main(String[] args) {
        String input = "abc";
        printSubSequence(input, new StringBuilder(""), 0);
    }

    static void printSubSequence(String input, StringBuilder op, int pointer) {
        if (pointer >= input.length()) {
            System.out.println("{" + op.toString() + "}");
            return;
        }

        // include the char at pointer in output
        op.append(input.charAt(pointer));
        printSubSequence(input, op, pointer+1);

//        we have appended the char at above know for exclude call we cant pass the string with included char so remove it
//        and we have to pass the same ouput string not chaned
        op.deleteCharAt(op.length()-1);

        // exclude call nothing will be added
        printSubSequence(input, op, pointer+1);

    }
}
