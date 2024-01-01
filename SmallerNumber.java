public class SmallerNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count =0;
        int[] arr = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums.length;j++){
                if (i!=j && nums[i]>nums[j]){
                        count +=1;
                }
            }
            arr[i]=count;
            count =0;
        }
        return arr;
    }
}
