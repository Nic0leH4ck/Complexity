public class Main {
    public static boolean search(int[][]mat,int num){
        if (){//out of borders
            return false;
    }
        int i=0;
        int j=0;
        int n=mat.length;
        while(n>1){
            mins1=mat[0+i][0+j];
            maxs1=mat[(n/2)-1+i][0+j];
            mins2=mat[0+i][(n/2)+j];
            maxs2=mat[(n/2)-1+i][(n/2)+j];
            mins3=mat[(n/2)+i][(n/2)+j];
            maxs3=mat[(n-1)+i][(n/2)+j];
            mins4=mat[(n-1)+i][0+j];
            maxs4=mat[(n-1)+i][0+j];
            if(num>maxs2){
                if(num>maxs3){
                    i+=n/2;
                    j+=0;
                }
                else{
                    i+=n/2;
                    j+=n/2;
                }
            }
            else{
                if (num > maxs1) {

                    i+=0;
                    j+=n/2;
                }
                else{
                    i=i;
                    j=j;
                }
                }
            n=n/2;
        }//end while
        if(num==mat[i][j]){
            System.out.println("row="+i);
            System.out.println("col="+j);
            return true;
        }
        return false;
    }
}//end