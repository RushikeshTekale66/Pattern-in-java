class Main {
    void pattern() {
        int length = 5;

        //  Program to print the Full Pyramid Star Pattern
        /*
            ....*.....
            ...*.*....
            ..*...*...
            .*.....*..
            *.......*.
         */
        int start = 1;
        for(int i=length; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print(".");
            }
            for(int k=0; k<start; k++){
                System.out.print("*");
                
            }
            start +=2;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("Star Pattern 11 : Program to print the Full Pyramid Star Pattern.");
        Main p = new Main();
        p.pattern();
    }
}