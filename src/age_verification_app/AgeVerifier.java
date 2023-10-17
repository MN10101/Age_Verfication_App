package age_verification_app;

import java.util.*;

// Define a custom exception named UnderageException that extends the Exception class.
class UnderageException extends Exception {

	// Constructor for the exception that accepts a message.
	public UnderageException(String message) {

		// Call the constructor of the parent Exception class with the provided message.
		super(message);
	}
}

public class AgeVerifier {
	public static void main(String[] args) {
		// Create a Scanner object to read user input.
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Enter your age: ");
			// Read the age entered by the user.
			int age = scanner.nextInt();

			// Check if the entered age is less than 18.
			if (age < 18) {
				// If the age is less than 18, throw the custom UnderageException.
				throw new UnderageException("To access the website, you must be 18 years or older.");
			}
			// If the age is 18 or older, print a confirmation message.
			System.out.println("Access to the website confirmed.");
		} catch (UnderageException e) {
			// Catch and handle the custom exception (UnderageException) if it is thrown.
			System.err.println("Error: " + e.getMessage());
		} finally {
			// Close the Scanner to release resources.
			scanner.close();
		}
	}
}
