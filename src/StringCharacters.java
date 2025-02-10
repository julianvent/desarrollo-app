public class StringCharacters {
    public static void main(String[] args) {
        String text = "Este autobús va muy lento, si no acelera llegaré muy tarde a clases " +
                "no podré presentar el examen, el profesor no va a creerme, reprobaré" +
                " y ¿Qué será de mí? Ni siquiera es mi culpa, pero todos actuarán como" +
                " or to take armas against a sea of troubles," +
                " así fuera.";

        int spaces = 0,
        vowels = 0,
        letters = 0;

        char[] vowelsChar = {'a', 'e', 'i', 'o', 'u', 'á', 'é', 'í', 'ó', 'ú'};

        for (char c : text.toLowerCase().toCharArray()) {
            if (c == ' ') {
                spaces++;
            } else if ((c >=  'a' && c <= 'z') || (c >= 'á' && c <= 'ú')) {
                for (char vowel : vowelsChar) {
                    if (c == vowel) {
                        vowels++;
                    }
                }
            } else {
                letters++;
            }
        }

        System.out.println("The text contained vowels: " + vowels +  '\n'
                + "consonants: " + (text.length() - letters - spaces - vowels) + '\n' + "spaces: " + spaces);
    }
}
