package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void factoryDogTest() {
        //Given
        String givenName = "Milo";
        Date birthDate = new Date();
        //When
        Dog newDog = AnimalFactory.createDog(givenName,birthDate);
        //Then
        Assert.assertEquals("Milo", newDog.getName());
        Assert.assertEquals(birthDate, newDog.getBirthDate());

    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    














}
//Create Test for Animal createDog(String name, Date birthDate)
//ensure that when .createDog is invoked on AnimalFactoryTest a Dog is created with the respective name and birthDate value.
//Create Test for Animal createCat(String name, Date birthDate)
//ensure that when .createCat is invoked on AnimalFactoryTest a Dog is created with the respective name and birthDate value.