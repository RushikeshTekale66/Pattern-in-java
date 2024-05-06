class Main {
    void pattern() {
        int length = 5;

        //  Program to print the Solid Inverted Half Diamond Star Pattern.
        /*
            .*********
            ..*******
            ...*****
            ....***
            .....*
         */
        for(int i=length; i>=-length; i--){
            for(int j=0; j<Math.abs(i); j++){
                System.out.print(".");
            }
            for(int k=length; k>=Math.abs(i); k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("Star Pattern 13 : Program to print the Solid Inverted Half Diamond Star Pattern.");
        Main p = new Main();
        p.pattern();
    }
}