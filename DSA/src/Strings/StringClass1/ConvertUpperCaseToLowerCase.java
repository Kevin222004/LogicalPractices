package Strings.StringClass1;

public class ConvertUpperCaseToLowerCase {
    public static void main(String[] args) {
        System.out.println(convertUpperCaseToLowerCase("KEVIN"));
    }

    static String convertUpperCaseToLowerCase(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append((char) (str.charAt(i) - 'A' + 'a'));
        }
        return stringBuilder.toString();
    }
}
