// ****************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create, fill,
// sort, and search in a list of integers.
//          
// ****************************************************************

import java.util.Scanner;

public class IntegerList{

    int[] list; //values in the list
    Scanner scan = new Scanner(System.in);

    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
    list = new int[size];
    }


    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
    for (int i=0; i<list.length; i++)
        list[i] = (int)(Math.random() * 100) + 1;
    }

    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
    for (int i=0; i<list.length; i++)
        System.out.println(i + ":\t" + list[i]);
    }

    //-------------------------------------------------------
    //return the index of the first occurrence of target in the list.
    //return -1 if target does not appear in the list
    //-------------------------------------------------------
    public int search(int target)
    {
        boolean targetExist = false;
        int searchIndex = 0;
        int i = 0;
        while(i < list.length - 1 && targetExist != true) {
            if(list[i] == target) {
                targetExist = true;
                searchIndex = i;
            }
            i++;
        }
        if(targetExist) {
            return searchIndex;
        }
        else {
            return -1;
        }
    }

    //-------------------------------------------------------
    //sort the list into ascending order using the selection sort algorithm
    //-------------------------------------------------------
    public void selectionSort()
    {
    for (int i=0; i < list.length-1; i++)
        {
        //find smallest element in list starting at location i
        int index = i;
        for (int j = i + 1; j < list.length; j++) {
            if (list[j] < list[index]) {
                index = j;
            }
        }
        int smallNum = list[index];  
        }
    }
    
    public void replaceFirst(int oldVal, int newVal) {
        //replaces the first occurrence of oldVal in the list with newVal
        list[search(oldVal)] = newVal;
    }
    
    public void replaceAll(int oldVal, int newVal) {
        // replaces all occurrences of oldVal in the list with newVal
        for(int i = 0; i < list.length - 1; i++) {
            if(list[i] == oldVal) {
                list[i] = newVal;
            }
        }
    }
}
