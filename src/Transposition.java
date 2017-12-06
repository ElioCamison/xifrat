import java.util.Arrays;

public class Transposition {

    public static void main(String[] args) {
        System.out.println(cypher("ABCDEFG", 5));
    } // "AFBGCDE"

    static String cypher(String s, int dim) {
        int alt = s.length() / dim;
        if (s.length() / dim != 0) { alt++; }
        char[][] matriu = new char[alt][dim];
        StringBuilder result = new StringBuilder();

        int pos = 0, i, j = 0;

        for (i = 0; i < alt; i++) {
            for (j = 0; j < dim; j++) {
                if (pos < s.length()) {
                    matriu[i][j] = s.charAt(pos);
                    pos++;
                }
            }
            result.append(matriu[i][0]);
        }
        int aux = 1;
        while(aux < s.length()){
            //result.append(s.charAt(aux));
            aux +=2;
        }

        if(s.codePointAt(j) < 65 || s.codePointAt(j) > 90 ) {
            System.out.println(matriu[0][0]);
            System.out.println(matriu[0][1]);
            System.out.println(matriu[0][2]);
            System.out.println(matriu[0][3]);
            System.out.println(matriu[0][4]);
            System.out.println(matriu[1][1]);
            System.out.println(matriu[1][2]);
            System.out.println(matriu[1][3]);
            System.out.println(matriu[1][4]);
        }

        return result.toString();
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
