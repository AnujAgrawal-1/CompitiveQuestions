package answers.question3.code;

import java.util.HashMap;
import java.util.Map;

class Question3 {
    public static Map<Character, Integer> countDuplicateCharacters(String string) {
        var resultMap = new HashMap<Character, Integer>();
        // 1. use a loop to iterate the string, or use toCharArray() with for-each loop
        for (int index = 0; index < string.length(); index++) {
            // 2. fetch a single character from the string and store it into `currentCharacter` variable
            char currentCharacter = string.charAt(index);
            // 3. compute if a character if already present in the map
            // if true, increase the (integer) value by 1
            // if false, set it to 1
            resultMap.compute(
                    currentCharacter, (key, value) -> {
                        if (value == null) {
                            return 1;
                        } else {
                            return ++value; // pre-fix increment operator is needed, post-fix will not work, try!
                        }
                        // or this if-else statement can be summarized as
                        // (value == null) ? 1 : ++value;
                    }
            );
        }
        return resultMap;
    }

    public static void main(String[] args) {
        String message = "Competitive Programming Can Be A Little Bit Tricky!";
        System.out.println(countDuplicateCharacters(message));
    }
}

