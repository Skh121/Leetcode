import java.util.ArrayList;
import java.util.List;
class kidsCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int element =0;
        int maxnumber = 0;
        ArrayList<Integer> obj = new ArrayList<>();
        for (int i =0; i<candies.length;i++){
            element = candies[i] + extraCandies;
            obj.add(element);
            element =0;
        }
        for(int i=0;i<candies.length;i++){
            if (maxnumber<candies[i]){
                maxnumber=candies[i];
            }
        }
        ArrayList<Boolean> bool = new ArrayList<>();
        for (int i=0;i<obj.size();i++ ){
                if(obj.get(i) >= maxnumber){
                    bool.add(true);
                }
                else{
                    bool.add(false);
                }
        }
        return bool;
    }
}