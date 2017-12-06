/*
 *
 *
 */
public class Caesar {

    static String cypher(String s, int delta) {
        char[] abecedario = new char[26];
        int i, j;
        s = s.toUpperCase();
        StringBuilder result = new StringBuilder();//We create a StringBuilder with the finality of constantly modifying the encrypted String.

        for (j = 0; j < s.length(); j++) {
            if (s.codePointAt(j) < 65 || s.codePointAt(j) > 90 ) {
                result.append(s.charAt(j));
            }
            for (i = 0; i < 26; i++) {
                abecedario[i] = (char) ('A' + i);
                if (abecedario[i] == s.charAt(j)) {
                    while (delta > 26) {
                        delta -= 26;
                    }
                    if (abecedario[i] + delta > 90) {
                        abecedario[i] -= 90;
                        abecedario[i] += 64;
                        result.append((char) (abecedario[i] + delta));
                    } else {
                        result.append((char) (abecedario[i] + delta));
                    }
                }
            }
        }
        return result.toString();
    }

    static String decypher(String s, int delta) {
        char[] abecedario = new char[26];
        int i , j;

        s = s.toUpperCase();
        StringBuilder result = new StringBuilder();//We create a StringBuilder with the finality of constantly modifying the encrypted String.

        for (j = 0; j < s.length(); j++) {
            if (s.codePointAt(j) < 65 || s.codePointAt(j) > 90 ) {
                result.append(s.charAt(j));
            }
            for (i = 0; i < 26; i++) {
                abecedario[i] = (char) ('A' + i);
                if (abecedario[i] == s.charAt(j)) {
                    while (delta > 26) {
                        delta -= 26;
                    }
                    if (abecedario[i] - delta < 65 || abecedario[i] - delta > 90) {
                        abecedario[i] += 90;
                        abecedario[i] -= 64;
                        result.append((char) (abecedario[i] - delta));
                    } else {
                        result.append((char) (abecedario[i] - delta));
                    }
                }
            }
        }
        return result.toString();
    }

    static String magic(String s, String ss) {
        return "";
    }
}
