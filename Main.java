class Main {
    void pattern() {
        int length = 5;

        //  Program to print the Solid Half Diamond Star Pattern.
        /*
* * * * * 
* * * * * 
* * * * *
* * * * *
* * * * *
         */
        for (int i = 0; i < length; i++) {
            
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();            
        }
        for(int i=0; i<length; i++){
            for(int j=0; j<length-i; j++){
                System.out.print("*");
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Star Pattern 8 : Program to print the Solid Half Diamond Star Pattern.");
        Main p = new Main();
        p.pattern();
    }
}