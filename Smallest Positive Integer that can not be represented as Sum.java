class Solution { 
    long smallestpositive(long[] array, int n){ 
        Arrays.sort(array);
        long change=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>change+1)
                return change+1;
            else
                change = change+array[i];
        }
        return change+1;
    }
} 
