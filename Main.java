class Main {
    void pattern() {
        int length = 5;

        // Program to print square star pattern
        /*
* * * * * 
* * * * * 
* * * * *
* * * * *
* * * * *
         */
        for (int i = 0; i < length; i++) {
            
            for(int j=0; j<length; j++){
                System.out.print("* ");
            }
            System.err.println();
            
        }
    }

    public static void main(String[] args) {
        System.out.println("Star Pattern 7 :Program to print square star pattern");
        Main p = new Main();
        p.pattern();
    }
}