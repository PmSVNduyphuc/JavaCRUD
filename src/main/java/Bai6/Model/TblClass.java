package Bai6.Model;

import javax.persistence.*;

@Entity
public class TblClass {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "note")
    private String note;

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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        TblClass tblClass = (TblClass) o;
//
//        if (id != tblClass.id) return false;
//        if (name != null ? !name.equals(tblClass.name) : tblClass.name != null) return false;
//        if (note != null ? !note.equals(tblClass.note) : tblClass.note != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (note != null ? note.hashCode() : 0);
//        return result;
//    }
}
