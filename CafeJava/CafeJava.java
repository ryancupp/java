package CafeJava;

public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripPrice = 2.5;
        double lattePrice = 3.0;
        double cappuccinoPrice = 3.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        
        //check Cindhuri order status
        System.out.println("Is order 1 ready yet?: " + isReadyOrder1);

        // check Noah order status and display total
        if(isReadyOrder4){
            System.out.println(customer4 + " " + "your total is " + cappuccinoPrice);
        } else{
            System.out.println(customer4 + ", your order is not ready yet");
        }

        //display Sam order total and status
        System.out.println(customer2 + " your total is " + (lattePrice * 2));
        if (isReadyOrder2){
            System.out.println(customer2 + " your oder is now ready");
        } else{
            System.out.println(customer2 + " your oder is not ready yet");
        }

        //Display the difference Jimmy owes
        System.out.println(customer3 + " you owe " + (lattePrice - dripPrice));
    }
}

