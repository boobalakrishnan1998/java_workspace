package com.myproject;

import java.util.Scanner;

// Java program to print a new line in string
class Test
{
    // Main Driver Code
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int arrayLen =sc.nextInt();
        if(arrayLen<=0){
         System.out.println("Please Enter the valid number");
         return;
        }
        Integer[] array=new Integer[arrayLen];
        for (int i = 0; i< arrayLen; i++){
            array[i]=sc.nextInt();
        }
        //Arrays.stream(array).sorted().forEach(System.out::println);
        /*Arrays.sort(array);
        Arrays.sort(array, Collections.reverseOrder());*/

       Integer[] sortedarray=NormalSortedarray(array);
        for (Integer temparray : sortedarray) {
            System.out.println(temparray);
        }
    }

    private static Integer[] NormalSortedarray(Integer[] array) {
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                int temp;
                if(array[i]>array[j]){
                    array[i]=array[i]+array[j];
                    array[j]=array[i]-array[j];
                    array[i]=array[i]-array[j];
                    /*temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;*/
                }
            }
        }
        return array;
    }




}
