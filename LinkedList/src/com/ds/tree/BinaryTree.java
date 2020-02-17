package com.ds.tree;

public class BinaryTree {
	
	private TreeNode root;
	
	public TreeNode create() {
		
		root = new TreeNode(20);
		TreeNode node1 = new TreeNode(100);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(50);
		TreeNode node4 = new TreeNode(15);
		TreeNode node5 = new TreeNode(250);
		TreeNode node6 = new TreeNode(35);
		TreeNode node7 = new TreeNode(222);
		
		root.left = node1;
		root.right = node2;
		
		node1.left = node3;
		node1.right = node4;
		
		node3.left = node7;
		
		node2.left = node5;
		node2.right = node6;
		
		return root;
	}
	
	public void preOrderTraversal(TreeNode root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.data+" ");
		
		preOrderTraversal(root.left);
		
		preOrderTraversal(root.right);
	}
	
	public void inOrderTraversal(TreeNode root) {
		if(root == null)
			return;
		
		inOrderTraversal(root.left);
		System.out.print(root.data+" ");
		inOrderTraversal(root.right);
	}
	
	public void postOrderTraversal(TreeNode root) {
		if(root == null)
			return;
		
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data+" ");
	}
	
	public void levelOrderTraversal(TreeNode node) {
		
	}
	
	
	
	

}
