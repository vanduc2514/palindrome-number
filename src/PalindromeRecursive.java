public class PalindromeRecursive implements NumberChecker {

    @Override
    public boolean isPalindrome(String number) {
        if (number.length() == 0) {
            return true;
        }
        if (number.charAt(0) == number.charAt(number.length() - 1)) {
            String toCheck = number.substring(1, number.length() - 1);
            return isPalindrome(toCheck);
        }
        return false;
    }

}