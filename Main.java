class Main {
    void pattern() {
        int length = 5;

        //  Program to Program to print the Inverted V Star Pattern..
        /*
            ....*.....
            ...*.*....
            ..*...*...
            .*.....*..
            *.......*.
         */
        int x = length;
        int y = length;
        for (int j = 1; j <= length; j++) {
            for (int i = 1; i <= length * 2; i++) {
                if (i == x || i == y) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }

            }
            x--;
            y++;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("Star Pattern 10 :  Program to Program to print the Inverted V Star Pattern.");
        Main p = new Main();
        p.pattern();
    }
}