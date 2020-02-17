package com.catfelts.heapz;

public class Node {
	
	private int data;
	private Node rightChild;
	private Node leftChild;
	private Node parent;
	
	public Node(int data)
	{
		this.data = data;
		rightChild = null;
		leftChild = null;
		parent = null;
	}
	
	public Node(int data, Node leftChild, Node rightChild)
	{
		this.data = data;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		parent = null;
	}
	
	public Node(int data, Node leftChild, Node rightChild, Node parent)
	{
		this.data = data;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.parent = parent;
	}
	
	public boolean isLeaf()
	{
		if(rightChild == null && leftChild == null)
			return true;
		return false;
	}
	
	public int getData()
	{
		return this.data;
	}
	
	public Node getLeftChild()
	{
		return this.leftChild;
	}
	
	public Node getRightChild()
	{
		return this.rightChild;
	}
	
	public Node getParent()
	{
		return this.parent;
	}
	
	public void setData(int data)
	{
		this.data = data;
	}
	
	public void setLeftChild(Node leftChild)
	{
		this.leftChild = leftChild;
	}
	
	public void setRightChild(Node rightChild)
	{
		this.rightChild = rightChild;
	}
	
	public void setParent(Node parent)
	{
		this.parent = parent;
	}
}
