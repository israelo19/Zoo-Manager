package manager;

import java.util.ArrayList;


public class Fish implements Comparable<Fish>{

    private String name;



    String group;
    boolean health;
    private ArrayList<String> fishNames;
 
 
    public Fish(){ //constructors to make the Amphibian objects
    this.name = "NO NAME";
    this.group = "Fish";
    this.health = true;
    }

    public Fish(String name, String group,  boolean health){ // constructor(3 params)
        this.name = name;
        this.group = group;
        this.health = health;
    }
 
    
    public Fish (String name, String group){ //constructor 2 params
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
        this.fishNames = new ArrayList<String>(); // eventually there will be a huge collection that contians a list of every animal in the zoo
        fishNames.add(name);
    }



    public void addToList(){

    }


//    @Override
//    public int compareTo(Amphibian arg0) {
//        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
//    }

	@Override
	public int compareTo(Fish o) {
		// TODO Auto-generated method stub
		return 0;
	}
    
}
