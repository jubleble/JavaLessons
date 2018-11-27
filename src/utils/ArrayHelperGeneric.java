package utils;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by pawelk on 20/11/2018.
 *  *get min value from array (public T getMinValue(T[] array))
     get max value from array (public T getMaxValue(T[] array))
     find item from array (public bool findItem(T[] array, T item))
     add item to array (public T[] addItem(T[] array, T item))
     remove item from array (public T[] removeItem(T[] array, T item))
     swap items in array. (public T[] swapItems(T[] array, T firstItem, T secondItem))
 */
public class ArrayHelperGeneric<T> {
    public ArrayHelperGeneric(){
    }
    // https://stackoverflow.com/questions/529085/how-to-create-a-generic-array-in-java
    public T[] addItem(T[] oldArray, T newItem) {
        T[] newArray = Arrays.copyOf(oldArray, oldArray.length + 1);

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }

        newArray[newArray.length - 1] = newItem;

        return newArray;
    }
}
