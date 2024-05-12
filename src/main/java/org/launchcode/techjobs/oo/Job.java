package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job (String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String output = System.lineSeparator() +
                "ID: " + id + System.lineSeparator();

        if(name.isEmpty()) {
            output = output + "Name: Data not available" + System.lineSeparator();
        } else {
            output = output + "Name: " + name + System.lineSeparator();
        }

        if(employer.getValue().isEmpty()) {
            output = output + "Employer: Data not available" + System.lineSeparator();
        } else {
            output = output + "Employer: " + employer + System.lineSeparator();
        }

        if(location.getValue().isEmpty()) {
            output = output + "Location: Data not available" + System.lineSeparator();
        } else {
            output = output + "Location: " + location + System.lineSeparator();
        }

        if(positionType.getValue().isEmpty()) {
            output = output + "Position Type: Data not available" + System.lineSeparator();
        } else {
            output = output + "Position Type: " + positionType + System.lineSeparator();
        }

        if(coreCompetency.getValue().isEmpty()) {
            output = output + "Core Competency: Data not available" + System.lineSeparator();
        } else {
            output = output + "Core Competency: " + coreCompetency + System.lineSeparator();
        }

        return output;
    }
}
