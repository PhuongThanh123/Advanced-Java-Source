package Exercise124StorePet;

import java.util.ArrayList;
import java.util.List;

public class MainClassPetManger {

	public static void main(String[] args) {
		PetManger<Dog> mangerDog = new PetManger<Dog>();
		PetManger<Cat> mangerCat = new PetManger<Cat>();

		System.out.println("Enter name of Dog: ");
		String nameDog = "Husky, poo, alatca";
		String DogName[] = nameDog.split(",");

		System.out.println("Enter name of Cat: ");
		String nameCat = "Mimi, meomeo, miumiu";
		String CatName[] = nameCat.split(",");

		for (String Dogname : DogName) {
			mangerDog.getPest().add(new Dog(Dogname));
		}

		for (String CatName1 : CatName) {
			mangerCat.getPest().add(new Cat(CatName1));

		}
		List<String> shop = new ArrayList<String>();
		for (Dog dog : mangerDog.getPest()) {
			shop.add("Dog: " + dog.getNameDog());
		}
		for (Cat cat : mangerCat.getPest()) {
			shop.add("Cat: " + cat.getNameCat());
		}

		System.out.println("======List Shop=========");
		for (String pet : shop) {
			System.out.println(pet);
		}

	}

}
