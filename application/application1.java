import java.util.Scanner;

class mark {
    Scanner sc = new Scanner(System.in);

    int t, e, m, sm, so;
    int sum = 0;

    public static void main(String[] args) {
        mark j = new mark();
        j.menu();
    }

    void menu() {
        boolean jo = true;

        do {
            System.out.println("\n1.Enter your mark");
            System.out.println("2.Total mark");
            System.out.println("3.Average");
            System.out.println("4.Grade");
            System.out.println("5.Exit");
            System.out.print("Choose any one: ");

            int option = sc.nextInt();

            if (option == 1) {
                getmark();
            } 
            else if (option == 2) {
                cmark();
            } 
            else if (option == 3) {
                average();
            } 
            else if (option == 4) {
                grade();
            } 
            else {
                jo = false;
            }

        } while (jo);
    }

    void getmark() {
        System.out.print("Enter Tamil mark: ");
        t = sc.nextInt();

        System.out.print("Enter English mark: ");
        e = sc.nextInt();

        System.out.print("Enter Maths mark: ");
        m = sc.nextInt();

        System.out.print("Enter Science mark: ");
        sm = sc.nextInt();

        System.out.print("Enter Social mark: ");
        so = sc.nextInt();
    }

    void cmark() {
        sum = t + e + m + sm + so;
        System.out.println("Total marks: " + sum);
    }

    void average() {
        int avg = sum / 5;
        System.out.println("Average: " + avg);
    }

    void grade() {
        if (sum >= 485 && sum <= 500) {
			
            System.out.println("O Grade");
        } 
		else if (sum >= 450 && sum <= 484) 
		{
            System.out.println("A Grade");
        } 
		else if (sum >= 400 && sum <= 449) 
		{
            System.out.println("B Grade");
        }
		else if (sum >= 350 && sum <= 399)
			{
            System.out.println("C+ Grade");
        }
		else if (sum >= 300 && sum <= 349) 
		{
            System.out.println("C Grade");
        }
		else if (sum >= 250 && sum <= 299) 
		{
            System.out.println("D++ Grade");
        }
		else if (sum >= 175 && sum <= 249) 
		{
            System.out.println("D Grade");
        } else 
		{
            System.out.println("Fail");
        }
    }
}