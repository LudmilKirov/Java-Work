package ex12;



import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Node tree = new Node(2);

        int[] items = {3,4,22,11,99,0};
       for (int i : items)
            tree.insert(tree,i);

           System.out.println(tree);


    }
}
