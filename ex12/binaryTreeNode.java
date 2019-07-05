package ex12;

public class binaryTreeNode {

    private int value;
    private binaryTreeNode left;
    private binaryTreeNode right;


    public binaryTreeNode(int value) {

        this.value = value;
        this.right = null;
        this.left = null;
    }

    //Getters and setters
    private int getValue() {
        return value;
    }

    private void setValue(int value) {
        this.value = value;
    }

    private binaryTreeNode getLeft() {
        return left;
    }

    private void setLeft(binaryTreeNode left) {
        this.left = left;
    }

    private binaryTreeNode getRight() {
        return right;
    }

    private void setRight(binaryTreeNode right) {
        this.right = right;
    }

    private void insert(binaryTreeNode node, int value) {

        //If the value is bellow root value,goes to left
        if (value < node.value) {
            //if it is not empty,goes and check
            // the left value and root value
            if (node.left != null) {
                insert(node.left, value);
            }
            //If it is empty add the value
            else {
                System.out.println("  Insert " + value + " to left of  " + node.value);
                //Add to the left of the current node
                node.left = new binaryTreeNode(value);
            }
        }
        //If the value is bigger that the root value,goes to right
        else if (value > node.value) {
            //If there is right value go and check
            // the new value with the above value
            if (node.right != null) {
                insert(node.right, value);
            }
            else {
                //Add to the right of the current node
                System.out.println("  Insert " + value + " to right of " + node.value);
                node.right = new binaryTreeNode(value);
            }
        }
    }

    //Goes to the most right value
    public int biggest(binaryTreeNode rootNode) {
        if (rootNode.right != null) {
            return biggest(rootNode.right);
        }
        return rootNode.value;
    }

    public int findSecondBiggest(binaryTreeNode rootNode) {

        if (rootNode == null) {
            System.out.println("Need at least two elements for direction to find second largest");
            return 0;
        }
        //Currently at the largest.
        // So if the largest have left
        // direction the second largest
        // is the largest of the left direction
        if ((rootNode.left != null) && (rootNode.right == null)) {
            return biggest(rootNode.left);
        }
        //  If there is one more element to
        //  the right,the current is the second biggest
        if (rootNode.right != null
                && rootNode.right.left == null
                && rootNode.right.right == null) {
            return rootNode.value;
        }
        //If there is more than one element
        // to the right,step to the right
        return findSecondBiggest(rootNode.right);
    }

    @Override
    public String toString() {

        //If there is only left direction
        if (right == null) {
            return "Node{" +
                    "secondlargest=" + findSecondBiggest(left) +
                    '}';
        }

        return "Node{" +
                "secondlargest=" + findSecondBiggest(right) +
                '}';
    }

}
