package com.kodilla.spring.library;

import java.util.ArrayList;
import java.util.List;


public final class LibraryByClassConf {
    private final List<String> books = new ArrayList<>();
    private LibraryDbControllerByClass libraryDbControllerByClass;

    public LibraryByClassConf(final LibraryDbControllerByClass libraryDbControllerByClass) {
        this.libraryDbControllerByClass = libraryDbControllerByClass;
    }

    public LibraryByClassConf() {
    }

    public void saveToDb() {
        libraryDbControllerByClass.saveData();
    }

    public void loadFromDb() {
        libraryDbControllerByClass.loadData();
    }
}