package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {
    private int lastMovie = 10;
    private Movie[] movies = new Movie[0];

    public MovieManager(int lastMovie) {
        this.lastMovie = lastMovie;
    }

    public MovieManager() {
    }

    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] getAll() {
        Movie[] result = new Movie[movies.length];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public Movie[] getLastMovie() {
        Movie[] result = new Movie[movies.length];
        if (result.length >= lastMovie) {
            Movie[] lastTenMovie = new Movie[lastMovie];
            int beginning = movies.length - lastMovie;
            System.arraycopy(movies, beginning, lastTenMovie, 0, lastMovie);
            Movie[] tmp = new Movie[lastMovie];

            for (int i = 0; i < lastTenMovie.length; i++) {
                int index = lastTenMovie.length - i - 1;
                tmp[i] = lastTenMovie[index];
                result = tmp;
            }

        } else
            for (int i = 0; i < result.length; i++) {
                int index = movies.length - i - 1;
                result[i] = movies[index];
            }

        return result;
    }

    // наивная реализация
//    public void removeById(int id) {
//        int length = movies.length - 1;
//        Movie[] tmp = new Movie[length];
//        int index = 0;
//        for (Movie movie : movies) {
//            if (movie.getId() != id) {
//                tmp[index] = movie;
//                index++;
//            }
//        }
//        // меняем наши элементы
//        movies = tmp;
//    }
}
