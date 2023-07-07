package model;
import etu1797.framework.UrlMapping;;

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
        System.out.println(name);
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
    
    public Emp() {
    }
}