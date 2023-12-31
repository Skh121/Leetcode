class EmployeesTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
       int meetTarget = 0;
        for (int i=0;i<hours.length;i++){
            if(hours[i] >= target){
                meetTarget += 1;
            }
        }
        return meetTarget;
    }
}
