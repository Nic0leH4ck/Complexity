public class Main {
    public static void replace(int[]a){
        int max=0;
        for(i=a.length-1;i>=0;i--){
            temp=a[i];
            a[i]=max;
            if(temp>max)
                max=temp;
        }
    }
}//end main
