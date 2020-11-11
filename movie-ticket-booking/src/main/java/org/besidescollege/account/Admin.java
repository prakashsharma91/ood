package org.besidescollege.account;

import org.besidescollege.movie.Movie;
import org.besidescollege.movie.Show;

public class Admin extends Person {

    public boolean addMovie(Movie movie) {
        return true;
    }

    public boolean addShow(Show show) {
        return true;
    }

    public boolean blockUser(Customer customer) {
        return true;
    }

}
