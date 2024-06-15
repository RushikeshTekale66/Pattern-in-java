class Main {
    void pattern() {
        int length = 5;
        // * * * *
        //   * * *
        //     * *
        //       *
        
        System.out.println("Right side decreasing trangle");
        for(int i=1; i<=length; i++){
            
            for(int k=1; k<=i; k++){
                System.out.print("  ");
            }
            for(int j=1; j<=length-i; j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Main p = new Main();
        p.pattern();
    }
}