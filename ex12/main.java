package ex12;
//Make a program that prints the second
// biggest in Binary search tree
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        //Root value
        binaryTreeNode tree = new binaryTreeNode(2);
        //Array for the tree childs
        int[] items = {3,4,22,11,99,0};
        //Fill the tree
        for (int i : items){
            tree.insert(tree,i);
        }
        //Print the tree second biggest
           System.out.println(tree);
    }
}
