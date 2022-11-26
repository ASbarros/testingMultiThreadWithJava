package com.asbarros.multthread_code;

public class ClassWithThreadingProblem {

    int id;

    public int takeNextId() {
        return id++;
    }

    public int lastId() {
        return id;
    }
}
