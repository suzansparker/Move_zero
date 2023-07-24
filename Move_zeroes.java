import java.util.*;

public class Move_zeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers");
        int n=sc.nextInt();
        int Ar[]=new int [n];
        int sum=0;
        for(int i=0;i<n;i++) {
            Ar[i] = sc.nextInt();

        if(Ar[i]!=0){

             Ar[sum++] =Ar[i];}}
             while(sum<n){
                 Ar[sum++]=0;//System.out.println(Ar[i]+"");
                 //
                 }

            //for(int m=0;m<n;m++){System.out.println(Ar[m]+"");}


    //Arrays.sort(Ar);
        System.out.println(Arrays.toString(Ar));}

}
