package T2110M;


import T2110M.Entity.StudentXml;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XmlApp {
    public static void main(String[] args) throws JAXBException, ParserConfigurationException, TransformerException {
// writeXml();
        writeXMLvsDom();

    }
    public static void writeXml() throws JAXBException {
//Tạo file xml
        File file = new File("student.xml");

//JAXB
        JAXBContext context = JAXBContext.newInstance(StudentXml.class);
//Tạo marshaller object
        Marshaller marshaller = context.createMarshaller();

        ((Marshaller) marshaller).setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

//Tạo ra cấu trúc xml theo định dạng của Entity
        StudentXml studentXml = new StudentXml(1,"Thanh","thanh@gmail.com","560265",
                new String[]{"Student","Employee"});

//Chuyển object -> xml file
        marshaller.marshal(studentXml,file);
    }
    public static void writeXMLvsDom() throws ParserConfigurationException, TransformerException {
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

        Document dom = builder.newDocument();//Tạo ra đối tượng document

//Tạo root element
        Element root = dom.createElement("user");
        dom.appendChild(root);
//tao roles element
        Element roles = dom.createElement("roles");
        root.appendChild(roles);

//Tao ra attribute them vao root
        Attr attr = dom.createAttribute("id");
        attr.setValue("1");
        root.setAttributeNode(attr);
//tao ra atb them vao roles

//Tao ra cac elements con cua root aka user(name, email, roles, mobile)
        Element name = dom.createElement("name");
        name.setTextContent("Thanh");
        Element email = dom.createElement("email");
        email.setTextContent("thanh@gmail.com");
        Element phone = dom.createElement("phone");
        phone.setTextContent("09111111111");
        Element role1 = dom.createElement("role");
        role1.setTextContent("SinhVien");
        Element role2 = dom.createElement("role");
        role1.setTextContent("Caption");

        root.appendChild(name);
        root.appendChild(email);
        root.appendChild(phone);
        roles.appendChild(role1);
        roles.appendChild(role2);
//DOM -> XML file
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT,"yes");
        transformer.transform(new DOMSource(dom),new StreamResult((new File("student.xml"))));

        //

    }
}
