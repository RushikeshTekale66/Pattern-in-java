class Main {
    void pattern() {
        int length = 5;

        // Program to print square star pattern 
        /*
* * * * *
 * * * *
  * * *
   * *
    *
         */
        for (int i = 0; i < length; i++) {
            
            for(int k=0; k<=i; k++){
                System.out.print(".");
            }
            for(int j=i; j<length; j++){
                System.out.print("* ");
        }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Star Pattern 7 : Program to print square star pattern");
        Main p = new Main();
        p.pattern();
    }
}