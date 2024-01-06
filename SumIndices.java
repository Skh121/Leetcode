import java.util.ArrayList;
import java.util.List;
public class SumIndices {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        ArrayList<Integer> arr1= new ArrayList<>();
        String [] arr = new String[nums.size()];
        int sum =0;
        int sum1 =0;
        for(int i =0;i<nums.size();i++){
            arr[i]= Integer.toBinaryString(i);
        }
        for (int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length();j++){
                sum += Character.getNumericValue(arr[i].charAt(j));
            }
            arr1.add(sum);
            sum = 0;
        }
        for (int i =0;i<arr1.size();i++){
            if (arr1.get(i)==k){
                sum1+=nums.get(i);
            }
        }
        return sum1;
    }
}
