package T2110M.Entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;

@XmlRootElement
public class StudentXml {
    private int id;
    private String name;
    private String age;
    private String phone;

    private String[] roles;

    public StudentXml(int id, String name, String age, String phone, String[] roles) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.roles = roles;
    }

    public int getId() {
        return id;
    }
@XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
@XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }
@XmlElement
    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }
@XmlElement
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String[] getRoles() {
        return roles;
    }
@XmlElementWrapper(name = "roles")
@XmlElement
    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "StudentXml{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", phone='" + phone + '\'' +
                ", roles=" + Arrays.toString(roles) +
                '}';
    }
}
