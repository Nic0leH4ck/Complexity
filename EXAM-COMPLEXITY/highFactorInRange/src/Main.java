public class Main {
    public  static void findFactors(int n){
        int low=2, high= n;
        int low=smallest prime;
        high=request number;
        while (low<=high){
            int mid=(low+high)/2;//finds middle point
            boolean lefthalf=isHighFactorInRange(n,low,mid);//cheak range low-mid
            boolean righthalf=isHighFactorInRange(n,high,mid);//check range high-mid
            is(lefthalf&&righthalf){//happens if  mid is the biggest factor
                System.out.println(mid+""+n/mid);
                break;
            }
            if(lefthalf){//biggest factor sis in left half
                high=mid-1;//change search range /decreasing the maximum value
                continue;
            }
            else {
                low=mid+1;//changes search range , increasing the minumim value
                continue;
            }
        }
        return;//generic return for void method
    }
}//end