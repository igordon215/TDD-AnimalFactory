package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {





    ////////////////////////////////////////////////////////
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest(){
        //Given
        String newName = "Frisky";
        Date givenBirthDate = new Date();
        Integer givenId = 17;
        Cat cat = new Cat(newName,givenBirthDate,givenId);
        CatHouse.clear();
        //Then
        CatHouse.add(cat);
        //When
        Assert.assertEquals(1,(long)CatHouse.getNumberOfCats());
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCatIdTest(){
        //Given
        String newName = "Milo";
        Date givenBirthdate = new Date();
        Integer givenId = 17;
        Cat cat = new Cat(newName, givenBirthdate, givenId);
        CatHouse.clear();
        //When
        CatHouse.add(cat);
        CatHouse.remove(17);
        //Then
        Assert.assertEquals(0, (long)CatHouse.getNumberOfCats());
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public  void removeCatTest(){
        //Given
        String newName = "Milo";
        Date givenBirthdate = new Date();
        Integer givenId = 17;
        Cat cat = new Cat(newName, givenBirthdate, givenId);
        CatHouse.clear();
        //Then
        CatHouse.add(cat);
        CatHouse.remove(cat);
        //When
        Assert.assertEquals(0,(long)CatHouse.getNumberOfCats());
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void catByIDTest(){
        //Given
        String newName = "Milo";
        Date givenBirthdate = new Date();
        Integer givenId = 17;
        Cat cat = new Cat(newName, givenBirthdate, givenId);
        CatHouse.clear();
        //Then
        CatHouse.add(cat);
        //When
        Assert.assertEquals(cat,CatHouse.getCatById(17));
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public  void numberOfCatsTest(){
        //Given
        String newName = "Frisky";
        Date givenBirthdate = new Date();
        Integer givenId = 17;
        Cat cat = new Cat(newName, givenBirthdate, givenId);
        CatHouse.clear();
        //Then
        CatHouse.add(cat);
        //When
        CatHouse.getNumberOfCats();
    }




}
