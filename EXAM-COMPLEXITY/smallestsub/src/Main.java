public class Main {
    public static int smallestsub(int []a,int k ){
        int sum=0; //sum of sub array
        int j=0;
        int i-0;
        boolean=done; //
        int subarrlength =0;
        while(!done){
            if(sum<k && i<arr.length){//while we still didnt found
                sum=sum+a[i];//sum the sum with the current index
                i++;//to the next index
                (sum>=k&& j<i){
                    if(subarrlength >(i-j+1))
                        subarrlength =i-j+1;
                    sum=sum-a[i];//if the sum is bigger than k so we need to less
                // the index anf go check again for the next
                j++;
                }
                if(j==i || (i==arr,length()-1&& sum<k)){
                    done=true;//we checked all the options
                    //there is nothing else to check so we are done
                }
                if(subarrlength >0)//if there is subarray
                    return subarrlength;
                return (a.length+1);
                //if there is no sub-arr
            }
        }
    }
}