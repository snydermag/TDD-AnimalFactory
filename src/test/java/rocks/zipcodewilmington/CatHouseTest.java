package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    @Test
    public void addTest(){
        // Given
        String name = "Zula";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(1, actual);
    }

    @Test
    public void removeIdTest(){
        // Given
        String name = "Zula";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        CatHouse.remove(animal.getId());

        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(0, actual);
    }

    @Test
    public void removeCatTest(){
        // Given
        String name = "Zula";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        CatHouse.remove(animal);

        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(0, actual);
    }

    @Test
    public void getCatTest(){
        // Given
        String name = "Zula";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        Cat cat = CatHouse.getCatById(animal.getId());

        Assert.assertEquals(cat, animal);
    }

    @Test
    public void testGetNumberOfCats() {
        // Given (some
        String name = "Zula";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(1, actual);
    }
}
