class Main {
    void pattern() {
        int length = 5;
//          *# 
//         * *# #
//       * * *# # #
//     * * * *# # # #
//   * * * * *# # # # #
        
        System.out.println("Hill trangle");
        for(int i=1; i<=length; i++){
            for(int j=1; j<=length-i; j++){
                System.out.print("  ");
            }
            
            for(int k=1; k<=i; k++){
                System.out.print(" *");
            }
            for(int l=0; l<i; l++){
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