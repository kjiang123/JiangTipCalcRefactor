import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalcRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        double cost = 0;

        System.out.println("Welcome to the Tip Calculator!");
        System.out.print("How many people are in your group?: ");
        int numPoeple = scan.nextInt();
        System.out.print("What's the tip percentage?: ");
        int tipPercent = scan.nextInt();

        TipCalc tipCalc = new TipCalc(numPoeple, tipPercent);

        while (cost != -1){
            tipCalc.addMeal(cost);
            System.out.print("Enter a cost in dollars, enter -1 to stop: ");
            cost = scan.nextDouble();

        }

        System.out.println("--------------------------");
        System.out.println("Total Bill Before Tip: " + formatter.format(tipCalc.getTotalBillBeforeTip()));
        System.out.println("Tip Percentage: " + formatter.format(tipCalc.getTipPercentage()));
        System.out.println("Total Tip: " + formatter.format(tipCalc.tipAmount()));
        System.out.println("Total Bill With Tip: " + formatter.format(tipCalc.totalBill()));
        System.out.println("Per Person Bill Before TIp: " + formatter.format(tipCalc.perPersonCostBeforeTip()));
        System.out.println("Tip Per Person: " + formatter.format(tipCalc.perPersonTipAmount()));
        System.out.println("Total Cost Per Person: " + formatter.format(tipCalc.perPersonTotalCost()));
    }
}
