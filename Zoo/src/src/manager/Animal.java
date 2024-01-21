package manager;
import java.util.ArrayList;

public class Animal implements AnimalInt {
    private ArrayList<Amphibian> amphibians;
    private ArrayList<Bird> birds;
    private ArrayList<Fish> fishes;
    private ArrayList<Mammal> mammals;
    private ArrayList<Reptile> reptiles;


    @Override
    public void addAnimal(String name, String animalGroup, String animalSubgroup, Animal animal) {
        // TODO Auto-generated method stub
 //       throw new UnsupportedOperationException("Unimplemented method 'addAnimal'");
        Animal a = new Animal();
        Fish f = new Fish();
    }

    @Override
    public void addSubgroup(String subgroupName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addSubgroup'");
    }

    @Override
    public void addAnimalName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAnimalName'");
    }

    @Override
    public String getAnimalGroup() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAnimalGroup'");
    }

    @Override
    public String getSubgroup() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSubgroup'");
    }

    @Override
    public ArrayList<String> getAnimalNames() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAnimalNames'");
    }

    @Override
    public void addZoo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addZoo'");
    }

	@Override
	public void addAnimal(String name, String animalGroup, String animalSubgroup) {
		// TODO Auto-generated method stub
		
	}
    
}
