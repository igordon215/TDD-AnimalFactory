package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {





    ///////////////////////////////////////////////////////////
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest(){
        //Given
        String newName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 17;
        Dog dog = new Dog(newName,givenBirthDate,givenId);
        DogHouse.clear();
        //Then
        DogHouse.add(dog);
        //When
        Assert.assertEquals(1,(long)DogHouse.getNumberOfDogs());
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeDogIdTest(){
        //Given
        String newName = "Milo";
        Date givenBirthdate = new Date();
        Integer givenId = 17;
        Dog dog = new Dog(newName, givenBirthdate, givenId);
        DogHouse.clear();
        //When
        DogHouse.add(dog);
        DogHouse.remove(17);
        //Then
        Assert.assertEquals(0, (long)DogHouse.getNumberOfDogs());
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public  void removeDogTest(){
        //Given
        String newName = "Milo";
        Date givenBirthdate = new Date();
        Integer givenId = 17;
        Dog dog = new Dog(newName, givenBirthdate, givenId);
        DogHouse.clear();
        //Then
        DogHouse.add(dog);
        DogHouse.remove(dog);
        //When
        Assert.assertEquals(0,(long)DogHouse.getNumberOfDogs());
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void dogByIDTest(){
        //Given
        String newName = "Milo";
        Date givenBirthdate = new Date();
        Integer givenId = 17;
        Dog dog = new Dog(newName, givenBirthdate, givenId);
        DogHouse.clear();
        //Then
        DogHouse.add(dog);
        //When
        Assert.assertEquals(dog,DogHouse.getDogById(17));
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public  void numberOfDogsTest(){
        //Given
        String newName = "Milo";
        Date givenBirthdate = new Date();
        Integer givenId = 17;
        Dog dog = new Dog(newName, givenBirthdate, givenId);
        DogHouse.clear();
        //Then
        DogHouse.add(dog);
        //When
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
