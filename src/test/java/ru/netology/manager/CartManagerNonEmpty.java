package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;
import ru.netology.manager.CartManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartManagerNonEmpty {
    private CartManager manager = new CartManager();
    private FilmItem one = new FilmItem(1, 1, "One Flew Over the Cuckoo's Nest (1975)", 1);
    private FilmItem two = new FilmItem(2, 2, "Two Women (1960)", 1);
    private FilmItem three = new FilmItem(3, 3, "Three Men and a Baby (1987)", 1);
    private FilmItem four = new FilmItem(4, 4, "Four Rooms (1995)", 1);
    private FilmItem five = new FilmItem(5, 5, "The Fifth Element (1997)", 1);
    private FilmItem six = new FilmItem(6, 6, "6 Souls (2010)", 1);
    private FilmItem seven = new FilmItem(7, 7, "Seven Years in Tibet (1997)", 1);
    private FilmItem eight = new FilmItem(8, 8, "8 Mile (2002)", 1);
    private FilmItem nine = new FilmItem(9, 9, "Nine Months (1995)", 1);
    private FilmItem ten = new FilmItem(10, 10, "10 Items or Less (2006)", 1);
    private FilmItem eleven = new FilmItem(11, 11, "The 11th Hour (2007)", 1);
    private FilmItem twelve = new FilmItem(12, 12, "12 Years a Slave (2013)", 1);

    @BeforeEach
    public void setUp() {
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);
        manager.add(twelve);
    }

/*    @Test
    void add() {
        FilmItem thirteen = new FilmItem(13, 13, "13", 1);
        manager.add(thirteen);

        FilmItem[] actual = manager.getNumberOfFilms(1);
        FilmItem[] expected = new FilmItem[]{thirteen};

        assertArrayEquals(expected, actual);

    }*/

    @Test
    public void shouldBeNoOneMovie() {
        int numberOfFilms = 0;

        FilmItem[] actual = manager.getNumberOfFilms(numberOfFilms);
        FilmItem[] expected = new FilmItem[]{};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldBeOneMovie() {
        int numberOfFilms = 1;

        FilmItem[] actual = manager.getNumberOfFilms(numberOfFilms);
        FilmItem[] expected = new FilmItem[]{twelve};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldBeTenMovie() {
        int numberOfFilms = 10;

        FilmItem[] actual = manager.getNumberOfFilms(numberOfFilms);
        FilmItem[] expected = new FilmItem[]{twelve, eleven, ten, nine, eight,
                seven, six, five, four, three};

        assertArrayEquals(expected, actual);
    }
}