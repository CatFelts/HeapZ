package com.catfelts.heapz;

public abstract class Heap {
	
	private Node root;
	
	public Heap(Node root)
	{
		this.root = root;
	}
	
	public Node getRoot()
	{
		return this.root;
	}
	
	public void setRoot(Node root)
	{
		this.root = root;
	}

	public abstract void insert(Node newNode);
	
	protected abstract void heapify();
	
	protected abstract void remove(Node node);
	
	protected abstract void print();
}
