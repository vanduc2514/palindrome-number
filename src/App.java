import java.util.Scanner;

public class App {
    private static NumberChecker numberChecker;

    public static void main(final String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phương pháp kiểm tra số đặc biệt \n" + "1. Kiểm tra bằng vòng lặp \n"
                + "2. Kiểm tra bằng đệ quy\n" + "Nhập lựa chọn của bạn: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                numberChecker = new PalindromeLoop();
                break;
            case 2:
                numberChecker = new PalindromeRecursive();
                break;
            default:
                numberChecker = new PalindromeLoop();
        }
        scanner.nextLine();

        System.out.println("Nhập chỉ số của dãy: ");
        int numberToCheck = scanner.nextInt();
        scanner.close();

        final long startTime = System.currentTimeMillis();
        final long specialNumber = findSpecialNumber(numberToCheck);
        final long endTime = System.currentTimeMillis();
        System.out.println("Kết quả là: " + specialNumber);
        System.out.println("Kết quả tìm ra trong: " + (endTime - startTime)/1000 + " giây");
    }

    private static long findSpecialNumber(final int index) {
        int count = 0;
        long number = 22;
        if (index < 0) {
            return 0;
        }
        while (true) {
            final String stringValue = String.valueOf(number);
            if (validateNumber(stringValue)) {
                if (numberChecker.isPalindrome(stringValue)) {
                    if (count == index) {
                        return number;
                    }
                    count++;
                }
            }
            number++;
        }
    }

    private static boolean validateNumber(String stringValue) {
        if (stringValue.length() % 2 != 0) {
            return false;
        }
        final String[] forbidden = { "0", "1", "5", "6", "7", "8", "9" };
        for (String str : forbidden) {
            if (stringValue.contains(str)) {
                return false;
            }
        }
        return true;
    }
}
