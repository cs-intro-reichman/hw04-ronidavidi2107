public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    public static String lowerCase(String str) {
        int len = str.length();
        char[] newCharArray = new char[len]; 
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
            newCharArray[i] = (char) (c + 32); 
            } else {
                newCharArray[i] = c;
            }
        }
        return new String(newCharArray);
    }

    public static boolean contains(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        if (n2 == 0) {
            return true;
        }
        if (n2> n1) {
            return false;
        }
        for (int i = 0; i <= n1 - n2; i++) { 
            boolean match = true;
            for (int j = 0; j < n2; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    match = false;
                    break; 
                }
            }
            if (match) {
                return true;
            }
        }
        return false;
    }

}
