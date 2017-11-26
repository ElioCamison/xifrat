
public class Vigenere {

    public static void main(String[] args) {
        System.out.println(encode("AAA", "AAA"));
    }

    static String encode(String s, String password) {
        char[] abecedario = new char[26];
        StringBuilder result = new StringBuilder();
        int[] posMensa = new int[s.length()] ;
        int[] posPass = new int[password.length()];
        int suma = 0;

        for (int j = 0; j < 26; j++) {
            abecedario[j] = (char) ('A' + j);

            for (int i = 0; i < s.length(); i++) {
                for (int k = 0; k < password.length(); k++) {
                    if (abecedario[j] == s.charAt(i) && abecedario[j] == password.charAt(k)) {
                        posMensa[i] = j;
                        posPass[k] = j;
                        //
                        // suma = ;
                        result.append(abecedario[suma]);
                    }
                }
            }
        }
        return result.toString();
    }

    static String decode(String s, String password) {
        return "";
    }
}


