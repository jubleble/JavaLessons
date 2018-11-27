package utils;

/**
 * Created by pawelk on 20/11/2018.
 */
public class StringArrayHelper {
    public String[] addItem(String[] oldArray, String newItem) {
        String[] newArray = new String[oldArray.length + 1];

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }

        newArray[newArray.length-1] = newItem;

        return newArray;
    }
}
