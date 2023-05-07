package model;
import etu1797.framework.UrlMapping;
import java.util.HashMap;
import java.util.Vector;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class Emp {
    int id;
    String name;
    String firstname;
    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    

    @UrlMapping(url = "get-name.do")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Emp(int id, String name, String firstname) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
    }

    public Emp(String name) {
        this.name = name;
    }
    
   
    
    public String test() {
        return "mety anie io";
    }

    @UrlMapping(url="page_test.do")
    public void andrana(){
        System.out.println("mety");
    }
public Emp() {}
    
}

