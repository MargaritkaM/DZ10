package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

//    PosterManager repo = new PosterManager();
//
//    @BeforeEach
//    public void setup() {
//        repo.addPoster("poster 1");
//        repo.addPoster("poster 2");
//        repo.addPoster("poster 3");
//        repo.addPoster("poster 4");
//    }Кроме последних 2 тестов конструкция работала. Как можно реализовать ее, чтоб не перемещать в тело теста?

    @Test
    public void Add5FindAll() {
        PosterManager repo = new PosterManager();

        repo.addPoster("poster 1");
        repo.addPoster("poster 2");
        repo.addPoster("poster 3");
        repo.addPoster("poster 4");
        repo.addPoster("poster 5");

        String[] expected = {"poster 1", "poster 2", "poster 3", "poster 4", "poster 5"};
        String[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddSeveralFindAll() {
        PosterManager repo = new PosterManager();

        repo.addPoster("poster 1");
        repo.addPoster("poster 2");
        repo.addPoster("poster 3");
        repo.addPoster("poster 4");
        repo.addPoster("poster 5");
        repo.addPoster("poster 7");
        repo.addPoster("poster 6");
        repo.addPoster("poster 10");

        String[] expected = {"poster 1", "poster 2", "poster 3", "poster 4", "poster 5", "poster 7", "poster 6", "poster 10"};
        String[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastDefaultLimit() {
        PosterManager repo = new PosterManager();

        repo.addPoster("poster 1");
        repo.addPoster("poster 2");
        repo.addPoster("poster 3");
        repo.addPoster("poster 4");
        repo.addPoster("poster 5");
        repo.addPoster("poster 6");
        repo.addPoster("poster 7");
        repo.addPoster("poster 8");
        repo.addPoster("poster 9");
        repo.addPoster("poster 10");

        String[] expected = {"poster 10", "poster 9", "poster 8", "poster 7", "poster 6", "poster 5", "poster 4", "poster 3", "poster 2", "poster 1"};
        String[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastDefaultLessLimit() {
        PosterManager repo = new PosterManager();

        repo.addPoster("poster 1");
        repo.addPoster("poster 2");
        repo.addPoster("poster 3");
        repo.addPoster("poster 4");
        repo.addPoster("poster 5");
        repo.addPoster("poster 6");
        repo.addPoster("poster 7");


        String[] expected = {"poster 7", "poster 6", "poster 5", "poster 4", "poster 3", "poster 2", "poster 1"};
        String[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastEstablishedLimit() {
        PosterManager repo = new PosterManager(5);

        repo.addPoster("poster 1");
        repo.addPoster("poster 2");
        repo.addPoster("poster 3");
        repo.addPoster("poster 4");
        repo.addPoster("poster 5");
        repo.addPoster("poster 6");
        repo.addPoster("poster 7");


        String[] expected = {"poster 7", "poster 6", "poster 5", "poster 4", "poster 3"};
        String[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastEstablishedLimit1() {
        PosterManager repo = new PosterManager(12);

        repo.addPoster("poster 1");
        repo.addPoster("poster 2");
        repo.addPoster("poster 3");
        repo.addPoster("poster 4");
        repo.addPoster("poster 5");
        repo.addPoster("poster 6");
        repo.addPoster("poster 7");


        String[] expected = {"poster 7", "poster 6", "poster 5", "poster 4", "poster 3", "poster 2", "poster 1"};
        String[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}


