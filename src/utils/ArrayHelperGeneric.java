package utils;

import java.util.Arrays;
/**
 * Created by pawelk on 06/11/2018.
 get min value from array (public T getMinValue(T[] array))
 get max value from array (public T getMaxValue(T[] array))
 IMPLEMENTED find item from array (public bool findItem(T[] array, T item))
 IMPLEMENTED add item to array (public T[] addItem(T[] array, T item))
 IMPLEMENTED remove item from array (public T[] removeItem(T[] array, T item))
 IMPLEMENTED swap items in array. (public T[] swapItems(T[] array, T firstItem, T secondItem))
 
 */
public class ArrayHelperGeneric<T> {
    public ArrayHelperGeneric(){}
    public boolean findItem(T[] array, T item) {
        for (T element:array) {
            if (element==item){
                return true;
            }
        }
        return false;
    }

    public T[] removeItem(T[] oldArray, T removeItem) {

        if (oldArray.length == 0) {
            return null;
        }
        int i = 0;
        for (T element:oldArray){
            if(element!=removeItem){
                i++;
            }
        }
        if(i==oldArray.length){
            return oldArray;
        }
        T[] newArray = Arrays.copyOf(oldArray,oldArray.length - 1);
        int j =0;
        for (T element:oldArray) {
            if (element!=removeItem) {
                newArray[j] =element;
                j++;
            }
        }
        return newArray;
    }

    public T[] swapItem(T[] oldArray, T swapItem, T newItem) {

        if (oldArray.length == 0) {
            return null;
        }
        int i = 0;
        for (T element:oldArray){
            if(element!=swapItem){
                i++;
            }
        }
        if(i==oldArray.length){
            return oldArray;
        }
        T[] newArray = Arrays.copyOf(oldArray,oldArray.length);

        for (int j = 0; j <oldArray.length ; j++) {
            if (oldArray[j]==swapItem) {
                newArray[j] =newItem;
            }
            else {
                newArray[j] = oldArray[j];
            }
        }
        return newArray;
    }
}
