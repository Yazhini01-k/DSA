package arrayQuestion;

public class DigitFrequency {
	public static void main(String[] args) {

        int num = 1223342;
        int digit = 2;
        int count = 0;

        while (num > 0) {
            int rem = num % 10;

            if (rem == digit) {
                count++;
            }

            num = num / 10;
        }

        System.out.println("Frequency = " + count);
    }
}
