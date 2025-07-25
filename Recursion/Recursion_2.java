class Recursion_2 {
    
    //SUMMATION OF FIRST N NUMBERS(Parameterized)
    public static int sumParameterized(int i, int sum){
        if (i == 0){
            return sum;
        }else{
            return sumParameterized(i-1, sum+i);
        }
    }
    
    //SUMMATION OF FIRST N NUMBERS(Functional)
    public static int sumParameterized(int i){
        if (i == 0){
            return 0;
        }else{
            return i + sumParameterized(i-1);
        }
    }
    
    public static void main(String[] args) {
        int sumResult1 = sumParameterized(3,0);
        System.out.println(sumResult1);
        
        int sumResult2 = sumParameterized(3);
        System.out.println(sumResult2);
    }
}
