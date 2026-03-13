import java.util.Scanner;
 class MenuArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n = 0;
        int choice;

        while (true) {
            System.out.println("\nMENU");
            System.out.println("1. Insert Elements");
            System.out.println("2. Display Elements");
            System.out.println("3. Count Even Numbers");
            System.out.println("4. Count Odd Numbers");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number of elements: ");
                    n = sc.nextInt();

                    System.out.println("Enter " + n + " elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    System.out.println("Array elements are:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    int evenCount = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 == 0) {
                            evenCount++;
                        }
                    }
                    System.out.println("Number of even elements: " + evenCount);
                    break;

                case 4:
                    int oddCount = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 != 0) {
                            oddCount++;
                        }
                    }
                    System.out.println("Number of odd elements: " + oddCount);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}