import java.util.*;


public class ExpenseSplitter {

    public static void main(String[] args) {
        
        List<String> expenses = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            expenses.add("Expense " + i);
        }

        
        Map<String, Map<String, Double>> expenseMap = new HashMap<>();
        List<String> parties = Arrays.asList("Amit", "Rahul", "Sanjay");

       Scanner myObj = new Scanner(System.in);
       System.out.println("Enter the total amount ");
       double totalAmount = myObj.nextDouble();
       System.out.println("Total Amount: " + totalAmount);
       
        Random random = new Random();
        for (String expense : expenses) {
            String payer = parties.get(random.nextInt(parties.size()));
            double sharePerPerson = totalAmount / parties.size();

            Map<String, Double> partyShares = new HashMap<>();
            for (String party : parties) {
                partyShares.put(party, sharePerPerson);
            }

            expenseMap.put(expense, partyShares);
            
            System.out.println();
            System.out.println(expense);
            System.out.println("Payer: " + payer);
            System.out.println("Shares: " + partyShares);
           
        }
    }
}
