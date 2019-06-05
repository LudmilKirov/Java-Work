package ex12;

public class Node {

    private int flag;
    private int value;
    private Node left;
    private Node right;


    public Node(int value) {

        this.value = value;
        this.right = null;
        this.left = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void insert(Node node, int value) {

        //If the value is bellow root value,goes to left
        if (value < node.value) {
            //if it is not empty,goes and check the left value and root value
            if (node.left != null) {
                insert(node.left, value);
            }
            //If it is empty add the value
            else {
                System.out.println("  Insert " + value + " to left of  " + node.value);
                //Add to the left of the current node
                node.left = new Node(value);
            }
        }
        //If the value is bigger that the root value,goes to right
        else if (value > node.value) {
            //If there is right value go and check the new value with the above value
            if (node.right != null) {
                insert(node.right, value);
            }
            else {
                 //Add to the right of the current node
                System.out.println("  Insert " + value + " to right of " + node.value);
                node.right = new Node(value);
            }
        }
    }

    //Goes to the most right value
    public  int largest(Node rootNode) {
        if (rootNode.right != null) {
            return largest(rootNode.right);
        }
        return rootNode.value;
    }



    public  int findSecondLargest(Node rootNode) {

        if (rootNode == null) {
            System.out.println("Need at least two elements for direction to find second largest");
            return 0;
        }
       //Currently at the largest.So if the largest have left
        // direction the second largest is the largest of the left direction
        if ((rootNode.left != null) && (rootNode.right == null)) {
            return largest(rootNode.left);
        }
        //  If there is one more element to the right,the current is the second biggest
        if (rootNode.right != null && rootNode.right.left == null && rootNode.right.right == null) {
            return rootNode.value;
        }
      //If there is more than one element to the right,step to the right
        return findSecondLargest(rootNode.right);
    }

    @Override
    public String toString() {

            //If there is only left direction
            if (right == null) {
                return "Node{" +
                        "secondlargest=" + findSecondLargest(left) +
                        '}';
            }

            return "Node{" +
                    "secondlargest=" + findSecondLargest(right) +
                    '}';
        }

    }
