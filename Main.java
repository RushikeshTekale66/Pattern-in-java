class Main {
    void pattern() {
        int length = 5;

        //  Print the Inverted Full Pyramid Star Pattern.
        /*
            .*********
            ..*******
            ...*****
            ....***
            .....*
         */
        int start =length*2;
        for(int i=1; i<=length; i++){
            for(int j=0; j<i; j++){
                System.out.print(".");
            }
            for(int k=0; k<start-1; k++){
                System.out.print("*");
            }
            start -=2;
            System.out.println(); 
        }

    }

    public static void main(String[] args) {
        System.out.println("Star Pattern 12 : Print the Inverted Full Pyramid Star Pattern.");
        Main p = new Main();
        p.pattern();
    }
}