package com.company.Arrays;

import java.util.ArrayList;

public class Array {
    private int[] items;
    private int count = 0;
    public Array (int length){
        items = new int[length];
    }

    public void insert(int item){
        resizeIfRequired();
        //else add the new item at the end of the array
        items[count++] = item;
    }

    public void removeAt(int index){
        if (index<0 || index>= count)
            throw new IllegalArgumentException();
        for (int i = index; i< count; i++)
            items[i] = items[i + 1];

        count--;
    }

    public int indexOf(int item){
        for(int i = 0; i<count; i++)
            if (items[i] == item)
                return i;

        return -1;
    }

    public void print(){
        for (int i = 0; i<count; i++)
            System.out.println(items[i]);
    }


    //Exercises ...........
    public int max(){
        //time complexity of this function is O(n)
        if (count < 1)
            throw new ArrayIndexOutOfBoundsException("There is no element in array");
        int max = items[0];
        for (int i = 1; i<count; i++)
            if (items[i] > max)
                max = items[i];

        return max;
    }

    public ArrayList<Integer> intersect(int[] array){

        ArrayList<Integer> intersection = new ArrayList<>();
        for (int j : array)
            if (indexOf(j) != -1)
                intersection.add(j);

        return intersection;
    }

    public void reverse(){
        int[] newArray = new int[count];
        for (int i = 0; i<count; i++)
            newArray[i] = items[count - i -1];

        items = newArray;
    }

    private void resizeIfRequired() {
        if (items.length == count) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;
        }
    }

    public void insertAt(int item, int index) {
        if (index < 0 || index > count)
            throw new IllegalArgumentException();

        for (int i = count - 1; i >= index; i--)
            items[i + 1] = items[i];

        items[index] = item;
        count++;
    }
}
