package com.embarkx.firstjobapp.job;

public class Job {
    private String title;
    private String description;
    private String location;
    private String type;
    private String company;
    private String url;

    public Job(String title, String description, String location, String type, String company, String url) {
        this.title = title;
        this.description = description;
        this.location = location;
        this.type = type;
        this.company = company;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public String getCompany() {
        return company;
    }

    public String getUrl() {
        return url;
    }

    public Object getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }
}
