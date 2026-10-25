
class Solution {
    public boolean isPalindrome(String s) {
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (Character.isLetterOrDigit(ch)) {
                str = str + ch;
            }
        }

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != rev.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
