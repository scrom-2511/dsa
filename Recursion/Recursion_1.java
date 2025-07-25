class Recursion_1 {

    // PRINT NAME 5 TIMES
    public static void printNtimes(String name, int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(name);
            printNtimes(name, --n);
        }
    }

    // PRINT LINEARLY FROM 1 -> N
    public static void printLinearly(int i, int n) {
        if (i > n) {
            return;
        } else {
            System.out.println(i);
            printLinearly(++i, n);
        }
    }

    //PRINT FROM N->1
    public static void printNto1(int n){
        if(n == 0){
            return;
        }else{
            System.out.println(n);
            printNto1(--n);
        }
    }

    public static void main(String[] args) {
        printNtimes("name", 5);
        printLinearly(1, 10);
        printNto1(10);
    }
}
