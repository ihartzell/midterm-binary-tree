// This class is for an Employee's information.
public class EmployeeInfoNode 
{
	// IDnumber is the key to the name.
	// In other words, the name is attached to an IDnumber.
	int IDnumber;
	// Stores the employee's name.
	String name;
	// This is the right and left child nodes.
	EmployeeInfoNode rightChild;
	EmployeeInfoNode leftChild;
	
	// Constructor for the employee's name and ID.
	public EmployeeInfoNode(int IDnumber,String name)
	{
		this.IDnumber = IDnumber;
		this.name = name;
	}
	// This will display which name each IDnumber is attached to.
	// This replaces the getters and setters.
	public String toString()
	{
		return IDnumber + " is " + name;
	}
	/*// This method will be a checker for the leaf node which has no children.
	public boolean isLeaf()
	{
		// I'm assigning the node which contains no children to true.
		boolean leafNode = true;
			
		// if the left child and right child contains some value then I want to make
		// the leaf which has no children equal to false.
		if(leftChild != null || rightChild != null)
		{
			leafNode = false;
		}
		// return what this is back to the function.
		return leafNode;
	}*/
}

