//Isaac Hartzell
// 3-11-18
// Midterm
// This program demonstrates a binary search tree on a group of employee names attached to an ID number.
import java.util.Scanner;
// This class is where the program runs from.
public class Driver 
{
	// This is the method which is what actually runs the program.
	public static void main(String[] args) 
	{
		// Creating my tree object.
		BinaryTree myTree = new BinaryTree();
		// I'm calling for my menu which takes the tree as an argument..
		menu(myTree);
		
	}
	// This creates the menu and returns user input for option 1-3.
	public static int getMenuOption()
	{
		Scanner input = new Scanner(System.in);
		int menuOption = 0;
		
		System.out.println("	*MENU*");
		System.out.println("1.Search for Name by Employee ID.");
		System.out.println("2.View all three traversals of tree.");
		System.out.print("3 Exit.");
		
		menuOption = input.nextInt();
		
		System.out.println();
		while(menuOption < 1 || menuOption > 3)
		{
			System.out.println(menuOption + " is an invalid option please pick 1 or 2.");
			System.out.println("---MENU---");
			System.out.println("1.Search for Name by Employee ID.");
			System.out.println("2.View all three traversals of tree. \n");
			System.out.print("3 Exit.");
			menuOption = input.nextInt();
		}
		return menuOption;
	}
	// This method will tackles the cases for if the user enters 1-3 and will repeatedly loop.
	public static void menu(BinaryTree myTree)
	{
		Scanner input = new Scanner(System.in);
		boolean doneWithLoop = false;
		int IDnumber = 0;
		
		// As long as this variable remains false I'll loop through the menu.
		while(doneWithLoop == false)
		{	
			// I'm calling for my getMenuOption method which returns user input to create a switch statement.
			switch(getMenuOption())
			{
			// Case for searching for an Employee attached to the ID number.
			case 1: System.out.print("Please enter an Employee ID number to search for.");
					IDnumber = input.nextInt();
					myTree.insertNode(1021, "John Williams");
					myTree.insertNode(1057, "Bill Witherspoon");
					myTree.insertNode(2487, "Jennifer Twain");
					myTree.insertNode(3769, "Sophia Lancaster");
					myTree.insertNode(1017, "Debbie Reece");
					myTree.insertNode(1275, "George McMullen");
					myTree.insertNode(1899, "Ashley Smith");
					myTree.insertNode(4218, "Josh Plemmons");
					System.out.println(myTree.searchForNameAttachedToID(IDnumber));
					System.out.println();
					break;
			// Case for printing off the hardcoded list of employees in the three tree traversal orders.	
			case 2: System.out.println("I'll now print off the tree in preorder,inorder,and postorder. \n");
					myTree.insertNode(1021, "John Williams");
					myTree.insertNode(1057, "Bill Witherspoon");
					myTree.insertNode(2487, "Jennifer Twain");
					myTree.insertNode(3769, "Sophia Lancaster");
					myTree.insertNode(1017, "Debbie Reece");
					myTree.insertNode(1275, "George McMullen");
					myTree.insertNode(1899, "Ashley Smith");
					myTree.insertNode(4218, "Josh Plemmons");
					System.out.println("PREORDER");
					myTree.preOrderTraversal(myTree.root);
					System.out.println();
					System.out.println("INORDER");
					myTree.inOrderTraversal(myTree.root);
					System.out.println();
					System.out.println("POSTORDER");
					myTree.postOrderTraversal(myTree.root);
					System.out.println();
					break;
			// Exits the program.	
			case 3: System.out.println("Terminating program...");
					doneWithLoop = true;
					break;
			}
		}
	}
}
