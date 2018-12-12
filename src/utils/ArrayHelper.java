package utils;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by pawelk on 06/11/2018.
 * get min value from array (public T getMinValue(T[] array))
 get max value from array (public T getMaxValue(T[] array))
 find item from array (public bool findItem(T[] array, T item))
 add item to array (public T[] addItem(T[] array, T item))
 remove item from array (public T[] removeItem(T[] array, T item))
 swap items in array. (public T[] swapItems(T[] array, T firstItem, T secondItem))
 todo
 */
public class ArrayHelper {
    // [3,2,1] 5 => [3,2,1,5]
    public Integer[] addItem(Integer[] oldArray, Integer newItem) {
        Integer[] newArray = new Integer[oldArray.length + 1];

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length-1] = newItem;

        return newArray;
    }

    public Integer getMinValue(int[] array) {
        int min = Integer.MAX_VALUE;

        if (array.length == 0) {
            return null;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public Integer getMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;

        if (array.length == 0) {
            return null;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public boolean findItem(int[] array, int item) {
        for (int element:array) {
            if (element==item){
                return true;
            }
        }
        return false;
    }

    public Integer[] removeItem(Integer[] oldArray, Integer removeItem) {

        if (oldArray.length == 0) {
            return null;
        }
        int i = 0;
        for (int element:oldArray){
            if(element!=removeItem){
                i++;
            }
        }
        if(i==oldArray.length){
            return oldArray;
        }
        Integer[] newArray = new Integer[oldArray.length - 1];
        int j =0;
        for (int element:oldArray) {
            if (element!=removeItem) {
                newArray[j] = element;
                j++;
            }
        }
        return newArray;
    }

    public Integer[] swapItem(Integer[] oldArray, Integer swapItem, Integer newItem) {

        if (oldArray.length == 0) {
            return null;
        }
        int i = 0;
        for (int element:oldArray){
            if(element!=swapItem){
                i++;
            }
        }
        if(i==oldArray.length){
            return oldArray;
        }
        Integer[] newArray = new Integer[oldArray.length];

        for (int j = 0; j <oldArray.length ; j++) {
            if (oldArray[j]==swapItem) {
                newArray[j] = newItem;
            }
            else {
                newArray[j] = oldArray[j];
            }
        }
        return newArray;
    }
}
