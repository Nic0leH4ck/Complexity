public class Main {
    public class Main {
        public static int getMedin(int []a,int []b){
            int n=a.length();
            int []mizugnotsorted=new int[n+n];//new array
            for(int i=0;i<n;i++)
                mizugnotsorted[i]=a[i];
            for(int i=0;i<n;i++)
                mizugnotsorted[n+1]=b[i];
            int []mizug=quicksort(mizugnotsorted);//sorte the new arrray
            int hezion=(mizug[n]+mizug[n+1])/2;//calculate the hezion
            return hezion;
        }
    }
}