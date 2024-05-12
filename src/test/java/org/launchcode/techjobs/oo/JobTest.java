package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.util.Objects;

import static java.lang.System.lineSeparator;
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

    // create first test to make sure toString begins/ends with a newline
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String test = System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: " + job.getName() + System.lineSeparator() +
                "Employer: " + job.getEmployer() + System.lineSeparator() +
                "Location: " + job.getLocation() + System.lineSeparator() +
                "Position Type: " + job.getPositionType() + System.lineSeparator() +
                "Core Competency: " + job.getCoreCompetency() + System.lineSeparator();

        assertEquals(test, job.toString());

//        String firstChar = String.valueOf(job.toString().charAt(0));
//        String lastChar = String.valueOf(job.toString().charAt(job.toString().length()-1));
//        assertEquals(firstChar, System.lineSeparator());
//        assertEquals(lastChar, System.lineSeparator());
    }

    // test to check toString contains correct info
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String test = System.lineSeparator() +
                "ID: 4" + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();

        assertEquals(test, job.toString());
    }

    // test to see if a field is empty return data not available
    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("Product tester", new Employer(""), new Location(""), new PositionType("Quality control"), new CoreCompetency(""));

        String test = System.lineSeparator() +
                "ID: 3" + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: Data not available" + System.lineSeparator() +
                "Location: Data not available" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Data not available" + System.lineSeparator();

        assertEquals(test, job.toString());
    }
}
