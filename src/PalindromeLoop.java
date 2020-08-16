public class PalindromeLoop implements NumberChecker {

    @Override
    public boolean isPalindrome(long number) {
        final String numberString = String.valueOf(number);
        final String[] forbidden = { "0", "1", "5", "6", "7", "8", "9" };
        int length = numberString.length();
        if (length % 2 != 0) {
            return false;
        }
        for (String str : forbidden) {
            if (numberString.contains(str)) {
                return false;
            }
        }
        for (int index = 0; index < length / 2; index++) {
            if (numberString.charAt(index) != numberString.charAt(length - index - 1)) {
                return false;
            }
        }
        return true;
    }

}