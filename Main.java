class Main {
    void pattern() {
        // print an inverted right triangle star pattern.
        /*
        *****
        ****
        ***
        **
        *
         */
        int length = 5;
        for (int i = 0; i < length; i++) {
            for (int j = length - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Star Pattern 2 : print an inverted right triangle star pattern.");
        Main p = new Main();
        p.pattern();
    }
}