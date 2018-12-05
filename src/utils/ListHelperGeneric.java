package utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by gandwhite on 05/12/2018.
 * todo
 *  IMPLEMENTED get min value from list (public T getMinValue(T[] arraylist))
 *  IMPLEMENTED get max value from list (public T getMaxValue(T[] arraylist))
 *  find item from list (public bool findItem(T[] arraylist, T item))
 *  add item to list (public T[] addItem(T[] arraylist, T item))
 *  remove item from list (public T[] removeItem(T[] arraylist, T item))
 *  swap items in list (public T[] swapItems(T[] arraylist, T firstItem, T secondItem))
 */

public class ListHelperGeneric<T>{

    public <T extends Comparable<T>> T getMinValue(ArrayList<T> arrayList){

        if(arrayList.isEmpty())
            return null;

        T temp = arrayList.get(0);
        Iterator<T> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            T next = iterator.next();
            if(next.compareTo(temp) < 0)
                temp = next;
        }
        return temp;
    }

    public <T extends Comparable<T>> T getMaxValue(ArrayList<T> arrayList){

        if(arrayList.isEmpty())
            return null;

        T temp = arrayList.get(0);
        Iterator<T> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            T next = iterator.next();
            if(next.compareTo(temp) > 0)
                temp = next;
        }
        return temp;
    }
}
