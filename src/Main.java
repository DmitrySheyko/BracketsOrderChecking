public class Main {
    public static void main(String[] args) {
        String string = "({[]})[][]{{{}}}()";
        System.out.println(checkString(string));

    }

    static boolean checkString(String string) {
        boolean result = false;
        int bracketCount = 0;
        int figureBracketCount = 0;
        int cubeBracketCount = 0;
        boolean bracket = true;
        boolean figureBracket = true;
        boolean cubeBracket = true;
        for (char character : string.toCharArray()) {
            if (character == '(') {
                bracket = false;
                bracketCount++;
            }
            if (character == ')') {
                bracket = true;
                bracketCount--;
            }
            if (character == '{') {
                figureBracket = false;
                figureBracketCount++;
            }
            if (character == '}') {
                figureBracket = true;
                figureBracketCount--;
            }
            if (character == '[') {
                cubeBracket = false;
                cubeBracketCount++;
            }
            if (character == ']') {
                cubeBracket = true;
                cubeBracketCount--;
            }
            if (bracketCount < 0 || figureBracketCount < 0 || cubeBracketCount < 0) {
                return result = false;
            }
            if (bracket && figureBracket && cubeBracket) {
                result = true;
            }
        }
        return result;
    }
}
