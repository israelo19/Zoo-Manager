package manager;

import java.util.ArrayList;


public class Mammal implements Comparable<Mammal>{

    private String name;



    String group;
    boolean health;
    private ArrayList<String> mammalNames;
 
 
    public Mammal(){ //constructors to make the Amphibian objects
    this.name = "NO NAME";
    this.group = "Bird";
    this.health = true;
    }

    public Mammal(String name, String group,  boolean health){ // constructor(3 params)
        this.name = name;
        this.group = group;
        this.health = health;
    }
 
    
    public Mammal (String name, String group){ //constructor 2 params
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
        this.mammalNames = new ArrayList<String>(); // eventually there will be a huge collection that contians a list of every animal in the zoo
        mammalNames.add(name);
    }



    public void addToList(){

    }


//    @Override
//    public int compareTo(Amphibian arg0) {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
//    }

	@Override
	public int compareTo(Mammal o) {
		// TODO Auto-generated method stub
		return 0;
	}
    
}
