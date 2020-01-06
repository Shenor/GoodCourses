package net.devstudy.resume.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "rewiew")
public class Rewiew extends AbstractEntity<Long> implements Serializable, ProfileEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name="REWIEW_ID_GENERATOR", sequenceName="REWIEW_SEQ", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REWIEW_ID_GENERATOR")
    @Column(unique=true, nullable=false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", nullable = false)
    @JsonIgnore
    private Profile profile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", nullable = false)
    @JsonIgnore
    private Course course;

    @Column(nullable = false, length = 2147483647)
    private String description;

    @Column(name="start_date", nullable=false)
    private Integer startDate;

    @Column(name="last_update")
    private Integer lastUpdate;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Profile getProfile() {
        return profile;
    }

    public Course getCourse() {
        return course;
    }
}
