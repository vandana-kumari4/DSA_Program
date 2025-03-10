import java.util.*;

public class pairSum {
   /*  public static Boolean pairSum1(ArrayList<Integer>List,int Target){
        for(int i=0;i<List.size();i++){
for(int j=i+1;j<List.size();j++){
    if(List.get(i)+List.get(j)==Target){
return true;
    }
}
        }
        return false;
    }*/
    public static boolean pairSum1(ArrayList<Integer>list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp !=rp){
            //case1
            if(list.get(lp)+list.get(rp)==target){
                return true;

            }
            //case 2
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                    //case 3
    rp--;
                
                }
        }
            return false;
    }
    
    public static void main (String[]args){
        ArrayList<Integer> List=new ArrayList<>();
        // 1,2,3,4,5,6
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        int Target=100;
        System.out.println(pairSum1(List,Target));
    }
}
