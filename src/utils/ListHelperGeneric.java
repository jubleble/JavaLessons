package utils;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by gandwhite on 05/12/2018.
 *  IMPLEMENTED get min value from list (public T getMinValue(T[] arraylist))
 *  IMPLEMENTED get max value from list (public T getMaxValue(T[] arraylist))
 *  IMPLEMENTED find item from list (public bool findItem(T[] arraylist, T item))
 *  IMPLEMENTED add item to list (public T[] addItem(T[] arraylist, T item))
 *  IMPLEMENTED remove item from list (public T[] removeItem(T[] arraylist, T item))
 *  IMPLEMENTED swap items in list (public T[] swapItems(T[] arraylist, T firstItem, T secondItem))
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

    public boolean findItem(ArrayList<T> arrayList, T item){
        return arrayList.contains(item);
    }

    public ArrayList<T> addItem(ArrayList<T> arrayList, T item){
        arrayList.add(item);
        return arrayList;
    }

    public ArrayList<T> removeItem(ArrayList<T> arrayList, T item){
        if(arrayList.isEmpty()) {
            return null;
        }
        if(!arrayList.contains(item)) {
            return arrayList;
        }
        arrayList.remove(item);
        return arrayList;
    }

    public ArrayList<T> swapItems(ArrayList<T> arrayList, T firstItem, T secondItem){
        if(arrayList.isEmpty()){
            return null;
        }
        if(!arrayList.contains(firstItem)){
            return arrayList;
        }
        if(!arrayList.contains(secondItem)){
            return arrayList;
        }

        int firstItemIndex = arrayList.indexOf(firstItem);
        int secondItemIndex = arrayList.indexOf(secondItem);

        //T temp = firstItem;
        T temp = arrayList.get(arrayList.indexOf(firstItem));
        arrayList.set(firstItemIndex,secondItem);
        arrayList.set(secondItemIndex,temp);

        return arrayList;
    }
}
