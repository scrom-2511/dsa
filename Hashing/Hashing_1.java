import java.util.Arrays;
import java.util.HashMap;

class Hashing_1 {
    //NUMBER HASHING
    public static int findMaxNum(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int[] hashNum(int[] arr){
        int len = findMaxNum(arr);
        int[] hashArr = new int[len+1];
        
        for (int i=0; i< arr.length; i++){
            int num = arr[i];
            hashArr[num] += 1;
        }
        return hashArr;
    }
    public static int getNumCount(int[] arr, int num){
        return arr[num];
    }
    public static HashMap<Integer, Integer> hashNumMap(int[] arr){
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            if(hash.containsKey(arr[i])){
                int count = hash.get(arr[i]) + 1;
                hash.put(arr[i], count);
            }else{
                hash.put(arr[i], 1);
            }
        }
        return hash;
    }
    
    // CHARACTER HASHING
    public static int findMaxChar(String str){
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < str.length(); i++){
            int ch = str.charAt(i) - 33;
            if(ch > max){
                max = ch;
            }
        }
        return max;
    }
    public static int[] hashChar(String str){
        int len = findMaxChar(str);
        int[] hashArr = new int[len+1];
        
        for (int i = 0; i < str.length(); i++){
            int ch = str.charAt(i)-33;
            hashArr[ch] += 1;
        }
        return hashArr;
    }
    public static int getCharCount(int[] arr, char ch){
        int i = ch - 33;
        return arr[i];
    }
    
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 2, 6};
        // int[] freqArr = hashNum(arr);
        // System.out.println(Arrays.toString(freqArr));
        // System.out.println(getNumCount(freqArr, 6));
        HashMap<Integer, Integer> freqNum = hashNumMap(arr);
        System.out.println(freqNum.get(6));
        
        
        String testString = "arr!";
        int[] charFreqArr = hashChar(testString);  
        System.out.println(Arrays.toString(charFreqArr));
        System.out.println(getCharCount(charFreqArr, 'r'));
    }
}