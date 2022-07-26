package Bai6.Model;

import javax.persistence.*;

@Entity
public class TblMarks {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
//    @Basic
//    @Column(name = "idSv")
//    private Integer idSv;
//    @Basic
//    @Column(name = "idSb")
//    private Integer idSb;
    @Basic
    @Column(name = "mark")
    private Integer mark;
    @Basic
    @Column(name = "note")
    private String note;
    @ManyToOne
    @JoinColumn(name = "idSv", referencedColumnName = "id")
    private TblStudent tblStudentByIdSv;
    @ManyToOne
    @JoinColumn(name = "idSb", referencedColumnName = "id")
    private TblSubject tblSubjectByIdSb;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public Integer getIdSv() {
//        return idSv;
//    }
//
//    public void setIdSv(Integer idSv) {
//        this.idSv = idSv;
//    }
//
//    public Integer getIdSb() {
//        return idSb;
//    }
//
//    public void setIdSb(Integer idSb) {
//        this.idSb = idSb;
//    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
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
//        TblMarks tblMarks = (TblMarks) o;
//
//        if (id != tblMarks.id) return false;
//        if (idSv != null ? !idSv.equals(tblMarks.idSv) : tblMarks.idSv != null) return false;
//        if (idSb != null ? !idSb.equals(tblMarks.idSb) : tblMarks.idSb != null) return false;
//        if (mark != null ? !mark.equals(tblMarks.mark) : tblMarks.mark != null) return false;
//        if (note != null ? !note.equals(tblMarks.note) : tblMarks.note != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id;
//        result = 31 * result + (idSv != null ? idSv.hashCode() : 0);
//        result = 31 * result + (idSb != null ? idSb.hashCode() : 0);
//        result = 31 * result + (mark != null ? mark.hashCode() : 0);
//        result = 31 * result + (note != null ? note.hashCode() : 0);
//        return result;
//    }

    public TblStudent getTblStudentByIdSv() {
        return tblStudentByIdSv;
    }

    public void setTblStudentByIdSv(TblStudent tblStudentByIdSv) {
        this.tblStudentByIdSv = tblStudentByIdSv;
    }

    public TblSubject getTblSubjectByIdSb() {
        return tblSubjectByIdSb;
    }

    public void setTblSubjectByIdSb(TblSubject tblSubjectByIdSb) {
        this.tblSubjectByIdSb = tblSubjectByIdSb;
    }
}
