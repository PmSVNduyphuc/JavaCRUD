package T2110M;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.swing.text.EditorKit;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class JsonApp {

    public static void main(String[] args) throws IOException {
        jsonWriter();
        jsonReader();

    }

    public static void jsonReader() throws IOException{
// Reader reader = Files.newBufferedReader(Paths.get("Customer.json"));
// FileReader reader = new FileReader("Customer.json");

//Parser phan tich file json or xml
//JackSon
// ObjectMapper objectMapper = new ObjectMapper();
// JsonNode parser = objectMapper.readTree(reader);

// System.out.println(parser.path("id").asLong());

//GSON
        Reader reader = Files.newBufferedReader(Paths.get("Customer.json"));
        JsonObject parser = JsonParser.parseReader(reader).getAsJsonObject();

//Read Customer
        System.out.println(parser.get("id").getAsLong());
        System.out.println(parser.get("name").getAsString());
        System.out.println(parser.get("email").getAsString());
        System.out.println(parser.get("age").getAsInt());

//Read Project
        for (JsonElement project : parser.get("projects").getAsJsonArray())
        {
            JsonObject object = project.getAsJsonObject();
            System.out.println(object.get("title").getAsString());
            System.out.println(object.get("budget").getAsDouble());

        }
//Read paymentMethods
        for (JsonElement payment : parser.get("paymentMethods").getAsJsonArray()){
            System.out.println(payment.getAsString());
        }


        reader.close();


    }
    public static void jsonWriter() throws IOException{
//Create writer
//BufferedWriter writer = Files.newBufferedWriter(Paths.get("customer.json"));

//Create object customer
        JSONObject customer = new JSONObject();//{}
        customer.put("id",1);
        customer.put("name","Khoi");
        customer.put("email","khoi@gmail.com");
        customer.put("age",25);

//Create customer's address
        JSONObject address = new JSONObject();
        address.put("street","Hai Ba Trung");
        address.put("city","Ha Noi");
        address.put("state","HBT");

        customer.put("address",address);

//payment methods
        JSONArray pm = new JSONArray();//[]
        pm.addAll(Arrays.asList("Momo","Visa","Zalopay"));

        customer.put("paymentMethods",pm);

//create projects
        JSONArray projects = new JSONArray();

//create 1st project
        JSONObject p1 = new JSONObject();
        p1.put("title","Java with json application");
        p1.put("budget",5000);

//create 2nd project
        JSONObject p2 = new JSONObject();
        p2.put("title","Java with xml application");
        p2.put("budget",3000);

//create 2nd project
        JSONObject p3 = new JSONObject();
        p3.put("title","Java with xml application");
        p3.put("budget",3000);

//create 2nd project
        JSONObject p4 = new JSONObject();
        p4.put("title","Java with xml application");
        p4.put("budget",3000);

//create 2nd project
        JSONObject p5 = new JSONObject();
        p5.put("title","Java with xml application");
        p5.put("budget",3000);

//add projects
        projects.addAll(Arrays.asList(p1,p2,p3,p4,p5));

//add projects to customer
        customer.put("projects",projects);

//write JSON to file
// writer.write(customer.toJSONString
        FileWriter fileWriter = new FileWriter("Customer.json");
        fileWriter.write(customer.toJSONString());
        fileWriter.flush();
    }
    public static void JsonEdit() throws IOException{
       jsonReader();

    }
}