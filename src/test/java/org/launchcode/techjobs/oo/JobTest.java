package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void testSettingJobId() {
        // create two job classes
        Job jobOne = new Job();
        Job jobTwo = new Job();

        // job IDs should not match
        assertNotEquals(jobOne.getId(),jobTwo.getId());
    }

    // test the full constructor
    @Test
    public void testJobConstructorSetsAllFields() {
        // new job object
        Job jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(Objects.equals(jobOne.getName(), "Product test"));
        assertFalse(Objects.equals(jobOne.getEmployer().getValue(), "ABCD"));
        assertFalse(Objects.equals(jobOne.getLocation().getValue(), "Dessert"));
        assertFalse(Objects.equals(jobOne.getPositionType().getValue(), "Quabity control"));
        assertFalse(Objects.equals(jobOne.getCoreCompetency().getValue(), "Persist"));

        assertTrue(jobOne instanceof Job);
        assertTrue(Objects.equals(jobOne.getName(), "Product tester"));
        assertTrue(Objects.equals(jobOne.getEmployer().getValue(), "ACME"));
        assertTrue(Objects.equals(jobOne.getLocation().getValue(), "Desert"));
        assertTrue(Objects.equals(jobOne.getPositionType().getValue(), "Quality control"));
        assertTrue(Objects.equals(jobOne.getCoreCompetency().getValue(), "Persistence"));
    }

    // test the equals method
    @Test
    public void testJobsForEquality() {
        Job jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // test if jobs are equal
        assertNotEquals(jobOne.getId(),jobTwo.getId());
    }
}
