package model;
import etu1797.framework.ModelView;
import etu1797.framework.UrlMapping;
import java.util.HashMap;
import java.util.Vector;

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
    
    @UrlMapping(url="emp-all.do")
    public ModelView findAll(){
        ModelView mv = new ModelView();
        mv.setView("/emp-list.jsp");
            
        Vector<Emp> emp = new Vector<>();
        emp.add(new Emp("Rakoto"));    
        emp.add(new Emp("Rabe"));
        emp.add(new Emp("Rasoa"));

        mv.addItem("list", emp);        
        mv.addItem("liste", new Emp("Rasoa"));
        
        return mv;
    }

    @UrlMapping(url="formulaire.do")
    public ModelView formulaire(){
        ModelView mv = new ModelView();
        mv.setView("formulaire.jsp");
        return mv;
    }

    @UrlMapping(url="save.do")
    public ModelView save(){
        ModelView mv = new ModelView();

        // System.out.println("nom 1:"+this.getNom());
        mv.addItem("nom",this.getName());
        mv.addItem("prenom",this.getFirstname());
        
        mv.setView("/save.jsp");

        return mv;
    }
    
    @UrlMapping(url = "getEmp.do")
    public ModelView getEmp(String nom){
        ModelView mv = new ModelView();
        Vector<Emp> emp = new Vector<>();
        emp.add(new Emp(1,"Rakoto","malala"));    
        emp.add(new Emp(2,"Rabe","Haja"));
        emp.add(new Emp(3,"Rasoa","Ngita"));

        mv.setView("/fiche.jsp");
        for (Emp emp2 : emp) {
            if(nom.equalsIgnoreCase(emp2.getName())){
                mv.addItem("emp", emp2);
            }
        }
        
        
        return mv;
    }
    public Emp() {
    }
}