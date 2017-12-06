import java.util.Arrays;

public class Transposition {

    public static void main(String[] args) {
        System.out.println(cypher("ABCDEFG", 5));
    } // "AFBGCDE"

    static String cypher(String s, int dim){
        int alt= s.length() / dim;
        if(s.length() > dim) alt++;

        char[][] matriu = new char[alt][dim];
        String result = "";
        int pos = 0;
            for(int j = 0; j < dim && pos < s.length(); j++) {
                for(int i = 0; i < alt; i++) {
                    matriu[i][j] = s.charAt(pos);
                    pos++;
            }
        }

        for(int x=0; x < dim; x++) {
            for(int y = 0; y < alt; y++) {
                if(matriu[y][x] != 0) {
                    result += matriu[y][x];
                }
            }
        }
        return result;
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
