package project2package;

public class project2 {


    //return = investmentAmount × (1 + monthlyInterestRate) ^ numberOfYears×12
    public static double futureInvestmentValue(double investmentAmount,
    double monthlyInterestRate,
    int years){

        double future_Investment_Value = investmentAmount * 
        Math.pow((1 + (monthlyInterestRate/12)), years*12);
        
        return future_Investment_Value;

    }


    public static void main(String[] args) {

        double principal = 1000;
        double interest = 0.09;
        
        int t = 30; //t = time
        
        //while years elapsed is less than our desired years execute this loop
        //store our return in a varibale to compound our returns 
        for (int years = 1; years <= t ; years++){
            double i = futureInvestmentValue(principal, 
            interest, 1);

            //round to dollars
            double answer = Math.round(i * 100.0)/100.0;

            System.out.println(years + " " + answer);
            
            principal = i;
        }
    }
}
