 class AllOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 15;

        int add = a + b;
        int m = b * c;
        int s = c - a;

        
        boolean res = a > b;
        boolean res1 = c < a;
        boolean res2 = a == c;

    
        boolean lAnd = (a > b) && (c > a);
        boolean lOr = (a > c) || (b < c);
        boolean lNot = !(a == b);

    
        System.out.println("a + b = " + add);
        System.out.println("b * c = " + m);
        System.out.println("c - a = " + s);

    
        System.out.println("a > b: " + res);
        System.out.println("c < a: " + res1);
        System.out.println("a == c: " + res2);

            System.out.println("(a > b) && (c > a): " + lAnd);
        System.out.println("(a > c) || (b < c): " + lOr);
        System.out.println("!(a == b): " + lNot);
    }
}