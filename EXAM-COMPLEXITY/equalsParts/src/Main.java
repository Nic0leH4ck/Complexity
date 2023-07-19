public class Main {
    public static boolean equalsParts(int []a){
        int sumAll=0; int sumPartial=0;
        for(int i=0;i<a.length;i++)// while in array borders
            sumAll+=a[i];

        for (int i=0;i<a.length;i++){
            sumPartial +=a[i];
            if(sumPartial==sumAll-sumPartial)
                return true;
        }
        return false;
    }
}
//o(n)