package uaslp.ingenieria.labs.list;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void WhenaDataisAdded(){
        //Given:
        LinkedList list = new LinkedList();
        //When:

        list.add(200);
        list.add(500);
        list.add(3);
        list.add(40);
        //Asserts:
        assertEquals(4,list.getSize(),"deberia tener 1 dato");

        assertEquals(200,list.get(0));
        assertEquals(500,list.get(1));
        assertEquals(3,list.get(2));
        assertEquals(40,list.get(3));
    }

    @Test
    public void WhenDataisDeleted(){
        LinkedList lista = new LinkedList();

        //When:

        lista.add(4);
        lista.add(700);

        //Asserts
        assertEquals(2,lista.getSize());
        assertEquals(4,lista.get(0));
        assertEquals(700,lista.get(1), "aqui tiene 2 elementos y se borrara el 700");

        lista.delete(1);

        assertEquals(1,lista.getSize());
        assertEquals(4,lista.get(0));

    }

   @Test
   public void RecoverIterator(){
        LinkedList lista = new LinkedList();

        //When:

        lista.add(50);
        lista.add(80);
        lista.add(44);
        lista.add(78);
        lista.add(12);

        //Asserts
        assertEquals(5,lista.getSize());

        Iterador test = lista.getIterador();

        assertTrue(test.hasNext());
        assertEquals(50,test.next());
        assertTrue(test.hasNext());
        assertEquals(80,test.next());
        assertTrue(test.hasNext());
        assertEquals(44,test.next());
        assertTrue(test.hasNext());
        assertEquals(78,test.next());
        assertTrue(test.hasNext());
        assertEquals(12,test.next());
        assertFalse(test.hasNext());
    }

    @Test
    public void WhenDataisInserted(){
        LinkedList lista = new LinkedList();

        //When:

        lista.add(4);
        lista.add(10);
        lista.add(800);
        lista.add(900);

        //Asserts
        assertEquals(4,lista.getSize());

        Iterador it =  lista.getIterador();

        lista.insert(700,LinkedList.AFTER, it);

        assertEquals(5,lista.getSize());
        assertEquals(700,lista.get(1),"el dato que se intserto en la posición 1 es 700 ");
        assertEquals(900,lista.get(4),"se recorrio el arreglo por lo que el ultimo dato deberia ser 900 ");
    }

    @Test
    public void GettingReverseIteratorfrom5elementsList(){
        LinkedList list = new LinkedList();

        //When:

        list.add(50);
        list.add(80);
        list.add(44);
        list.add(78);
        list.add(12);

        //Asserts
        assertEquals(5,list.getSize());
        ReverseIterator it  = list.getReverseIterator();

        assertTrue( it.hasNext() );
        assertEquals(12,it.next());
        assertTrue(it.hasNext());
        assertEquals(78,it.next());
        assertTrue(it.hasNext());
        assertEquals(44,it.next());
        assertTrue(it.hasNext());
        assertEquals(80,it.next());
        assertTrue(it.hasNext());
        assertEquals(50,it.next());
        assertFalse(it.hasNext());
    }

}
