package Animal;
import java.util.ArrayList;


public class Amphibian implements Comparable<Amphibian>{

    private String name;



    String group;
    boolean health;
    private ArrayList<String> amphibianNames;
 
 
    public Amphibian(){ //constructors to make the Amphibian objects
    this.name = "NO NAME";
    this.group = "Amphibian";
    this.health = true;
    }

    public Amphibian(String name, String group,  boolean health){ // constructor(3 params)
        this.name = name;
        this.group = group;
        this.health = health;
    }
 
    
    public Amphibian (String name, String group){ //constructor 2 params
        this.name = name;
        this.group = group;
        this.health = true;
    }

    public String getName() { //get name
        return name;
    }

    public void setName(String name) { //set name
        this.name = name;
    }
    public void addAmphibianName(){ // this method SHOULD... add the name of the amphibian to the arraylist of amphibiannames
        this.amphibianNames = new ArrayList<String>(); // eventually there will be a huge collection that contians a list of every animal in the zoo
        amphibianNames.add(name);
    }



    public void addToList(){

    }


    @Override
    public int compareTo(Amphibian arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
    
}
