import java.util.Scanner;

public class AIChatbot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Chatbot bot = new Chatbot();

        System.out.println("=================================");
        System.out.println("      AI CHATBOT STARTED");
        System.out.println("Type 'bye' to exit.");
        System.out.println("=================================");

        while (true) {

            System.out.print("\nYou: ");
            String userInput = scanner.nextLine();

            String response = bot.getResponse(userInput);

            System.out.println("Bot: " + response);

            if (userInput.equalsIgnoreCase("bye")) {
                break;
            }
        }

        scanner.close();
    }
}