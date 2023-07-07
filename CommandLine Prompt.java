In Java, you can pass command-line arguments to your program by providing them as arguments when running the Java command. Here's an example of how you can access and use command-line arguments in your Java code:

public class CommandLineArgumentsExample {
    public static void main(String[] args) {
        // Check if command-line arguments are provided
        if (args.length > 0) {
            System.out.println("Command-line arguments:");
            // Iterate over the arguments and print them
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command-line arguments provided.");
        }
    }
}

//In this example:

// The main method is the entry point of the program and accepts an array of String arguments called args.
// The args array represents the command-line arguments passed to the program.
// We check if the length of args is greater than 0 to determine if any command-line arguments are provided.
// If command-line arguments are present, we iterate over the args array and print each argument.
// If no command-line arguments are provided, a message is printed indicating so.
// To run this program with command-line arguments, you can open a terminal or command prompt, navigate to the directory containing the compiled .class file, and execute the following command:

// Copy code
// java CommandLineArgumentsExample arg1 arg2 arg3
// Replace CommandLineArgumentsExample with the name of your Java class file, and arg1, arg2, arg3 with the desired command-line arguments. The program will then display the provided command-line arguments.
