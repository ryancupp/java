import java.util.*;

public class CafeUtil {
    
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for (double value : prices){
            sum += value;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuitems){
        System.out.println(menuitems);
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName);
        System.out.printf("There are %s people in front of you ", customers.size());
        System.out.println(customers);
        customers.add(userName);
    }
}

