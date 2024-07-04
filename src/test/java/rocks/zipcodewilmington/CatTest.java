package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {







    //////////////////////////////////////////////////////////////
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest(){
        //Given
        Cat cat = new Cat (null,null,null);
        String givenName = "Frisky";
        // When
        cat.setName(givenName);
        //Then
        String catName = cat.getName();
        Assert.assertEquals(catName,givenName);
    }
    // TODO - Create tests for `speak`
   @Test
    public void catSpeakTest() {
        //Given
        Cat cat = new Cat(null, null, null);
        // When
        String whatTheCatSay = cat.speak();
        //Then
        Assert.assertEquals(whatTheCatSay, "meow!");
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        //Given
        Cat cat = new Cat(null, null, null);
        Date givenBirthDate = new Date();
        // When
        cat.setBirthDate(givenBirthDate);
        //Then
        Assert.assertEquals(givenBirthDate,cat.getBirthDate());
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatFoodTest() {
        //Given
        Cat cat = new Cat(null, null, null);
        Food catFood = new Food();
        // When
        cat.eat(catFood);
        //Then
        Assert.assertEquals((int) cat.getNumberOfMealsEaten(),1);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetID() {
        //Given
        Cat cat = new Cat(null, null, null);
        Integer givenId = (null);
        // When
        Integer actualId = cat.getId();
        //Then
        Assert.assertEquals(actualId,givenId);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInherit() {
        //Given
        Cat cat = new Cat(null, null, null);

        // When

        //Then
        Assert.assertTrue(cat instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInherit() {
        //Given
        Cat cat = new Cat(null, null, null);

        // When

        //Then
        Assert.assertTrue(cat instanceof Mammal);
    }







































    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
