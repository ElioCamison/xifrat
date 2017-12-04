import java.util.Arrays;

public class Transposition {

    public static void main(String[] args) {
        System.out.println(cypher("ABCDEFG", 2));
    }

    static String cypher(String s, int dim) {
        int alt = s.length() / dim;
        if (s.length() / dim != 0) { alt++; }

        char[][] matriu = new char[alt][dim];

        int pos = 0;
        for (int i = 0; i < alt; i++) {
            for (int j = 0; j < dim; j++) {
                if (pos < s.length()) {
                    matriu[i][j] = s.charAt(pos);
                    pos++;
                }
            }
        }

        System.out.println(Arrays.deepToString(matriu));

        return "";
    }

    static String cypher(String s, String key) {
        return "";
    }

    static String decypher(String s, int dim) {
        return "";
    }

    static String decypher(String s, String key) {
        return "";
    }
}
