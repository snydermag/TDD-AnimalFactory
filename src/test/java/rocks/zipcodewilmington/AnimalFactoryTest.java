package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Cat;
import java.util.Date;



/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    @Test
    public void createDogTest(){
        String name = "Milo";
        Date date = new Date(2021, 12, 20);

        Dog dog = AnimalFactory.createDog(name, date);

        Assert.assertTrue(dog instanceof Animal);

    }

    @Test
    public void createCatTest(){
        String name = "Zula";
        Date date = new Date(2022, 3, 1);

        Cat cat = AnimalFactory.createCat(name, date);

        Assert.assertTrue(cat instanceof Animal);

    }
}
