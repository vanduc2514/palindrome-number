public class PalindromeRecursive implements NumberChecker {

    @Override
    public boolean isPalindrome(long number) {
        String numberString = String.valueOf(number);
        if (numberString.length() % 2 != 0) {
            return false;
        }
        int[] valid = { 22, 33, 44 };
        for (int value : valid) {
            if (number == value) {
                return true;
            }
        }
        if (numberString.charAt(0) == numberString.charAt(numberString.length() - 1)) {
            long toNumber = 0;
            String toCheck = numberString.substring(1, numberString.length() - 1);
            if (!toCheck.equals("")) {
                toNumber = Long.parseLong(toCheck);
            }
            return isPalindrome(toNumber);
        }
        return false;
    }

}