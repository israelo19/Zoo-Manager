
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
    public void addAnimalName();
    

    public String getAnimalGroup();
    // this would return the Animal Group of said object (Types: Fish, Amphibian, Reptile, Bird, Mammal)
   
    public String getSubgroup();
    //returns the Species/subgroup of the animal (ex: dog, cat, insect, --if it has one)
  
    public String getAnimalName();
   // returns the personal name for that animal
  
    public void addZoo();
    //creates a zoo (ex: blatimore zoo, DC zoo)


    

    @Override
    String toString();
}




