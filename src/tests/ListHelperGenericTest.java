package tests;

import models.User;
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

    /*
        findItem
        1. when list is empty then return false
        2. when list is not empty and element exists return true
        3. when list is not empty and element does not exist return false
    */
    @Test public void findItem_WhenListIsEmpty_ThenReturnFalse(){
        //Arrange
        ListHelperGeneric<User> listHelper = new ListHelperGeneric<>();
        ArrayList<User> userList = new ArrayList<>();
        User inputItem = new User("a@b.c","a","b",true,true,true,true,"876","ad");
        boolean expectedValue = false;

        //Act
        boolean result = listHelper.findItem(userList,inputItem);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test public void findItem_WhenListIsNotEmptyAndItemIsNotPresent_ThenReturnFalse(){
        //Arrange
        ListHelperGeneric<User> listHelper = new ListHelperGeneric<>();

        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("a1@b.c","a","b",true,true,true,true,"876","ad"));
        userList.add(new User("a2@b.c","a","b",true,true,true,true,"876","ad"));

        User inputItem = new User("a@b.c","a","b",true,true,true,true,"876","ad");

        boolean expectedValue = false;

        //Act
        boolean result = listHelper.findItem(userList,inputItem);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test public void findItem_WhenListIsNotEmptyAndItemIsPresent_ThenReturnTrue(){
        //Arrange
        ListHelperGeneric<User> listHelper = new ListHelperGeneric<>();

        User inputItem = new User("0","a","b",true,true,true,true,"876","ad");

        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("0","a","b",true,true,true,true,"876","ad"));
        userList.add(new User("a2@b.c","a","b",true,true,true,true,"876","ad"));

        boolean expectedValue = true;

        //Act
        boolean result = listHelper.findItem(userList,inputItem);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    /*
        addItem
        1. when list is empty return list with length = 1 and with item at 0 position
        2. when list is not empty return list with length = length+1 and item at last position
    */
    @Test public void addItem_WhenListIsEmpty_ThenReturnListWithItemAtLastPosition(){
        //Arrange
        ListHelperGeneric<User> listHelper = new ListHelperGeneric<>();
        ArrayList<User> userList = new ArrayList<>(0);
        User inputItem = new User("0","a","b",true,true,true,true,"876","ad");
        int expectedLength = 1;
        User expectedItem = new User("0","a","b",true,true,true,true,"876","ad");

        //Act
        ArrayList<User> resultList = listHelper.addItem(userList,inputItem);

        //Assert
        Assertions.assertEquals(expectedLength,resultList.size());
        Assertions.assertEquals(expectedItem,resultList.get(0));
    }

    @Test public void addItem_WhenListIsNotEmpty_ThenReturnListWithItemAtLastPosition(){
        //Arrange
        ListHelperGeneric<User> listHelper = new ListHelperGeneric<>();
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("a2@b.c","a","b",true,true,true,true,"876","ad"));
        userList.add(new User("adf2@b.c","asdf","bsdf",true,true,true,true,"876","ad"));

        User inputItem = new User("111","1","1",true,true,true,true,"876","ad");
        int expectedLength = 3;
        User expectedItem = new User("111","1","1",true,true,true,true,"876","ad");

        //Act
        ArrayList<User> resultList = listHelper.addItem(userList,inputItem);

        //Assert
        Assertions.assertEquals(expectedLength,resultList.size());
        Assertions.assertEquals(expectedItem,resultList.get(resultList.size()-1));
    }

    /*
        removeItem
        1. when item is not present in list then return the same list
        2. when item is present in list, remove item and return list smaller by one
        3. when list is empty then return null
    */
    @Test public void removeItem_WhenItemIsNotInTheList_ThenReturnTheSameList(){
        //Arrange
        ListHelperGeneric<User> listHelper = new ListHelperGeneric<>();
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("a2@b.c","a","b",true,true,true,true,"876","ad"));
        userList.add(new User("adf2@b.c","asdf","bsdf",true,true,true,true,"876","ad"));
        int expectedLength = 2;
        User itemToBeRemoved = new User("222","asdf","bsdf",true,true,true,true,"876","ad");

        //Act
        ArrayList<User> resultList = listHelper.removeItem(userList,itemToBeRemoved);

        //Assert
        Assertions.assertEquals(expectedLength,resultList.size());
        for (int i = 0; i < userList.size(); i++){
            Assertions.assertEquals(userList.get(i),resultList.get(i));
        }
    }

    @Test public void removeItem_WhenItemIsInTheList_ThenRemoveItemAndReturnSmallerList(){
        //Arrange
        ListHelperGeneric<User> listHelper = new ListHelperGeneric<>();
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("a2@b.c","a","b",true,true,true,true,"876","ad"));
        userList.add(new User("222","asdf","bsdf",true,true,true,true,"876","ad"));
        userList.add(new User("adf2@b.c","asdf","bsdf",true,true,true,true,"876","ad"));

        User itemToBeRemoved = new User("222","asdf","bsdf",true,true,true,true,"876","ad");

        int expectedLength = 2;
        User zeroIndexResult = new User("a2@b.c","a","b",true,true,true,true,"876","ad");
        User firstIndexResult = new User("adf2@b.c","asdf","bsdf",true,true,true,true,"876","ad");

        //Act
        ArrayList<User> resultList = listHelper.removeItem(userList,itemToBeRemoved);

        //Assert
        Assertions.assertEquals(expectedLength,resultList.size());
        Assertions.assertEquals(zeroIndexResult,resultList.get(0));
        Assertions.assertEquals(firstIndexResult,resultList.get(1));
    }

    @Test public void removeItem_WhenListIsEmpty_ThenReturnNull(){
        //Arrange
        ListHelperGeneric<User> listHelper = new ListHelperGeneric<>();
        ArrayList<User> userList = new ArrayList<>();
        User itemToBeRemoved = new User("222","asdf","bsdf",true,true,true,true,"876","ad");
        ArrayList<User> expectedResult = null;

        //Act
        ArrayList<User> resultList = listHelper.removeItem(userList,itemToBeRemoved);

        //Assert
        Assertions.assertEquals(expectedResult,resultList);
    }

    /*
        swapItems
        1. When list is empty Then return NULL
        2. When list is not empty and both items are present Then return list with swapped items
        3. When list is not empty and first item is not present Then return original list
        4. When list is not empty and second item is not present Then return original list
    */
    @Test public void swapItems_WhenListIsEmpty_ThenReturnNull(){
        //Arrange
        ListHelperGeneric<User> listHelper = new ListHelperGeneric<>();
        ArrayList<User> userList = new ArrayList<>();
        User firstItemToBeSwapped = new User("222","asdf","bsdf",true,true,true,true,"876","ad");
        User secondItemToBeSwapped = new User("111","111","111",true,true,true,true,"876","ad");
        ArrayList<User> expectedResult = null;

        //Act
        ArrayList<User> resultList = listHelper.swapItems(userList,firstItemToBeSwapped,secondItemToBeSwapped);

        //Assert
        Assertions.assertEquals(expectedResult,resultList);
    }

    @Test
    public void swapItems_WhenListIsNotEmptyAndBothItemsArePresent_ThenReturnListWithSwappedItems(){
        //Arrange
        ListHelperGeneric<User> listHelper = new ListHelperGeneric<>();
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("222","222","222",true,true,true,true,"876","ad"));
        userList.add(new User("111","111","111",true,true,true,true,"876","ad"));
        userList.add(new User("333","333","333",true,true,true,true,"876","ad"));

        User firstItemToBeSwapped = new User("222","222","222",true,true,true,true,"876","ad");
        User secondItemToBeSwapped = new User("333","333","333",true,true,true,true,"876","ad");

        //Act
        ArrayList<User> resultList = listHelper.swapItems(userList,firstItemToBeSwapped,secondItemToBeSwapped);

        //Assert
        Assertions.assertEquals(firstItemToBeSwapped,resultList.get(2));
        Assertions.assertEquals(secondItemToBeSwapped,resultList.get(0));
    }

    @Test
    public void swapItems_WhenListIsNotEmptyAndFirstItemIsNotPresent_ThenReturnOriginalList(){
        //Arrange
        ListHelperGeneric<User> listHelper = new ListHelperGeneric<>();
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("111","111","111",true,true,true,true,"876","ad"));
        userList.add(new User("444","444","444",true,true,true,true,"876","ad"));
        userList.add(new User("333","333","333",true,true,true,true,"876","ad"));

        User firstItemToBeSwapped = new User("222","222","222",true,true,true,true,"876","ad");
        User secondItemToBeSwapped = new User("333","333","333",true,true,true,true,"876","ad");

        User firstResultItem = new User("111","111","111",true,true,true,true,"876","ad");
        User secondResultItem = new User("444","444","444",true,true,true,true,"876","ad");
        User thirdResultItem = new User("333","333","333",true,true,true,true,"876","ad");

        //Act
        ArrayList<User> resultList = listHelper.swapItems(userList,firstItemToBeSwapped,secondItemToBeSwapped);

        //Assert
        Assertions.assertEquals(firstResultItem,resultList.get(0));
        Assertions.assertEquals(secondResultItem,resultList.get(1));
        Assertions.assertEquals(thirdResultItem,resultList.get(2));
    }

    @Test
    public void swapItems_WhenListIsNotEmptyAndSecondItemIsNotPresent_ThenReturnOriginalList(){
        //Arrange
        ListHelperGeneric<User> listHelper = new ListHelperGeneric<>();
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("111","111","111",true,true,true,true,"876","ad"));
        userList.add(new User("222","222","222",true,true,true,true,"876","ad"));
        userList.add(new User("555","555","555",true,true,true,true,"876","ad"));

        User firstItemToBeSwapped = new User("222","222","222",true,true,true,true,"876","ad");
        User secondItemToBeSwapped = new User("333","333","333",true,true,true,true,"876","ad");

        User firstResultItem = new User("111","111","111",true,true,true,true,"876","ad");
        User secondResultItem = new User("222","222","222",true,true,true,true,"876","ad");
        User thirdResultItem = new User("555","555","555",true,true,true,true,"876","ad");

        //Act
        ArrayList<User> resultList = listHelper.swapItems(userList,firstItemToBeSwapped,secondItemToBeSwapped);

        //Assert
        Assertions.assertEquals(firstResultItem,resultList.get(0));
        Assertions.assertEquals(secondResultItem,resultList.get(1));
        Assertions.assertEquals(thirdResultItem,resultList.get(2));
    }
}
