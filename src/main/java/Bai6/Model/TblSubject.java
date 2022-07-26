package Bai6.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class TblSubject {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "sem")
    private Integer sem;
    @Basic
    @Column(name = "duration")
    private Integer duration;
    @OneToMany(mappedBy = "tblSubjectByIdSb")
    private Collection<TblMarks> tblMarksById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSem() {
        return sem;
    }

    public void setSem(Integer sem) {
        this.sem = sem;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        TblSubject that = (TblSubject) o;
//
//        if (id != that.id) return false;
//        if (name != null ? !name.equals(that.name) : that.name != null) return false;
//        if (description != null ? !description.equals(that.description) : that.description != null) return false;
//        if (sem != null ? !sem.equals(that.sem) : that.sem != null) return false;
//        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (description != null ? description.hashCode() : 0);
//        result = 31 * result + (sem != null ? sem.hashCode() : 0);
//        result = 31 * result + (duration != null ? duration.hashCode() : 0);
//        return result;


    public Collection<TblMarks> getMarksById() {
        return tblMarksById;
    }

    public void setMarksById(Collection<TblMarks> tblMarksById) {
        this.tblMarksById = tblMarksById;
    }
}
