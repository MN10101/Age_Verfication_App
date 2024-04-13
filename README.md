# Age Verification App
This Java application, **AgeVerifier**, is a simple age verification program that prompts users to enter their age and determines whether they are old enough to access a website. The program utilizes a custom exception, `UnderageException`, to handle cases where the user's age is below 18.

## Usage

1. **Run the Program:**
- Compile and run the `AgeVerifier` class.
- The program will prompt you to enter your age.
  
2. **Enter Age:**
- Input your age when prompted.
  
3. **Access Confirmation:**
- If your age is 18 or older, the program will confirm access to the website.
- If your age is below 18, a custom exception (`UnderageException`) will be thrown, and an error message will be displayed.
- 
## Code Explanation
- **Custom Exception (`UnderageException`):**
- A custom exception is defined, extending the base `Exception` class. It is thrown when the user's age is below 18.
  
-**User Input Handling:**
- The program uses a `Scanner` to read user input for age.
- If the age is below 18, a `UnderageException` is thrown.
  
-**Exception Handling:**
- The program catches and handles the custom exception, displaying an error message when appropriate.
  
- **Resource Cleanup:**
- The `Scanner` is closed in the `finally` block to release resources.

## Author

- Mahmoud Najmeh
  
## Example
```java
public class AgeVerifier {
    public static void main(String[] args) {
        // Code snippet for reference.
    }
}
*******







