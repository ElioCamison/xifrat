import java.util.Arrays;

public class Transposition {

    public static void main(String[] args) {
        System.out.println(cypher("ABCDEFG", 2));
    }

    static String cypher(String s, int dim) {
        s.toUpperCase();
        char[][] matriu = new char[2][];

        for (int i = 0; i < s.length(); i++) {
            matriu[i][i] = s.charAt(i);
        }

        System.out.println(Arrays.toString(matriu));
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
