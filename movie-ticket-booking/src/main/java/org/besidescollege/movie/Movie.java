package org.besidescollege.movie;

import java.util.Date;
import java.util.List;

import org.besidescollege.account.Admin;

public class Movie {
    private String title;
    private String description;
    private int durationInMins;
    private String language;
    private Date releaseDate;
    private String country;
    private String genre;
    private Admin movieAddedBy;

    private List<Show> shows;

    public List<Show> getShows() {
        return null;
    }
}
