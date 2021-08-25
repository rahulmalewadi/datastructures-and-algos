
public class binarytree {
    Node root;
    public void addNode(int key , String name){
        
        // Create a new Node and initialize it

        Node newNode = new Node(key, name);

        // If there is no root this becomes root

        if (root == null){
            root = newNode;
        }else{
          
            // Set root as the Node we will start
			// with as we traverse the tree
          
            Node focusNode = root;
           // Future parent for our new Node
           
            Node parent;
            while (true){
                // root is the top parent so we start
				// there


                parent = focusNode;

                // Check if the new node should go on
				// the left side of the parent node
                if (key < focusNode.key){
                    // Switch focus to the left child


                    focusNode = focusNode.leftchild;
                    // Switch focus to the left child

                    if (focusNode==null){

                        // then place the new node on the left of it
                        parent.leftchild = newNode;
                        return;
                    }
                }else {// If we get here put the node on the right
                    focusNode = focusNode.rightchild;
                    if (focusNode==null){
                        parent.rightchild = newNode;
                        return;
                    }
                }
            }
        }
    }
    // All nodes are visited in ascending order
	// Recursion is used to go to one node and
	// then go to its child nodes and so forth
    public void inOrderTraverseTree(Node focusNode){
        if (focusNode != null){

            // Traverse the left node

            inOrderTraverseTree(focusNode.leftchild);

            // Visit the currently focused on node

            System.out.println(focusNode); 

            // Traverse the right node

            inOrderTraverseTree(focusNode.rightchild);
            
        }
    }

    public void preOrderTraverseTree(Node focusNode){
        
        if (focusNode != null){
            System.out.println(focusNode); 
            inOrderTraverseTree(focusNode.leftchild);
           
            inOrderTraverseTree(focusNode.rightchild);
            
        }
    }

    public void postOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			postOrderTraverseTree(focusNode.leftchild);
			postOrderTraverseTree(focusNode.rightchild);

			System.out.println(focusNode);

		}

	}
    public Node findNode(int key) {

		// Start at the top of the tree

		Node focusNode = root;

		// While we haven't found the Node
		// keep looking

		while (focusNode.key != key) {

			// If we should search to the left

			if (key < focusNode.key) {

				// Shift the focus Node to the left child

				focusNode = focusNode.leftchild;

			} else {

				// Shift the focus Node to the right child

				focusNode = focusNode.rightchild;

			}

			// The node wasn't found

			if (focusNode == null)
				return null;

		}

		return focusNode;

	}
    public static void main(String[] args) {
        binarytree tree1 = new binarytree();
        tree1.addNode(10, "boss");
        tree1.addNode(7, "manager");
        tree1.addNode(14, "senior consultant");
        tree1.addNode(5, "consultant");
        tree1.addNode(13, "intern");

        // Different ways to traverse binary trees

		// theTree.inOrderTraverseTree(tree1.root);

		// theTree.preorderTraverseTree(tree1.root);

		// theTree.postOrderTraverseTree(tree1.root);

		// Find the node with key 10

		System.out.println("\nNode with the key 10");

		System.out.println(tree1.findNode(10));

        //tree1.preOrderTraverseTree(tree1.root);
    }
    


}
class Node {
    int key;
    String name ;
    Node leftchild;
    Node rightchild;


    Node(int key , String name) {
        this.key = key;
        this.name = name;
    }
    public String toString(){
        return name + " has a key " + key;
    }
}
