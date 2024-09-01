public class Qn5 {
    public static void main(String[] args) {
        int num = 1624;
        int n = 1234;
        int m = 4567;

        // Extract digits
        int d1 = num / 1000;
        int d2 = (num / 100) % 10;
        int d3 = (num / 10) % 10;
        int d4 = num % 10;

        // Sum of all even digits
        int sumEvenDigits = (d1 % 2 == 0 ? d1 : 0) + (d2 % 2 == 0 ? d2 : 0) + (d3 % 2 == 0 ? d3 : 0)
                + (d4 % 2 == 0 ? d4 : 0);

        // Sum of all odd digits
        int sumOddDigits = (d1 % 2 != 0 ? d1 : 0) + (d2 % 2 != 0 ? d2 : 0) + (d3 % 2 != 0 ? d3 : 0)
                + (d4 % 2 != 0 ? d4 : 0);

        // Average of even digits except divisible by 4
        int sumEvenExcept4 = (d1 % 2 == 0 && d1 % 4 != 0 ? d1 : 0) + (d2 % 2 == 0 && d2 % 4 != 0 ? d2 : 0)
                + (d3 % 2 == 0 && d3 % 4 != 0 ? d3 : 0) + (d4 % 2 == 0 && d4 % 4 != 0 ? d4 : 0);
        int countEvenExcept4 = (d1 % 2 == 0 && d1 % 4 != 0 ? 1 : 0) + (d2 % 2 == 0 && d2 % 4 != 0 ? 1 : 0)
                + (d3 % 2 == 0 && d3 % 4 != 0 ? 1 : 0) + (d4 % 2 == 0 && d4 % 4 != 0 ? 1 : 0);
        double avgEvenExcept4 = countEvenExcept4 == 0 ? 0 : (double) sumEvenExcept4 / countEvenExcept4;

        // Average of odd digits except divisible by 3
        int sumOddExcept3 = (d1 % 2 != 0 && d1 % 3 != 0 ? d1 : 0) + (d2 % 2 != 0 && d2 % 3 != 0 ? d2 : 0)
                + (d3 % 2 != 0 && d3 % 3 != 0 ? d3 : 0) + (d4 % 2 != 0 && d4 % 3 != 0 ? d4 : 0);
        int countOddExcept3 = (d1 % 2 != 0 && d1 % 3 != 0 ? 1 : 0) + (d2 % 2 != 0 && d2 % 3 != 0 ? 1 : 0)
                + (d3 % 2 != 0 && d3 % 3 != 0 ? 1 : 0) + (d4 % 2 != 0 && d4 % 3 != 0 ? 1 : 0);
        double avgOddExcept3 = countOddExcept3 == 0 ? 0 : (double) sumOddExcept3 / countOddExcept3;

        // Difference between the two averages
        double diffAverages = avgEvenExcept4 - avgOddExcept3;

        // Sum of product of consecutive even digits
        int sumProductConsecutiveEven = (d1 % 2 == 0 && d2 % 2 == 0 ? d1 * d2 : 0)
                + (d2 % 2 == 0 && d3 % 2 == 0 ? d2 * d3 : 0) + (d3 % 2 == 0 && d4 % 2 == 0 ? d3 * d4 : 0);

        // Sum of product of consecutive odd digits
        int sumProductConsecutiveOdd = (d1 % 2 != 0 && d2 % 2 != 0 ? d1 * d2 : 0)
                + (d2 % 2 != 0 && d3 % 2 != 0 ? d2 * d3 : 0) + (d3 % 2 != 0 && d4 % 2 != 0 ? d3 * d4 : 0);

        // Sum of product of consecutive even digits except 2 and 6
        int sumProductConsecutiveEvenExcept2And6 = (d1 % 2 == 0 && d2 % 2 == 0 && d1 != 2 && d2 != 2 && d1 != 6
                && d2 != 6 ? d1 * d2 : 0)
                + (d2 % 2 == 0 && d3 % 2 == 0 && d2 != 2 && d3 != 2 && d2 != 6 && d3 != 6 ? d2 * d3 : 0)
                + (d3 % 2 == 0 && d4 % 2 == 0 && d3 != 2 && d4 != 2 && d3 != 6 && d4 != 6 ? d3 * d4 : 0);

        // Sum of product of consecutive odd digits except 3 and 7
        int sumProductConsecutiveOddExcept3And7 = (d1 % 2 != 0 && d2 % 2 != 0 && d1 != 3 && d2 != 3 && d1 != 7
                && d2 != 7 ? d1 * d2 : 0)
                + (d2 % 2 != 0 && d3 % 2 != 0 && d2 != 3 && d3 != 3 && d2 != 7 && d3 != 7 ? d2 * d3 : 0)
                + (d3 % 2 != 0 && d4 % 2 != 0 && d3 != 3 && d4 != 3 && d3 != 7 && d4 != 7 ? d3 * d4 : 0);

        // Difference between the two sums above
        int diffProductSums = sumProductConsecutiveEvenExcept2And6 - sumProductConsecutiveOddExcept3And7;

        // Corresponding digits of n and m
        int n1 = n / 1000;
        int n2 = (n / 100) % 10;
        int n3 = (n / 10) % 10;
        int n4 = n % 10;

        int m1 = m / 1000;
        int m2 = (m / 100) % 10;
        int m3 = (m / 10) % 10;
        int m4 = m % 10;

        // Sum of product of corresponding even digits of n and corresponding odd digits
        int sumProductEvenOddCorresponding = (n1 % 2 == 0 && m1 % 2 != 0 ? n1 * m1 : 0)
                + (n2 % 2 == 0 && m2 % 2 != 0 ? n2 * m2 : 0) + (n3 % 2 == 0 && m3 % 2 != 0 ? n3 * m3 : 0)
                + (n4 % 2 == 0 && m4 % 2 != 0 ? n4 * m4 : 0);

        // Print results
        System.out.println("Sum of all even digits: " + sumEvenDigits);
        System.out.println("Sum of all odd digits: " + sumOddDigits);
        System.out.println("Difference between averages: " + diffAverages);
        System.out.println("Sum of product of consecutive even digits: " + sumProductConsecutiveEven);
        System.out.println("Sum of product of consecutive odd digits: " + sumProductConsecutiveOdd);
        System.out.println("Difference between sum of products: " + diffProductSums);
        System.out.println(
                "Sum of product of corresponding even digits and odd digits: " + sumProductEvenOddCorresponding);
    }
}
