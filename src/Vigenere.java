
public class Vigenere {
    static String abecedario = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    static String encode(String s, String password) {
        StringBuilder result = new StringBuilder();
        String mensa = modificar(s) , pass = modificar(password.toUpperCase()); // Creat two variable, mensa and pass
        int posMensa = 0, posPass = 0, suma;

        int indexPass = 0;
        for (int i = 0; i < mensa.length(); i++) {
            if (mensa.codePointAt(i) < 65 || mensa.codePointAt(i) > 90) {
                result.append(mensa.charAt(i));
                continue;
            }

            char carMensaje = mensa.charAt(i);

            if (carMensaje == 32) {
                continue;
            } else {
                char carPassw = pass.charAt(indexPass);
                indexPass ++;
                if (indexPass == pass.length()) {
                    indexPass = 0;
                }
                posMensa = cerca(carMensaje);
                posPass = cerca(carPassw);

                suma = posMensa + posPass;
                while (suma > 26) {
                    suma -= 26;
                }
                result.append(abecedario.charAt(suma));
            }
        }
        return result.toString();
    }

    static int cerca(char c) {
        for (int j = 0; j < abecedario.length(); j++) {
            if (c == abecedario.charAt(j)) {
                return j;
            }
        }
        return -1;
    }

    static String modificar(String s) {
        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char c = (char) s.codePointAt(i);
            // A and its variants
            if (c == 'à' || c == 'á' || c == 'À' || c == 'Á') {
                c = 65;
                result.setCharAt(i, c);
            }
            // E
            if (c == 'è' || c == 'é' || c == 'È' || c == 'É') {
                c = 69;
                result.setCharAt(i, c);
            }
            // I
            if (c == 'ì' || c == 'í' || c == 'Ì' || c == 'Í') {
                c = 73;
                result.setCharAt(i, c);
            }
            // O
            if (c == 'ò' || c == 'ó' || c == 'Ò' || c == 'Ó') {
                c = 79;
                result.setCharAt(i, c);
            }
            // U
            if (c == 'ù' || c == 'ú' || c == 'Ù' || c == 'Ú') {
                c = 85;
                result.setCharAt(i, c);
            }
        }
        return result.toString().toUpperCase();
    }

    static String decode(String s, String password) {
        StringBuilder result = new StringBuilder();
        String mensa = modificar(s);
        String pass = modificar(password.toUpperCase());
        int posMensa = 0, posPass = 0, resta;

        int indexPass = 0;
        for (int i = 0; i < mensa.length(); i++) {
            if (mensa.codePointAt(i) < 65 || mensa.codePointAt(i) > 90) {
                result.append(mensa.charAt(i));
                continue;
            }

            char carMensaje = mensa.charAt(i);

            if (carMensaje == 32) {
                continue;
            } else {
                char carPassw = pass.charAt(indexPass);
                indexPass = indexPass + 1;
                if (indexPass == pass.length()) {
                    indexPass = 0;
                }
                posMensa = cerca(carMensaje);
                posPass = cerca(carPassw);

                resta = posMensa - posPass;

                if (resta < 0) {
                    resta = Math.abs(resta);
                    resta = (abecedario.length() - 1) - resta;
                } else {
                    while (resta > 26) {
                        resta -= 26;
                    }
                }
                result.append(abecedario.charAt(resta));
            }
        }
        return result.toString();
    }
}


