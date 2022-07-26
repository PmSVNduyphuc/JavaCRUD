package Bai6.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class TblStudent {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "studentId")
    private Integer studentId;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "phone")
    private String phone;
    @Basic
    @Column(name = "email")
    private String email;
//    @Basic
//    @Column(name = "classId")
//    private Integer classId;
    @OneToMany(mappedBy = "tblStudentByIdSv")
    private Collection<TblMarks> tblMarksById;
    @ManyToOne
    @JoinColumn(name = "classId", referencedColumnName = "id")
    private TblClass tblClassByClassId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public Integer getClassId() {
//        return classId;
//    }
//
//    public void setClassId(Integer classId) {
//        this.classId = classId;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        TblStudent that = (TblStudent) o;
//
//        if (id != that.id) return false;
//        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;
//        if (address != null ? !address.equals(that.address) : that.address != null) return false;
//        if (name != null ? !name.equals(that.name) : that.name != null) return false;
//        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
//        if (email != null ? !email.equals(that.email) : that.email != null) return false;
//        if (classId != null ? !classId.equals(that.classId) : that.classId != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id;
//        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
//        result = 31 * result + (address != null ? address.hashCode() : 0);
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (phone != null ? phone.hashCode() : 0);
//        result = 31 * result + (email != null ? email.hashCode() : 0);
//        result = 31 * result + (classId != null ? classId.hashCode() : 0);
//        return result;
//    }

    public Collection<TblMarks> getMarksById() {
        return tblMarksById;
    }

    public void setMarksById(Collection<TblMarks> tblMarksById) {
        this.tblMarksById = tblMarksById;
    }

    public TblClass getTblClassByClassId() {
        return tblClassByClassId;
    }

    public void setTblClassByClassId(TblClass tblClassByClassId) {
        this.tblClassByClassId = tblClassByClassId;
    }
}
