package ru.netology.manager;

import ru.netology.domain.FilmItem;

public class CartManager {
    private FilmItem[] items = new FilmItem[0];

    // добавление фильма
    public void add(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public FilmItem[] getNumberOfFilms(int numberOfFilms) {
        FilmItem[] result = new FilmItem[items.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        // выдаем 10 фильмов или меньше
        FilmItem[] result10 = new FilmItem[numberOfFilms];
        System.arraycopy(result, 0, result10, 0, numberOfFilms);

        return result10;
    }
}