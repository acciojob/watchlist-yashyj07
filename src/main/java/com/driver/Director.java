package com.driver;


public class Director {
    private String name;
    private int numberOfMovies;
    private double imdbRating;

    //---------- Constructor ---------
    public Director() {
    }
    public Director(String name, int numberOfMovies, double imdbRating) {
        this.name = name;
        this.numberOfMovies = numberOfMovies;
        this.imdbRating = imdbRating;
    }

    //------------ Getter -----------


    public String getName() {
        return name;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    //-------------- Setter -------------

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }
}
