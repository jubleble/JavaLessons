package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.ListHelperGeneric;

import java.util.ArrayList;

public class ListHelperGenericTest {
    /*
        getMinValue
        1. when arrayList is empty return NULL
        2. when arrayList is not empty return min value
     */
    @Test public void getMinValue_WhenArrayListIsEmpty_ThenReturnNull(){
        //Arrange
        ListHelperGeneric<Integer> listHelperGeneric = new ListHelperGeneric<>();
        ArrayList<Integer> emptyList = new ArrayList<>();
        Integer expectedValue = null;

        //Act
        Integer resultValue = listHelperGeneric.getMinValue(emptyList);

        //Assert
        Assertions.assertEquals(expectedValue,resultValue);
    }

    @Test public void getMinValue_WhenArrayListIsNotEmpty_ThenReturnMinValue(){
        //Arrange
        ListHelperGeneric<String> listHelperGeneric = new ListHelperGeneric<>();
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("abc");
        stringList.add("bcd");
        stringList.add("aaa");
        String expectedValue = "aaa";

        //Act
        String resultValue = listHelperGeneric.getMinValue(stringList);

        //Assert
        Assertions.assertEquals(expectedValue,resultValue);
    }

    /*
        getMaxValue
        1. when arrayList is empty return NULL
        2. when arrayList is not empty return max value
     */
    @Test public void getMaxValue_WhenArrayListIsEmpty_ThenReturnNull(){
        //Arrange
        ListHelperGeneric<Integer> listHelperGeneric = new ListHelperGeneric<>();
        ArrayList<Integer> emptyList = new ArrayList<>();
        Integer expectedValue = null;

        //Act
        Integer resultValue = listHelperGeneric.getMaxValue(emptyList);

        //Assert
        Assertions.assertEquals(expectedValue,resultValue);
    }

    @Test public void getMaxValue_WhenArrayListIsNotEmpty_ThenReturnMaxValue(){
        //Arrange
        ListHelperGeneric<Integer> listHelperGeneric = new ListHelperGeneric<>();
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(-123);
        integerList.add(-555);
        integerList.add(-50);
        Integer expectedValue = -50;

        //Act
        Integer resultValue = listHelperGeneric.getMaxValue(integerList);

        //Assert
        Assertions.assertEquals(expectedValue,resultValue);
    }

}
