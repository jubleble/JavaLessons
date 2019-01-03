package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.ArrayHelper;

/**
 * Created by pawelk on 06/11/2018.
 */
public class ArrayHelperTest {

    @Test
    public void getMinValue_WhenArrayIsEmpty_ThenReturnNull() {
        // Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        int[] array = new int[0];
        Integer expectedValue = null;

        // Act
        Integer result = arrayHelper.getMinValue(array);

        // Assert
        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void getMinValue_WhenArrayIsNotEmpty_ThenReturnMinValue() {
        // Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        int[] array = new int[3];
        Integer expectedValue = new Integer(10);
        array[0] = expectedValue;
        array[1] = expectedValue + 2;
        array[2] = expectedValue + 10;


        // Act
        Integer result = arrayHelper.getMinValue(array);

        // Assert
        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void findItem_WhenArrayIsEmpty_ThenReturnFalse() {
        // Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[0];
        int itemToFind = 10;
        boolean expectedValue = false;

        // Act
        boolean result = arrayHelper.findItem(array, itemToFind);

        // Assert
        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void findItem_WhenArrayIsNotEmptyAndElementDoesntExistInArray_ThenReturnFalse() {
        // Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[3];
        int itemToFind = 10;
        array[0] = itemToFind + 1;
        array[1] = itemToFind + 2;
        array[2] = itemToFind + 3;
        boolean expectedValue = false;

        // Act
        boolean result = arrayHelper.findItem(array, itemToFind);

        // Assert
        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void findItem_WhenArrayIsNotEmptyAndElementExistsInArray_ThenReturnTrue() {
        // Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[3];
        int itemToFind = 10;
        array[0] = itemToFind + 1;
        array[1] = itemToFind;
        array[2] = itemToFind + 3;
        boolean expectedValue = true;

        // Act
        boolean result = arrayHelper.findItem(array, itemToFind);

        // Assert
        Assertions.assertEquals(expectedValue, result);
    }

    /*
        1. array is empty => new array should contains one element, equal to provide item
        2. array is not empty => new array should contains one additional element, last element in array should be equal to provided item
     */
    @Test
    public void addItem_WhenArrayIsEmpty_ThenShouldReturnArrayWithSingleElement() {
        // Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] emptyArray = new Integer[0];
        Integer newElement = 10;

        // Act
        Integer[] result = arrayHelper.addItem(emptyArray, newElement);

        // Assert
        Assertions.assertEquals(1, result.length);
        Assertions.assertEquals(newElement, result[0]);
    }

    @Test
    public void addItem_WhenArrayIsNotEmpty_ThenShouldContainAdditionalProvidedElement() {
        // Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] nonEmptyArray = new Integer[3];
        nonEmptyArray[0] = 1;
        nonEmptyArray[1] = 2;
        nonEmptyArray[2] = 3;
        Integer newElement = 10;

        // Act
        Integer[] result = arrayHelper.addItem(nonEmptyArray, newElement);

        // Assert
        Assertions.assertEquals(nonEmptyArray.length + 1, result.length);
        Assertions.assertEquals(nonEmptyArray[0], result[0]);
        Assertions.assertEquals(nonEmptyArray[1], result[1]);
        Assertions.assertEquals(nonEmptyArray[2], result[2]);
        Assertions.assertEquals(newElement, result[3]);
    }

    /*
        getMaxValue
        1. When array is empty return null
        2. When array is not empty return max value
     */
    @Test
    public void getMaxValue_WhenArrayIsEmpty_ThenReturnNull() {
        // Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        int[] array = new int[0];
        Integer expectedValue = null;

        // Act
        Integer result = arrayHelper.getMaxValue(array);

        // Assert
        Assertions.assertEquals(result, expectedValue);
    }

    @Test
    public void getMaxValue_WhenArrayIsNotEmpty_ThenReturnMaxValueFromArray() {
        // Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        int[] array = new int[3];
        array[0] = 5;
        array[1] = Integer.MAX_VALUE;
        array[2] = Integer.MIN_VALUE;
        Integer expectedValue = Integer.MAX_VALUE;

        // Act
        Integer result = arrayHelper.getMaxValue(array);

        // Assert
        Assertions.assertEquals(result, expectedValue);
    }

    /*
        removeItem
        1. When array is empty -> return null
        2. When array is not empty and element does not exist -> return the same array
        3. When array is not empty and element exists -> remove item and return array smaller by one
        4. When array is not empty and more than one element exists -> remove items and return array smaller by element number
     */
    @Test
    public void removeItem_WhenArrayIsEmpty_ReturnNull(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[0];
        int item = 666;
        Integer[] expectedValue = null;

        //Act
        Integer[] result = arrayHelper.removeItem(array, item);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void removeItem_WhenArrayIsNotEmptyAndElementDoesNotExist_ReturnTheSameArray(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[6];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;

        int item = 8;

        //Act
        Integer[] result = arrayHelper.removeItem(array, item);

        //Assert
        Assertions.assertEquals(6,result.length);

        for (int param: result){
            Assertions.assertNotEquals(param,item);
        }
    }

    @Test
    public void removeItem_WhenArrayIsNotEmptyAndOneElementExists_RemoveItem(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[6];
        array[0] = 1;
        array[1] = 2;
        array[2] = 6;
        array[3] = 4;
        array[4] = 5;
        array[5] = 3;

        int item = 3;

        //Act
        Integer[] result = arrayHelper.removeItem(array, item);

        //Assert
        Assertions.assertEquals(5,result.length);

        for (int param: result){
            Assertions.assertNotEquals(param,item);
        }
    }

    @Test
    public void removeItem_WhenArrayIsNotEmptyAndMoreThanOneElementExist_RemoveItems(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[6];
        array[0] = 1;
        array[1] = 3;
        array[2] = 3;
        array[3] = 3;
        array[4] = 3;
        array[5] = 6;

        int item = 3;

        //Act
        Integer[] result = arrayHelper.removeItem(array, item);

        //Assert
        Assertions.assertEquals(2,result.length);

        for (int param: result){
            Assertions.assertNotEquals(param,item);
        }
    }

    /*
        removeItem
        1. When array is empty -> return null
        2. When array is not empty and first element does not exist -> return the same array
        3. When array is not empty and second element does not exist -> return the same array
        4. When array is not empty and both elements exist -> swap items
    */

    @Test
    public void swapItems_WhenArrayIsEmpty_ReturnNull(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[0];
        int firstItem = 1;
        int secondItem = 2;
        Integer[] expectedValue = null;

        //Act
        Integer[] result = arrayHelper.swapItems(array, firstItem, secondItem );

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void swapItems_WhenArrayIsNotEmptyAndFirstItemDoesNotExist_ReturnTheSameArray(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[3];
        array[0] = 3;
        array[1] = 4;
        array[2] = 5;
        int firstItem = 1;
        int secondItem = 3;

        //Act
        Integer[] result = arrayHelper.swapItems(array, firstItem, secondItem );

        //Assert
        Assertions.assertEquals(array[0],result[0]);
        Assertions.assertEquals(array[1],result[1]);
        Assertions.assertEquals(array[2],result[2]);
    }

    @Test
    public void swapItems_WhenArrayIsNotEmptyAndSecondItemDoesNotExist_ReturnTheSameArray(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[3];
        array[0] = 3;
        array[1] = 4;
        array[2] = 5;
        int firstItem = 3;
        int secondItem = 2;

        //Act
        Integer[] result = arrayHelper.swapItems(array, firstItem, secondItem );

        //Assert
        Assertions.assertEquals(array[0],result[0]);
        Assertions.assertEquals(array[1],result[1]);
        Assertions.assertEquals(array[2],result[2]);
    }

    @Test
    public void swapItems_WhenArrayIsNotEmptyAndBothItemsExist_SwapItems(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[5];
        array[0] = 6;
        array[1] = 4;
        array[2] = -100;
        array[3] = 3;
        array[4] = 2;
        int firstItem = -100;
        int secondItem = 6;

        //Act
        Integer[] result = arrayHelper.swapItems(array, firstItem, secondItem );

        //Assert
        Assertions.assertEquals((Integer)(-100),result[0]);
        Assertions.assertEquals((Integer)4,result[1]);
        Assertions.assertEquals((Integer)6,result[2]);
        Assertions.assertEquals((Integer)3,result[3]);
        Assertions.assertEquals((Integer)2,result[4]);
    }
}
