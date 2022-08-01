package Practice.basic_programs;
import java.util.*;

public class minimum_coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int coins = 0;
        while(n>0){

            if(n>=2000){
                int quo = n/2000;
                coins += quo;
                n = n-quo*2000;
            }
            else if(n>=500){
                int quo = n/500;
                coins += quo;
                n = n-quo*500;
            }
            else if(n>=200){
                int quo = n/200;
                coins += quo;
                n = n-quo*200;
            }
            else if(n>=100){
                int quo = n/100;
                coins += quo;
                n = n-quo*100;
            }
            else if(n>=50){
                int quo = n/50;
                coins += quo;
                n = n-quo*50;
            }
            else if(n>=20){
                int quo = n/20;
                coins += quo;
                n = n-quo*20;
            }
            else if(n>=10){
                int quo = n/10;
                coins += quo;
                n = n-quo*10;
            }
            else if(n>=5){
                int quo = n/5;
                coins += quo;
                n = n-quo*5;
            }
            else if(n>=2){
                int quo = n/2;
                coins += quo;
                n = n-quo*2;
            }
            else if(n>=1){
                int quo = n/1;
                coins += quo;
                n = n-quo*1;
            }
        }

        System.out.println(coins);
    }
}
