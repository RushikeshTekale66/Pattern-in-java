class Main {
    void pattern() {
        int length = 5;
//          * 
//         * * #
//       * * * # #
//     * * * * # # #
//   * * * * * # # # #
// * * * * * * # # # # #
// * * * * * * # # # # # #
//   * * * * * # # # # #
//     * * * * # # # #
//       * * * # # #
//         * * # #
//           * #
        
        System.out.println("Hill trangle");
        for(int i=0; i<=length; i++){
            for(int j=0; j<=length-i; j++){
                System.out.print("  ");
            }
            
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            for(int l=0; l<i; l++){
                System.out.print("# ");
            }
            System.out.println();
        }


        for(int i=0; i<=length; i++){
            for(int j=0; j<=i; j++){
                System.out.print("  ");
            }
            for(int k=0; k<=length-i; k++){
                System.out.print("* ");
            }
            for(int l=0; l<=length-i; l++){
                System.out.print("# ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        Main p = new Main();
        p.pattern();
    }
}