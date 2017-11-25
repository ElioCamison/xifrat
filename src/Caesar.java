/*
 *
 *
 */
public class Caesar {

    public static void main(String[] args) {
        //System.out.println(cypher("Els patrons de consum d’abans de la crisi reneixen, segons els experts, i el Nadal en serà la prova, amb l’ingredient afegit del boom del comerç electrònic", 12));
        //System.out.println(cypher("ABC", 1));
        System.out.println(decypher("ABC",1));
    }

    static String cypher(String s, int delta) {
        char[] abecedario = new char[26];
        int i;
        int j;
        s = s.toUpperCase();
        StringBuilder result = new StringBuilder();//We create a StringBuilder with the finality of constantly modifying the encrypted String.

        for (j = 0; j < s.length(); j++) {
            for (i = 0; i < 26; i++) {
                abecedario[i] = (char) ('A' + i);
                if (abecedario[i] == s.charAt(j)) {
                    while (delta > 26) {
                        delta -= 26;
                    }
                    if (abecedario[i]+delta >= 90){
                        abecedario[i] += 90;
                        abecedario[i] -= 64;
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
        int i;
        int j;
        s = s.toUpperCase();
        StringBuilder result = new StringBuilder();//We create a StringBuilder with the finality of constantly modifying the encrypted String.

        for (j = 0; j < s.length(); j++) {
            for (i = 0; i < 26; i++) {
                abecedario[i] = (char) ('A' + i);
                if (abecedario[i] == s.charAt(j)) {
                    while (delta > 26) {
                        delta -= 26;
                    }
                    if (abecedario[i]-delta < 65 || abecedario[i]-delta > 90){
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
