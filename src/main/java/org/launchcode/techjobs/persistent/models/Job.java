package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

    @ManyToOne
    @NotNull(message = "Employer field cannot be empty")
    private Employer employer;

    @ManyToMany
    @NotNull(message = "You must select one or more skill(s)")
    private List<Skill> skills;

    public Job() {}

    public Job(Employer employer, List<Skill> skills) {
        this.employer = employer;
        this.skills = skills;
    }

    // Getters and setters.
    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
