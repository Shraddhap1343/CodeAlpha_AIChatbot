import java.util.HashMap;

public class Chatbot {

    private HashMap<String, String> responses;

    public Chatbot() {

        responses = new HashMap<>();

        responses.put("hello", "Hello! How can I help you?");
        responses.put("hi", "Hi! Nice to meet you.");
        responses.put("how are you", "I am fine. Thanks for asking!");
        responses.put("what is your name", "I am an AI Chatbot.");
        responses.put("java", "Java is an object-oriented programming language.");
        responses.put("bye", "Goodbye! Have a nice day.");
    }

    public String getResponse(String input) {

        input = input.toLowerCase().trim();

        if (responses.containsKey(input)) {
            return responses.get(input);
        }

        return "Sorry, I don't understand that. Please ask another question.";
    }
}