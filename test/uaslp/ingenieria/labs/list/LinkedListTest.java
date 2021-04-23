package uaslp.ingenieria.labs.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
    //Given_When_Then

    @Test
    public void WhenAnewListCreated_ThenListIsEmpty(){
        //Given:

        //When:
        LinkedList lista = new LinkedList();


        //Then:

        //Asserts
        assertEquals(0, lista.getSize());





    }

}
