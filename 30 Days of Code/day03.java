
class day03 {

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
     // Calculate tip amount
        double tip = (tip_percent / 100.0) * meal_cost;
        
        // Calculate tax amount
        double tax = (tax_percent / 100.0) * meal_cost;
        
        // Calculate total cost
        double totalCost = meal_cost + tip + tax;
        
        // Print the rounded total cost
        System.out.println(Math.round(totalCost));

    }

}
