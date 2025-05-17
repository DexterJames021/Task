package programmingChallenge;

public class vowelsEnConsonants {
    public static void main(String[] character) {
        boolean lowercase_vowel = (character[0] == "a" || character[0] == "e" || character[0] == "i" || character[0] == "o" || character[0] == "u"),
                uppercase_vowel = (character[0] == "A" || character[0] == "E" || character[0] == "I" || character[0] == "O" || character[0] == "U");

                if(lowercase_vowel || uppercase_vowel)
                    System.out.println(character[0] + " is vowel");
                else 
                    System.out.println(character[0] + " is consonant");
    }
}
