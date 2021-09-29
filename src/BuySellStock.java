import java.util.Scanner;

/*
* Maximum profit = stock buy at lowest price and sell into high price
*
* */
public class BuySellStock {
    public static int maxProfit(int price[],int n)
    {
        int maximumProfit = 0;
        int minStock = price[0];
        for (int i = 0; i < n; i++) {
            minStock = Math.min(minStock,price[i]);
            int profit = price[i] - minStock;
            maximumProfit = Math.max(maximumProfit,profit);
        }
        return  maximumProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int price[] = new int[n];
        for (int i = 0; i <n; i++) {
            price[i] = sc.nextInt();
        }
        System.out.println(maxProfit(price,n));
    }

}
