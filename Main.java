class Main {
    void pattern() {
        int length = 5;

        // Display the Full Pyramid Star Pattern
        /*
    * 
   * *
  * * *
 * * * *
* * * * *
         */
        for (int i = 0; i < length; i++) {
            for(int j=length-i; j>=0; j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Star Pattern 5 : Program to Display the Full Pyramid Star Pattern");
        Main p = new Main();
        p.pattern();
    }
}