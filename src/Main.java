import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* int number=9;
        long factorial=1;
        for(int i=1;i<=number;i++){
            factorial *=i;
        }
        System.out.println("factorial"+number+"is="+factorial);*/
        /*int n=10;
        int a=0,b=1;
        for(int i=1;i<=n;i++) {
            int next = a + b;
            a = b;
            b = next;
            System.out.println(a + " ");
        }*/
        /*prime factor
        int number=17;


        for(int i=2;i<=number;i++){
            while (number%i ==0){
                System.out.println(i);
                number/=i;
            }*/
       /* find the min and max number
        int []array={20,45,23,67,43,2};

        int max=array[0];
        int min=array[0];
        for(int i=0;i< array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
            if (array[i]>max){
                max=array[i];
            }
            }
        System.out.println("minimum value"+min);
        System.out.println("maximum value"+max);*/


        // reverse the number
      /*  int[] array = {1, 2, 3, 4, 5};


        reverseArray(array);
    }

    public static void reverseArray(int[] array) {
        int start =0;
        int end = array.length-1;
        while (start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(array));*/
       /*sort of the array
        int[] array = {1, 5, 3, 7, 4, 9};
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/
        /* occurence of the array
        int array[]= {8,8,8,6,3,7};
        int count=0;
        for(int i:array){
            if(i==8) {
                count++;
            }

        }
        System.out.println(count);*/
    }
}












