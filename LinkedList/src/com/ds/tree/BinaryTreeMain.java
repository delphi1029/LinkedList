package com.ds.tree;

public class BinaryTreeMain {

	public static void main(String[] args) {
		
		BinaryTree t = new BinaryTree();
		
		TreeNode root = t.create();
		
		t.preOrderTraversal(root);
		
		System.out.println();
		
		t.inOrderTraversal(root);
		
		System.out.println();
		
		t.postOrderTraversal(root);
		
	}

}
