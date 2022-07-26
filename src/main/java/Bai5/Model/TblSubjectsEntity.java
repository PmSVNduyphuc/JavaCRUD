package Bai5.Model;

import javax.persistence.*;

@Entity
@Table(name = "TblSubjects", schema = "dbo", catalog = "EX5SpringBoot")
public class TblSubjectsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "Name")
    private String name;
    @Basic
    @Column(name = "Desciption")
    private String desciption;
    @Basic
    @Column(name = "sem")
    private Integer sem;
    @Basic
    @Column(name = "duration")
    private Integer duration;

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

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblSubjectsEntity that = (TblSubjectsEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (desciption != null ? !desciption.equals(that.desciption) : that.desciption != null) return false;
        if (sem != null ? !sem.equals(that.sem) : that.sem != null) return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (desciption != null ? desciption.hashCode() : 0);
        result = 31 * result + (sem != null ? sem.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        return result;
    }
}
