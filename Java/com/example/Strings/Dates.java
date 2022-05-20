package com.example.Strings;
import java.util.*;


// In this program the dates are input as string and their format is to be changed...
public class Dates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] string = new String[n];
        String ans = "";

        for(int i=0 ; i<n ; i++){
            string[i]=sc.next();
        }

        for(String str:string){



            String europeDate = "";
            String americaDate = "";

            if(str.charAt(1)=='.' || str.charAt(2)=='.'){

                String[] string1 = str.split("\\.");
                String day = string1[0];
                String month = string1[1];
                String year = string1[2];

                if(day.length()==1){
                    day = "0"+day;
                }
                if(month.length()==1){
                    month = "0"+month;
                }
                if(year.length()<4){
                    while(year.length()<4){
                        year = "0"+year;
                    }
                }

                europeDate = day+"."+month+"."+year;
                americaDate = month+"/"+day+"/"+year;
            }

            else if(str.charAt(1)=='/' || str.charAt(2)=='/'){
                String[] string1 = str.split("/");
                String day = string1[1];
                String month = string1[0];
                String year = string1[2];

                if(day.length()==1){
                    day = "0"+day;
                }
                if(month.length()==1){
                    month = "0"+month;
                }
                if(year.length()<4){
                    while(year.length()<4){
                        year = "0"+year;
                    }
                }

                europeDate = day+"."+month+"."+year;
                americaDate = month+"/"+day+"/"+year;
            }

            ans = ans+europeDate+" "+americaDate+" ";
        }
        System.out.println(ans.trim());
    }
}
