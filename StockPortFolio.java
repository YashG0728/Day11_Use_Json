import java.util.Scanner;

public class StockPortFolio {
    public static int Stock(int n) {
        int numOfStock = n;
        int valuation = 0;
        int valuePerShare;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numOfStock; i++) {
            System.out.println("Enter" +" "+ (i + 1) + " details stock");
            System.out.println("Enter the Number of Shares you hold of " +" "+ (i + 1) + " Stock");
            int numOfShares = sc.nextInt();
            System.out.println("Enter the price" +" "+ (i + 1) + " Stock");
            int sharePrice = sc.nextInt();
            valuePerShare = numOfShares * sharePrice;
            valuation = valuePerShare + valuation;
        }
        sc.close();
        return valuation;
    }
    public static void printReport(int n,int stockvaluation) {
        System.out.println("Person holds total "+n+" "+"stocks with valuation of "+stockvaluation);
    }
        public static void main(String[] args) {
            System.out.println("Enter how many Stock You Hold");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int stockValuation = Stock(n);
            printReport(n, stockValuation);
            sc.close();
    }
}