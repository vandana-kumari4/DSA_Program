public class sudukoo {
    public static boolean  isSafe(int sudukoo[][],int row,int col,int digit){
//coloumn
for(int i=0;i<=8;i++){
    if(sudukoo[i][col]==digit){
        return false;

    }
}//row
for(int j=0;j<=8;j++){
    if(sudukoo[row][j]==digit){
        return false;

    }
}//grid
 int sr=(row/3)*3;
 int sc=(col/3)*3;
 //for 3x3
    for(int i= sr;i<sr+3;i++){
for(int j=sc;j<sc+3;j++){
if(sudukoo[i][j]==digit){
    return false;
}
}
    } 
    return  true;
}
//sudukoo solver functio
    public static boolean sudukuSolver(int sudukoo[][],int row,int col){
        //base
         if(row==9 ){
            return true ;


      //   }else if(row==9){
//return false;

            }
        
        //recursio
        //next row
        int nextRow=row,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;

        }
        //no replace any digit
        if(sudukoo[row][col]!=0){
          return   sudukuSolver(sudukoo,nextRow,nextCol);
        }
        for(int digit=1;digit<=9;digit++){
if(isSafe(sudukoo,row,col,digit)){
    sudukoo[row][col]=digit;
    //call
   if(sudukuSolver(sudukoo,nextRow,nextCol)){//solution exist 

return true;
   }
   sudukoo[row][col]=0;
}
    
} 
    return false;

}
public static void printSudukoo(int sudukoo[][]){
    for(int i=0; i<9;i++){
        for(int j=0;j<9;j++){
            System.out.print(sudukoo[i][j]+" ");
        }
        System.out.println();
    }
}
    public static void main(String[]args){
        int sudukoo[][]={{0,0,8,0,0,0,0,0,0},
        {9,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};
        if(sudukuSolver(sudukoo,0,0)){
            System.out.println("solution exist");
            printSudukoo(sudukoo);

        }else{
            System.out.println("solution does nort exist");
            
        }
    }
}
