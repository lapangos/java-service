package com.demo.service.lld.bookmyshow;

import java.util.List;

public class Theater {
    private final String name;
    private final String location;
    private final List<Show> shows;

    public Theater(String name, String location, List<Show> shows) {
        this.name = name;
        this.location = location;
        this.shows = shows;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Show> getShows() {
        return shows;
    }
}