// This code is another approach, diff from the notes logic
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list= new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            List<Integer> currList = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    currList.add(1);
                } else{
                    int el1 = list.get(i - 1).get(j - 1);
                    int el2 = list.get(i - 1).get(j);
                    currList.add(el1 + el2);
                }
            }
            list.add(currList);
        }

        return list;
    }
}
