import java.util.ArrayList;


public interface AnimalInt {
    public void addAnimal(String name, String animalGroup, String animalSubgroup);
    /**
     * adds an animal to the zoo
    @param name - the name of the animal
    @param animalGroup
    @param animalSubgroup
    */
   public void addSubgroup(String subgroupName);
    /**
     * adds subgroup of animal, --if it has one
    @param subgroupName - the name of the subgroup(ex: dog, cat, insect, --if it has one)
     */
    public void addAnimalName(String name);
    /**
     * 
     * @param name
     */
    

    public String getAnimalGroup();
    /**
     * this would return the Animal Group of said object (Types: Fish, Amphibian, Reptile, Bird, Mammal)
     * 
     *  @return animalGroup
     *  This method should parse through the array(probably arraylist) of animal groups and return the animal group of animal associated with the name of the animal
     *  Ex: [animalName].getAnimalGroup
     */
   
    public String getSubgroup();
    /**
     * returns the Species/subgroup of the animal (ex: dog, cat, insect, --if it has one)
       By calling animalName.getSubgroup
     * @return animal Subgroup
     */

  
    public ArrayList<String>  getAnimalNames(); // subject to removal
    /**
     * returns an arraylist of the personal names of the animals in the zoo
     * From there a user can request to see the animal groups and animal sub groups
     * Essentially this method will parse each animal and return the name of the animal in the arraylist collection
     * 
    @return 
    
     */

    // I think instead we might need an array of animal names to pick from and get details of 

  
    public void addZoo();
    //creates a zoo (ex: baltimore zoo, DC zoo)


    

    @Override
    String toString();
}
