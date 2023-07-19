public class Main {
   public static void printTriplets (int[]a,int num){
       for(int i=0;i<a.length-1;i++){
           int j=i+1;
           int k=a.length-1;
           while(j<k){
               if(a[i]*a[j]*a[k]==num){
                   System.out.println(a[i]=","+a[j]+","+a[k]);
                   j++;
                   k--;
               }
               else if(a[i]*a[j]*a[k]<num){
                   j++;
               }
               else
                   k--;
           }
       }
   }
}
//space-o(1)
//time-o(n^2)