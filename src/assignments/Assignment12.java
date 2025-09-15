package assignments;

public class Assignment12 {

    public static void main(String[] args) {

        // Check if 25 is a prime number
        int number = 37;
        if (prime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }


    }

    // Method to check if a number is prime
    public static boolean prime(int n) {
    	if(n<=1) {
    		return false;
    	}
        for (int i = 2; i < n; i++) {
            if ( n % i == 0) {
            	return false;
            }
        }
		return true;
	
    }
}