import java.util.Scanner;

// import java.util.Scanner;

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
        final long specialNumber = findSpecialNumber(numberToCheck);
        System.out.println("Kết quả là: " + specialNumber);
    }

    private static long findSpecialNumber(final int index) {
        int count = 0;
        long number = 22;
        if (index < 0) {
            return 0;
        }
        while (true) {
            if (numberChecker.isPalindrome(number)) {
                if (count == index) {
                    return number;
                }
                count++;
            }
            number++;
        }
    }
}
