package net.devstudy.resume.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author devstudy
 * @see http://devstudy.net
 */
@Entity
@Table(name = "course")
public class Course extends AbstractFinishDateEntity<Long> implements Serializable {
	private static final long serialVersionUID = 4206575925684228495L;

	@Id
	@SequenceGenerator(name = "COURSE_ID_GENERATOR", sequenceName = "COURSE_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COURSE_ID_GENERATOR")
	@Column(unique = true, nullable = false)
	private Long id;

	@Column(length=60)
	private String name;

	@Column(length=60)
	private String school;


    @ManyToMany
    @JoinTable(name = "course_profile",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "profile_id"))
	private List<Profile> profiles = new ArrayList<>();

    public List<Profile> getProfiles() {
        return profiles;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((getFinishDate() == null) ? 0 : getFinishDate().hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((school == null) ? 0 : school.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Course))
			return false;
		Course other = (Course) obj;
		if (getFinishDate() == null) {
			if (other.getFinishDate() != null)
				return false;
		} else if (!getFinishDate().equals(other.getFinishDate()))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (school == null) {
			if (other.school != null)
				return false;
		} else if (!school.equals(other.school))
			return false;
		return true;
	}
}
