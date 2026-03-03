 class Logical {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

        boolean andResult = (a > 5) && (b < 10);
        boolean orResult = (a < 5) || (b < 10);
        boolean notResult = !(a == b);

        System.out.println("(a > 5) && (b < 10): " + andResult);
        System.out.println("(a < 5) || (b < 10): " + orResult);
        System.out.println("!(a == b): " + notResult);
    }
}