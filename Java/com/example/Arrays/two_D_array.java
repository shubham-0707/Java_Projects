package com.example.Arrays;
import java.util.*;

public class two_D_array {
    public static void insert(int[][] arr , int row , int col){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements : ");
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void display(int[][] arr , int row , int col)
    {
        System.out.println("The elements are ...");
        for(int i=0 ;i<row ; i++){
            for(int j=0 ; j<col ; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println(" ");
        }
    }

    public static void update(int[][] arr){
        int row , col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row : ");
        row = sc.nextInt();
        System.out.println("Enter the col : ");
        col = sc.nextInt();

        int key;
        System.out.println("Enter the key : ");
        key = sc.nextInt();

        arr[row][col]=key;

    }

    public static void updated_display(int[][] arr , int row  , int col){
        System.out.println("The updated display is : ");

        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<col ; j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println(" ");
        }
    }





    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row , col;
        System.out.print("Enter the rows : ");
        row = sc.nextInt();
        System.out.print("Enter the columns : ");
        col = sc.nextInt();

        int arr[][] = new int[row][col];
        insert(arr , row , col);
        display(arr , row , col);
        update(arr);
        updated_display(arr , row , col);
    }
}
