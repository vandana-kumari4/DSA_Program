public class gridWys {
    public static int gridWays(int i,int j,int n,int m){
        //base case
        if(i==n-1&& j==m-1){//condi for last cell
            return 1;
        }else if(i==n||j==n){//boundry  cross condition 
            return 0;
        }

        
int w1=gridWays(i+1,j,n,m);
int w2=gridWays(j+1,i,n,m);
return  w1+w2;
    }
    public static void main(String[]args){
        int n=3,m=3;
        System.out.println(gridWays(0,0,m,n));
    }
}
