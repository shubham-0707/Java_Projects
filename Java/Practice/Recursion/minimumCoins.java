package Practice.Recursion;
import java.util.*;
import java.lang.*;


// This program is made to find the minimum number of coins needed for a particular sum of money...(Here we are applying greedy approach with recursion)
public class minimumCoins {
    public static void minimumCoins(int money , int count){
        //System.out.print(money+" ");
        if(money==0){
            System.out.println(count);
            //return count;
        }
        else if(money>=2000){
            money = money-2000;
            count++;
            //System.out.println(money+" 2000 "+count);
            minimumCoins(money , count);
        }
        else if(money>=500){
            money = money-500;
            count++;
            //System.out.println(money+" 500 "+count);
            minimumCoins(money , count);
        }
        else if(money>=200){
            money = money-200;
            count++;
            //System.out.println(money+" 200 "+count);
            minimumCoins(money , count);
        }
        else if(money>=100){
            money = money-100;
            count++;
            //System.out.println(money+" 100");
            minimumCoins(money , count);
        }
        else if(money>=50){
            money = money-50;
            count++;
            //System.out.println(money+" 50 "+count);
             minimumCoins(money ,  count);
        }
        else if(money>=20){
            money = money-20;
            count++;
            //System.out.println(money+" 20 "+count);
            minimumCoins(money , count);
        }
        else if(money>=10){
            money = money-10;
            count++;
            //System.out.println(money+" 10 "+count);
            minimumCoins(money ,count);
        }
        else if(money>=5){
            money = money-5;
            count++;
            //System.out.println(money+" 5 "+count);
            minimumCoins(money , count);
        }
        else if(money>=2){
            money = money-2;
            count++;
            //System.out.println(money+" 2 "+count);
            minimumCoins(money , count);
        }
        else if(money>=1){
            money=money-1;
            count++;
            //System.out.println(money+" 1 "+count);
            //if(money==0) return count;
            minimumCoins(money , count);
        }
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here..
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        minimumCoins(n , 0);
        //System.out.println(count);
    }
}
