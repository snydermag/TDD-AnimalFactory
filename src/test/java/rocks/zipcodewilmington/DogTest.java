package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

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

    @Test
    public void setName(){
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        dog.setName("Jumba");

        String expected = "Jumba";

        Assert.assertEquals(expected, dog.getName());
    }

    @Test
    public void speakTest(){
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        String expected = "bark!";

        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void birthDateTest() {
        // Given (dog data)
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        Date newBirthDate = new Date();

        dog.setBirthDate(newBirthDate);

        Assert.assertEquals(newBirthDate, dog.getBirthDate());
    }

    @Test
    public void eatFoodTest(){
        // Given (dog data)
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        Food food1 = new Food();

        dog.eat(food1);

        int actual = dog.getNumberOfMealsEaten();

        Assert.assertEquals(1, actual);
    }

    @Test
    public void getIdTest(){
        // Given (dog data)
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        int actual = dog.getId();

        Assert.assertEquals(0, actual);
    }

    @Test
    public void animalTest(){
        // Given (dog data)
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void mammalTest(){
        // Given (dog data)
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertTrue(dog instanceof Mammal);
    }
}
