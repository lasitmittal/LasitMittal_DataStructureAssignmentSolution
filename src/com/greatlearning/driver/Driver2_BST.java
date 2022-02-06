package com.greatlearning.driver;
import com.greatlearning.model.BSTree;
import com.greatlearning.model.Node;

public class Driver2_BST {
    public static void main(String[] args) {

    	BSTree bstree = new BSTree();
    	bstree.setRoot(new Node(50));
    	bstree.getRoot().setLeft(new Node(30));
    	bstree.getRoot().setRight(new Node(60));
    	bstree.getRoot().getLeft().setLeft(new Node(10));
    	bstree.getRoot().getRight().setLeft(new Node(55));

    	bstree.convertToRST2(bstree.getRoot());
    	bstree.print(bstree.getSkewRoot());
    }
}