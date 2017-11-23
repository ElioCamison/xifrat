/*
 *
 *
 */
public class Caesar {

    public static void main(String[] args) {
        System.out.println(cypher("ABC", 100));
    }

    static String cypher(String s, int delta) {
        char[] abecedario = new char[27];
        int i;
        int j;
        s = s.toUpperCase();
        StringBuilder result = new StringBuilder();// We creat the StringBuilder for need concat

        for (j = 0; j < s.length(); j++) {
            for (i = 0; i < 27; i++) {
                abecedario[i] = (char) ('A' + i);
                if (abecedario[i] == s.charAt(j)) {
                    if (abecedario[i]+delta > 90){
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
        return "";
    }

    static String magic(String s, String ss) {
        return "";
    }
}
