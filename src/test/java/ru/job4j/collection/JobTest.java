package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByName() {
        Comparator<Job> compareNameLow = new JobDescByName();
        int rsl = compareNameLow.compare(new Job("Impl task", 8),
                new Job("Fix bug", 9));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorAcsByName() {
        Comparator<Job> compareNameHigh = new JobAcsByName();
        int rsl = compareNameHigh.compare(new Job("Impl task", 8),
                new Job("Fix bug", 9));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorDescByPriority() {
        Comparator<Job> comparePriorityLow = new JobDescByPriority();
        int rsl = comparePriorityLow.compare(new Job("Impl task", 8),
                new Job("Fix bug", 9));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorAcsByPriority() {
        Comparator<Job> comparePriorityHigh = new JobAcsByPriority();
        int rsl = comparePriorityHigh.compare(new Job("Impl task", 8),
                new Job("Fix bug", 9));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName()
                .thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndAcsPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName()
                .thenComparing(new JobAcsByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorAcsByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobAcsByName()
                .thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorAcsByNameAndAcsPrority() {
        Comparator<Job> cmpNamePriority = new JobAcsByName()
                .thenComparing(new JobAcsByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}

