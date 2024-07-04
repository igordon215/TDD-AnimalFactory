package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {






    
    ////////////////////////////////////////////////////////////
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    // TODO - Create tests for `speak`
    @Test
    public void dogSpeak() {
        // Given ()
        Dog dog = new Dog(null, null, null);

        // When ()
        String whatTheDogSay = dog.speak();

        // Then ()
        Assert.assertEquals(whatTheDogSay,"bark!" );
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDate() {
        // Given ()
        Dog dog = new Dog(null, null, null);
        Date givenBirthDate = new Date();

        // When ()
        dog.setBirthDate(givenBirthDate);

        // Then ()
        Assert.assertEquals(givenBirthDate, dog.getBirthDate());
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatFoodTest() {
        // Given ()
        Dog dog = new Dog(null, null, null);
        Food dogFood = new Food();

        // When ()
        dog.eat(dogFood);

        // Then ()
        Assert.assertEquals((int) dog.getNumberOfMealsEaten(), 1);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetID() {
        // Given ()
        Dog dog = new Dog(null, null, null);
        Integer givenID = (null);

        // When ()
        Integer actualId = dog.getId();

        // Then ()
        Assert.assertEquals(actualId,givenID);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInherit() {
        // Given ()
        Dog dog = new Dog(null, null, null);


        // When ()


        // Then ()
        Assert.assertTrue(dog instanceof Animal);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInherit() {
        // Given ()
        Dog dog = new Dog(null, null, null);


        // When ()


        // Then ()
        Assert.assertTrue(dog instanceof Mammal);
    }



}
