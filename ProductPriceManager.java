import java.util.*;

public class ProductPriceManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] prices = null;
        ArrayList<Integer> priceList = new ArrayList<>();

        while (true) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int n = sc.nextInt();
                    prices = new int[n];

                    for (int i = 0; i < n; i++) {
                        prices[i] = sc.nextInt();
                    }
                    System.out.println("Prices stored");
                    break;

                case 2:
                    priceList.clear();
                    for (int price : prices) {
                        priceList.add(price);
                    }
                    System.out.println("Prices copied to ArrayList");
                    break;

                case 3:
                    System.out.print("Prices: ");
                    for (int p : priceList) {
                        System.out.print(p + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    int max = Collections.max(priceList);
                    System.out.println("Maximum price = " + max);
                    break;

                case 5:
                    int removePrice = sc.nextInt();
                    if (priceList.remove(Integer.valueOf(removePrice))) {
                        System.out.println("Price " + removePrice + " removed");
                    } else {
                        System.out.println("Price not found");
                    }
                    break;

                case 6:
                    System.out.println("Exit");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}