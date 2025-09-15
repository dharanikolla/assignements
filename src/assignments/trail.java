package assignments;

public class trail {
	public static void main(String[] args) {
        int number = 25;

        if (prime(number) == 1) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Using int instead of boolean
    public static int prime(int n) {
        if (n <= 1) {
            return 0; // 0 means "not prime"
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return 0; // 0 means "not prime"
            }
        }

        return 1; // 1 means "prime"
    }

}
