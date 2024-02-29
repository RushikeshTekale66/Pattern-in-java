class Main {
    void pattern(){
        // print the right triangle star pattern.
        /*  *
            **
            ***
            ****
            ***** */
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Main p = new Main();
        p.pattern();
    }
}