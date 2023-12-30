class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int [] arr = new int [accounts.length];
        int s=0;
        int maxwealth =0;
        for(int i =0;i<accounts.length;i++){
            for (int j =0; j<accounts[i].length;j++){
                s = accounts[i][j] + s;
            }
            arr[i] = s; 
            s = 0;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] > maxwealth){
                maxwealth = arr[i];
            }
        }
        return maxwealth;
    }
}
