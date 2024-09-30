// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HalloJavamitForEach halloJavamitForEach = new HalloJavamitForEach();
        halloJavamitForEach.showList();

        NumberTester tester = new NumberTester("filetxt.txt");

        tester.setOddEvenTester(number -> number % 2 != 0);

        tester.setPrimeTester(number -> {
            if (number < 2) return false;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) return false;
            }
            return true;
        });

        tester.setPalindromeTester(number -> {
            String original = String.valueOf(number);
            String reversed = new StringBuilder(original).reverse().toString();
            return original.equals(reversed);
        });

        tester.testFile();
    }

}