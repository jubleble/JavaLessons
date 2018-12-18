package utils;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by pawelk on 06/11/2018.
 *  IMPLEMENTED get min value from array (public T getMinValue(T[] array))
    IMPLEMENTED get max value from array (public T getMaxValue(T[] array))
    IMPLEMENTED find item from array (public bool findItem(T[] array, T item))
    IMPLEMENTED add item to array (public T[] addItem(T[] array, T item))
    IMPLEMENTED remove item from array (public T[] removeItem(T[] array, T item))
    IMPLEMENTED swap items in array. (public T[] swapItems(T[] array, T firstItem, T secondItem))
 */
public class ArrayHelper {
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

    public boolean findItem(Integer[] array, int item) {
        for (int element:array) {
            if (element==item){
                return true;
            }
        }
        return false;
    }

    public Integer getMaxValue(int[] array){
        if(array.length == 0)
            return null;
        int result = Integer.MIN_VALUE;
        for (int param: array) {
            if(param>result)
                result = param;
        }
        return result;
    }

    public Integer[] removeItem(Integer[] array, Integer item){
        if(array.length == 0)
            return null;
        int length = 0;
        for (Integer param: array) {
            if(!param.equals(item)){
                length++;
            }
        }
        Integer[] resultArray = new Integer[length];
        int j = 0;
        for (Integer param: array) {
            if(!param.equals(item)){
                resultArray[j] = param;
                j++;
            }
        }
        return resultArray;
    }

    public Integer[] swapItems(Integer[] array, int firstItem, int secondItem){
        if(array.length == 0)
            return null;
        if(!findItem(array,firstItem)||!findItem(array,secondItem))
            return array; //or NULL??

        int firstItemPosition = 0;
        int secondItemPosition = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i].equals(firstItem))
                firstItemPosition = i;
            if(array[i].equals(secondItem))
                secondItemPosition = i;
        }
        Integer temp;
        temp = array[firstItemPosition];
        array[firstItemPosition] = array[secondItemPosition];
        array[secondItemPosition] = temp;
        return array;
    }

}
