package dsa;

public class Rotations {
    //Using pointers
    public boolean areRotations(String str1, String str2) {

        if (str1.isEmpty() || str2.isEmpty() || str1 == null || str2 == null)
            throw new IllegalArgumentException();

        var pointer1 = 0;
        var pointer2 = str2.indexOf(str1.charAt(0));

        if (pointer2 == -1 || (str1.length() != str2.length()))
            return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(pointer1) != str2.charAt(pointer2))
                return false;
            pointer1++;
            pointer2++;
            if (pointer2 == str2.length())
                pointer2 = 0;
        }
        return true;
    }
}
/*
ABCDE
CDEAB
*/
