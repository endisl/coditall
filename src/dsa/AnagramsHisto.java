package dsa;

public class AnagramsHisto {
    public static boolean areAnagrams(String str1, String str2) {
        if(str1 == null || str2 == null)
            return false;

        final int ENGLISH_ALPHABET = 26;
        var frequencies = new int[ENGLISH_ALPHABET];
        str1 = str1.toLowerCase();
        for (int i = 0; i < str1.length(); i++)
            frequencies[str1.charAt(i) - 'a']++;
        str2 = str2.toLowerCase();
        for (int i = 0; i < str2.length(); i++) {
            var index = str2.charAt(i) - 'a';
            if (frequencies[index] == 0) //an optimization and only works if str2 has greater length than str1,
                return false;            //or has a character not present in str1
            frequencies[index]--;
        }
        for (int i = 0; i < ENGLISH_ALPHABET; i++)
            if (frequencies[i] != 0)
                return false;

        return true;
    }
}
