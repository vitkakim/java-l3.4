package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    MovieManager movieManager = new MovieManager();
    Movie first = new Movie(1, 1, "Бладшот", "боевик");
    Movie second = new Movie(2, 2, "Вперёд", "мультфильм");
    Movie third = new Movie(3, 3, "Отель Белград", "комедия");
    Movie fourth = new Movie(4, 4, "Джентельмены", "боевик");
    Movie fifth = new Movie(5, 5, "Человек-невидимка", "ужасы");
    Movie sixth = new Movie(6, 6, "Тролли. Мировой тур", "мультфильм");
    Movie seventh = new Movie(7, 7, "Номер один", "Комедия");
    Movie eighth = new Movie(8, 8, "Русалочка", "мультфильм");
    Movie ninth = new Movie(9, 9, "Человек-паук", "фантастика, боевик");
    Movie tenth = new Movie(10, 10, "Форсаж", "боевик, триллер");
    Movie eleventh = new Movie(11, 11, "Один дома", "семейный");

   @Test
    void shouldAdd() {
        movieManager.add(first);
        movieManager.add(second);
        movieManager.add(third);
        movieManager.add(fourth);
        movieManager.add(fifth);
        movieManager.add(sixth);
        movieManager.add(seventh);
        movieManager.add(eighth);
        movieManager.add(ninth);
        movieManager.add(tenth);
        movieManager.add(eleventh);
        Movie[] actual = movieManager.getAll();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetLastTenMovie() {
        movieManager.add(first);
        movieManager.add(second);
        movieManager.add(third);
        movieManager.add(fourth);
        movieManager.add(fifth);
        movieManager.add(sixth);
        movieManager.add(seventh);
        movieManager.add(eighth);
        movieManager.add(ninth);
        movieManager.add(tenth);
        movieManager.add(eleventh);
        Movie[] actual = movieManager.getLastMovie();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldGetLessTenMovie() {
        movieManager.add(first);
        movieManager.add(fourth);
        movieManager.add(fifth);
        movieManager.add(sixth);
        movieManager.add(ninth);

        Movie[] actual = movieManager.getLastMovie();
        Movie[] expected = new Movie[]{ninth, sixth, fifth, fourth, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldChooseLastMovie() {
       MovieManager movieManager = new MovieManager(3);
        movieManager.add(first);
        movieManager.add(fourth);
        movieManager.add(fifth);
        movieManager.add(sixth);
        movieManager.add(ninth);

        Movie[] actual = movieManager.getLastMovie();
        Movie[] expected = new Movie[]{ninth, sixth, fifth};
        assertArrayEquals(expected, actual);
    }
}