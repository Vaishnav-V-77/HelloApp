public class GreetingApp {
    public static void main(String[] args) {
        // Check if an argument was actually provided
        if (args.length > 0) {
            // Access the first argument provided (the name)
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Fallback if no name is provided
            System.out.println("Hello! Please provide a name as a command-line argument.");
        }
    }
}