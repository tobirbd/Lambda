import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NumberTester {
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    private List<int[]> testCases;
    public NumberTester(String fileName){
        testCases = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            int numTestCases = Integer.parseInt(br.readLine());
            for (int i = 0; i < numTestCases; i++) {
                String[] parts = br.readLine().split(" ");
                int testType = Integer.parseInt(parts[0]);
                int number = Integer.parseInt(parts[1]);
                testCases.add(new int[]{testType, number});
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }
    public void testFile(){
        for (int[] testCase : testCases) {
            int testType = testCase[0];
            int number = testCase[1];

            switch (testType) {
                case 1:
                    if (oddTester != null) {
                        System.out.println(number + " is " + (oddTester.testNumber(number) ? "Odd" : "Even"));
                    }
                    break;
                case 2:
                    if (primeTester != null) {
                        System.out.println(number + " is " + (primeTester.testNumber(number) ? "Prime" : "Not Prime"));
                    }
                    break;
                case 3:
                    if (palindromeTester != null) {
                        System.out.println(number + " is " + (palindromeTester.testNumber(number) ? "Palindrome" : "Not Palindrome"));
                    }
                    break;
                default: System.out.println("Unknown test type: " + testType);
            }
        }

    }
}
