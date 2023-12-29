package Strings.StringClass1;

public class ConvertLowerCaseToUpperCase {
    public static void main(String[] args) {
        String str = "kevin";
        System.out.println(convertToUpperCase(str));
    }

    static String convertToUpperCase(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append((char) (str.charAt(i)-'a'+'A'));
        }
        return stringBuilder.toString();
    }
}
