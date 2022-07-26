package Bai5.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TblSubject")
public class TblSubject {
    @Id
    @Column(name = "ID")
    private int Id;
    @Column(name = "Name")
    private String Name;
    @Column(name = "Desciption")
    private String Description;
    @Column(name = "sem")
    private int sem;
    @Column(name = "duration")
    private int duration;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
