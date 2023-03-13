package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    public void saveFilms() {
        Film first = new Film(1, "Forward");
        Film second = new Film(2, "Hotel Belgrade");
        Film third = new Film(3, "Gentlemen");
        Film fourth = new Film(4, "The Invisible Man");
        Film fifth = new Film(5, "Trolls");
        Film sixth = new Film(6, "Number One");
        Film seventh = new Film(7, "Gays");
        Film eighth = new Film(8, "Friends");
        Film ninth = new Film(9, "Father");
        Film tenth = new Film(10, "Mother");

        Manager manager = new Manager();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);

        Film[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};
        Film[] actual = manager.findAll();
        assertArrayEquals(expected, actual);



    }

    @Test
    public void addFilm() {
        Film first = new Film(1, "Forward");
        Manager manager = new Manager();
        manager.save(first);

        Film[] expected = {first};
        Film[] actual = manager.findAll();
        assertArrayEquals(expected, actual);

    }

    @Test
    public void addFilm10() {
        Film tenth = new Film(10, "Mother");
        Manager manager = new Manager();
        manager.save(tenth);

        Film[] expected = {tenth};
        Film[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilm11() {
        Film eleventh = new Film(11, "Me");
        Manager manager = new Manager();
        manager.save(eleventh);

        Film[] expected = {eleventh};
        Film[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showFilms() {
        Film first = new Film(1, "Forward");
        Film second = new Film(2, "Hotel Belgrade");
        Film third = new Film(3, "Gentlemen");
        Film fourth = new Film(4, "The Invisible Man");
        Film fifth = new Film(5, "Trolls");
        Film sixth = new Film(6, "Number One");
        Film seventh = new Film(7, "Gays");
        Film eighth = new Film(8, "Friends");
        Film ninth = new Film(9, "Father");
        Film tenth = new Film(10, "Mother");

        Manager manager = new Manager();
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.save(fourth);
        manager.save(fifth);
        manager.save(sixth);
        manager.save(seventh);
        manager.save(eighth);
        manager.save(ninth);
        manager.save(tenth);


        Film[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Film[] actual = manager.findLast();
        assertArrayEquals(expected, actual);

        System.out.println(actual.toString());



    }
}