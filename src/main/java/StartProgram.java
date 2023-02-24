/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Feb 23, 2023
 */

/**
 * @author abbyb
 *
 */
import java.util.List;
import java.util.Scanner;

import controller.ZooAnimalHelper;
import model.ZooAnimals;


public class StartProgram {

		static Scanner in = new Scanner(System.in);
		static ZooAnimalHelper lih = new ZooAnimalHelper();

		private static void addAnAnimal() {
			// TODO Auto-generated method stub
			System.out.print("Enter a species: ");
			String species = in.nextLine();
			System.out.print("Enter an name: ");
			String name = in.nextLine();
			
			ZooAnimals toAdd = new ZooAnimals(species, name);
			lih.insertAnimal(toAdd);

		}

		private static void deleteAnAnimal() {
			// TODO Auto-generated method stub
			System.out.print("Enter the species to delete: ");
			String species = in.nextLine();
			System.out.print("Enter the animal to delete: ");
			String name = in.nextLine();

		}

		private static void editAnAnimal() {
			// TODO Auto-generated method stub
			System.out.println("How would you like to search? ");
			System.out.println("1 : Search by Species");
			System.out.println("2 : Search by Name");
			int searchBy = in.nextInt();
			in.nextLine();
			/*List<ListItem> foundItems;
			if (searchBy == 1) {
				System.out.print("Enter the store name: ");
				String storeName = in.nextLine();
				
			} else {
				System.out.print("Enter the item: ");
				String itemName = in.nextLine();
				

			}

			if (!foundItems.isEmpty()) {
				System.out.println("Found Results.");
				for (ListItem l : foundItems) {
					System.out.println(l.getId() + " : " + l.toString());
				}
				System.out.print("Which ID to edit: ");
				int idToEdit = in.nextInt();

				ListItem toEdit = lih.searchForItemById(idToEdit);
				System.out.println("Retrieved " + toEdit.getItem() + " from " + toEdit.getStore());
				System.out.println("1 : Update Store");
				System.out.println("2 : Update Item");
				int update = in.nextInt();
				in.nextLine();

				if (update == 1) {
					System.out.print("New Store: ");
					String newStore = in.nextLine();
					toEdit.setStore(newStore);
				} else if (update == 2) {
					System.out.print("New Item: ");
					String newItem = in.nextLine();
					toEdit.setItem(newItem);
				}

				lih.updateItem(toEdit);

			} else {
				System.out.println("---- No results found");
			}
*/
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			runMenu();

		}

		public static void runMenu() {
			boolean goAgain = true;
			System.out.println("--- Welcome to our awesome zoo! ---");
			while (goAgain) {
				System.out.println("*  Select an Animal:");
				System.out.println("*  1 -- Add an Animal");
				System.out.println("*  2 -- Edit an Animal");
				System.out.println("*  3 -- Delete an Animal");
				System.out.println("*  4 -- View the list");
				System.out.println("*  5 -- Exit the awesome program");
				System.out.print("*  Your selection: ");
				int selection = in.nextInt();
				in.nextLine();

				if (selection == 1) {
					addAnAnimal();
				} else if (selection == 2) {
					editAnAnimal();
				} else if (selection == 3) {
					deleteAnAnimal();
				} else if (selection == 4) {
					viewTheList();
				} else {
					//lih.cleanUp();
					System.out.println("   Goodbye!   ");
					goAgain = false;
				}

			}

		}

		private static void viewTheList() {
			// TODO Auto-generated method stub
			List<ZooAnimals> allAnimals = lih.showAllAnimals();
			
			for(ZooAnimals animal : allAnimals) {
				System.out.println(animal.returnAnimalDetails());
			}
			

		}

	}
