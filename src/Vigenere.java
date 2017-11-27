
public class Vigenere {

    public static void main(String[] args) {
        System.out.println(encode("BEN FET", "AKYP"));
    }

    static String encode(String s, String password) {
        s.toUpperCase();
        StringBuilder result = new StringBuilder();
        String abecedario = "0ABCDEFGHIJKLMNOPQRSTUWXYZ";
        int posMensa = 0, posPass = 0, contador = 0, suma;

        for (int i = 0; i < s.length(); i++) {
            if (s.codePointAt(i) < 65 || s.codePointAt(i) > 90) {
                result.append(s.charAt(i));
            }

            while (contador < password.length()){
                contador++;
                if (contador == password.length()) contador = 0;
            }
            for (int j = 0; j < abecedario.length(); j++) {
                if (s.charAt(i) == abecedario.charAt(j)) {
                    posMensa = j;
                }
                if (password.charAt(i) == abecedario.charAt(j)) {
                    posPass = j;
                }
            }
            suma = posMensa + posPass;
            result.append(abecedario.charAt(suma));
        }
        return result.toString();
    }

    static String decode(String s, String password) {
        return "";
    }
}


