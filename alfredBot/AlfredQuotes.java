package alfredBot;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String guest = String.format("Hi %s, nice to see you", name);
        return guest;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "The date today is " + date;
    
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") > -1) {
            return "Yes sir, she'll never figure that out";
        }

        if (conversation.indexOf("Alfred") > -1) {
            return "Of course, happy to help";
        }

        return "Right. And with that I shall retire.";
    }

	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}
