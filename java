import java.util.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nr= 1;
        int i = 2;
        while(i<= n){
            nr+= sum(i)+i;
            i++;
        }
        System.out.println(nr);
    }public static int sum(int n){
        int s= 1;
        for(int i= 2;i <n/2+1; i++){
            if(n%i ==0){
                s+=i;
            }
        }
        return s;
    }
}
