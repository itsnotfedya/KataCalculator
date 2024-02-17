public class Roman {
    public static String[] romanNumbers = new String[] {"0", "I", "II", "III", "IV",
            "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV",
            "XVI", "XVII", "XVIII", "XIX", "XX"};
    public static boolean isRoman(String value) {
        for (int i = 0; i < romanNumbers.length; i++) {
            if (value.equals(romanNumbers[i])) {
                return true;
            }
        }
        return false;
    }

    public static int fromRomanToArabian(String roman) {
        for (int i = 0; i <= romanNumbers.length; i++) {
            if (roman.equals(romanNumbers[i])) {
                return i;
            }
        }
        return -1;
    }

    public static String fromArabianToRoman(int arabian) {
        return romanNumbers[arabian];
    }
}
