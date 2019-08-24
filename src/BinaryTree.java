// This class is the setup for the tree which will start inserting nodes.
public class BinaryTree 
{
	// The root of the tree.
	EmployeeInfoNode root;
	// This method will insert a node into the tree.
	public void insertNode(int IDnumber,String name)
	{
		// I'm creating a new node which contains the IDnumber and a name.
		EmployeeInfoNode newNode = new EmployeeInfoNode(IDnumber,name);
		// if the root node contains no value then I want to make the root node
		// what the new node is.
		if(root == null)
		{
			root = newNode;
		}
		// If the previous didn't occur and the root node does contain information within it
		// then I do this.
		else
		{
			// I'm starting with root.
			EmployeeInfoNode nodeImWorkingOn = root;
			// I'm making the parent node for the children.
			EmployeeInfoNode parentNode;
			// I'm looping through the following instructions.
			while(true)
			{
				// I'm assigning the parent node to the one I'm working on putting a value into.
				parentNode = nodeImWorkingOn;
				// I'm checking to see if this node should go on the left or right.
				// if the node is less than the root I go left, if it's greater than the root I go right.
				if(IDnumber < nodeImWorkingOn.IDnumber)
				{
					// The node I'm working on is the left child.
					nodeImWorkingOn = nodeImWorkingOn.leftChild;
					
					// If this node node on the left side of the tree contains nothing
					// Then I assign the left child of the parent as the new node.
					if(nodeImWorkingOn == null)
					{
						parentNode.leftChild = newNode;
						return;
					}
				}
				// If the node is greater than the root node I want to go right
				// and make this node the right child.
				else
				{
					nodeImWorkingOn = nodeImWorkingOn.rightChild;
					
					// If the parent node cotains no value then I make
					// the right child of the parent node the new node.
					if(nodeImWorkingOn == null)
					{
						parentNode.rightChild = newNode;
						return;
					}
				}
			}
		}			
	}
	// Traverses the tree in order printing the root node in the middle.
	public void inOrderTraversal(EmployeeInfoNode nodeImWorkingOn)
	{
		// As longs as this node contains something.
		if(nodeImWorkingOn != null)
		{
			inOrderTraversal(nodeImWorkingOn.leftChild);
			System.out.println(nodeImWorkingOn);	
			inOrderTraversal(nodeImWorkingOn.rightChild);
		}
	}
	// Traverses the tree putting the root node as the first node.
	public void preOrderTraversal(EmployeeInfoNode nodeImWorkingOn)
	{
		// As long as this node contains something
		if(nodeImWorkingOn != null)
		{
			System.out.println(nodeImWorkingOn);
			inOrderTraversal(nodeImWorkingOn.leftChild);
			inOrderTraversal(nodeImWorkingOn.rightChild);
		}
	}
	// Traverses the tree with the root node being at the end.
	public void postOrderTraversal(EmployeeInfoNode nodeImWorkingOn)
	{
		// As long as this node contains something
		if(nodeImWorkingOn != null)
		{
			inOrderTraversal(nodeImWorkingOn.leftChild);
			inOrderTraversal(nodeImWorkingOn.rightChild);
			System.out.println(nodeImWorkingOn);
		}
	}
	@SuppressWarnings("unused")
	// This method takes an Employee IDnumber as an argument and searches the tree of nodes for the name
	// attached to this IDnumber.
	public EmployeeInfoNode searchForNameAttachedToID(int IDnumber)
	{
		// The node I'm working on always starts at the root.
		EmployeeInfoNode nodeImWorkingOn = root;
		
		// While the IDnumber for this node I'm working on doesn't equal the IDnumber passed into the function, keep going.
		while(nodeImWorkingOn.IDnumber != IDnumber)
		{
			// if the IDnumber is < than IDnumber of the node I'm working on then I'm on the left.
			if(IDnumber < nodeImWorkingOn.IDnumber)
			{
				// The node I'm working on is the left child.
				nodeImWorkingOn = nodeImWorkingOn.leftChild;
			}
			// else I'm on the right.
			else
			{
				// The node I'm working on is the right child.
				nodeImWorkingOn = nodeImWorkingOn.rightChild;
			}
			// If the IDnumber put doesn't match any names in the tree than I give an error.
			if(nodeImWorkingOn == null)
			{
				System.out.println(IDnumber + " doesn't match with an existing employee.");
				return null;
			}
		}
		return nodeImWorkingOn;
	}	
}
