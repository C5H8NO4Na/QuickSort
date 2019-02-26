package com.company;

public class Main {

    public static int[] quickSort(int[] arr, int pivot, int secondRef){
        if(arr.length<3){
            return arr;
        }
        if(secondRef>arr.length-1){
            secondRef=arr.length-1;
        }
        if(pivot>=arr.length){
            pivot=arr.length-1;
        }
        int firstRef=0;
        if(pivot==arr.length-1){
            secondRef--;
        }

        int temp=0;
        while(firstRef<secondRef){
            boolean thirdCase=true;
            if(arr[firstRef]<arr[pivot]){
                thirdCase=false;
                firstRef++;
            }
            if(arr[secondRef]>arr[pivot]){//
                secondRef--;
            }
            else if(thirdCase){
                temp=arr[firstRef];
                arr[firstRef]=arr[secondRef];
                arr[secondRef]=temp;
            }
        }
        temp=arr[firstRef];
        arr[firstRef]=arr[pivot];
        arr[pivot]=temp;
        if(firstRef-1>-1){//might not need
            quickSort(arr, firstRef-1, firstRef+1);
            //uhhhhhhhhh
        }
        if(firstRef+1<arr.length){//might not need           //uhhhhhhhhhhh?
            quickSort(arr, firstRef+1, arr.length-1);
        }

        return arr;
    }

    public static void main(String[] args) {
	int[] array={42, 53, 12, 74, 97, 46, 126, 98, 95, 1, 34, 3, 6, 32, 23, 89, 24, 93, 87, 65, 59, 82, 63};
	array=quickSort(array, array.length-1,array.length);
	for(int i=0; i<array.length; i++){
        System.out.println(array[i]);
    }
    }
}
