public class PalindromeLoop implements NumberChecker {

    @Override
    public boolean isPalindrome(String number) {
        int length = number.length();
        for (int index = 0; index < length / 2; index++) {
            if (number.charAt(index) != number.charAt(length - index - 1)) {
                return false;
            }
        }
        return true;
    }
    
}