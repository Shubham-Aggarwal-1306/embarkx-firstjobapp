package com.embarkx.firstjobapp.job;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class JobController {

    private List<Job> jobs = new ArrayList<>();

    @GetMapping("/jobs")
    public List<Job> findAll() {
        return jobs;
    }

    @PostMapping("/jobs")
    public Job create(@RequestBody Job job) {
        jobs.add(job);
        return job;
    }

    @GetMapping("/jobs/{id}")
    public Job findById(@PathVariable String id) {
        return jobs.stream().filter(job -> job.getId().equals(id)).findFirst().orElse(null);
    }

    @GetMapping("/jobs/{id}/apply")
    public String apply(@PathVariable String id) {
        return "You have applied to job with id: " + id;
    }


}
