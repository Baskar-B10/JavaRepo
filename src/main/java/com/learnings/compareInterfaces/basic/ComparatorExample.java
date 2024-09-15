package com.learnings.compareInterfaces.basic;
// A Java program to demonstrate use of Comparable
import java.util.*;

public class ComparatorExample {

    // Driver class

        public static void main(String[] args)
        {
            ArrayList<Movies> list = new ArrayList<Movies>();
            list.add(new Movies("Force Awakens", 8.3, 2015));
            list.add(new Movies("Star Wars", 8.7, 1977));
            list.add(new Movies("Empire Strikes Back", 8.8, 1980));
            list.add(new Movies("Return of the Jedi", 8.4, 1983));

            Collections.sort(list);

            System.out.println("Movies after sorting : ");
            for (Movies movies : list)
            {
                System.out.println(movies.getName() + " " +
                        movies.getRating() + " " +
                        movies.getYear());
            }
        }

}

// A class 'Movies' that implements Comparable
class Movie implements Comparable<Movie>
{
    private double rating;
    private String name;
    private int year;

    // Used to sort movies by year
    public int compareTo(Movie m)
    {
        return this.year - m.year;
    }

    // Constructor
    public Movie(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName()   {  return name; }
    public int getYear()      {  return year;  }
}
