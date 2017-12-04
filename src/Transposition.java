import java.util.Arrays;

public class Transposition {

    public static void main(String[] args) {
        System.out.println(cypher("ABCDEFG", 2));
    }

    static String cypher(String s, int dim) {
        int alt = s.length() / dim;
        if (s.length() / dim != 0) { alt++; }
        char[][] matriu = new char[alt][dim];
        StringBuilder result = new StringBuilder();

        int pos = 0;
        for (int i = 0; i < alt; i++) {
            for (int j = 0; j < dim; j++) {
                if (pos < s.length()) {
                    matriu[i][j] = s.charAt(pos);
                    pos++;
                }
            }
        }

        result.append(matriu[0][0]);
        result.append(matriu[1][0]);
        result.append(matriu[2][0]);
        result.append(matriu[3][0]);
        result.append(matriu[0][1]);
        result.append(matriu[1][1]);
        result.append(matriu[2][1]);
        System.out.println(result.toString());
        return result.toString();
    }

    /*static char[][] transpose(char[][] matriu, int alt, int dim){
        StringBuilder res = new StringBuilder();

        char[][] trans = new char[alt][dim];
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                res.append(i);
            }
        }
        System.out.println(res.toString());
        return trans;
    }*/

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
