import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Funkcijos add iskvietimas

        System.out.println("Add funkcija");
        int[] nums = new int[0];
        nums = add(nums, 7);
        nums = add(nums, 16);
        nums = add(nums, 32);
        nums = add(nums, 16);


        printArr(nums);

        System.out.println("Remove funkcija");


        nums = remove(nums, 2); // istrinam elementa, kurio indeksas skliaustuose

        printArr(nums);

             
        }





        //===========End of code ==============
    }

    // Funkcija, kuri padidina masyvo vietu skaiciu

    public static int[] add (int[] arr, int num){
    int[] arrResult = new int[arr.length +1];
        for (int i = 0; i < arr.length; i++) {
            arrResult[i] = arr[i];
        }
        arrResult[arr.length] = num;
        return arrResult;
        }
    // Funkcija, kuri sumazina masyvo vietu skaiciu (istrina indekse esanti elementa)

    public static int[] remove (int[] arr, int index){
        if (arr.length<1){
            return arr;
        }
         int[] arrResult = new int[arr.length - 1];// 0,1,2
        int back = 0;
        for (int i = 0; i < arr.length; i++) {// 0,1.2,3
            if (i== index) {
                back++;
                continue;
            }
            arrResult[i - back] = arr[i]; // arrResult [ 3-1]= arr [3]
        }
           return arrResult;
    }

    // Funkcija kuri spausdina masyva

    public static void printArr (int[] arr){
        String row = "";
        for (int i = 0; i < arr.length; i++) {
            row+= arr[i] + ", ";
            System.out.println(row);
        }
     }





    //==== End of file ==========
}