package com.rohit.dataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



class LevelOrderBinaryTree {
	private LevelOrderBinaryTree left;
	private LevelOrderBinaryTree right;
	private Integer data;
	
	public LevelOrderBinaryTree() {
	}

	public LevelOrderBinaryTree(Integer data) {
		this.data=data;
		this.right=null;
		this.left=null;
	}

	/*
	 * Insertion algo with no return type. this can be improved.
	 */
	public void  insert(LevelOrderBinaryTree head,Integer data){
		
		if(data<head.data && head.left==null){
			head.left= new LevelOrderBinaryTree(data);
			return;
		}
		if(data>head.data && head.right==null){
			head.right = new LevelOrderBinaryTree(data);
			return;
		}
		if(data<head.data){
			insert(head.left,data);
		}
		if(data>head.data){
			insert(head.right,data);
		}
			
	}
	
	/*
	 * 
	 */
	public LevelOrderBinaryTree insert2(LevelOrderBinaryTree head, Integer data){
		
		//base condition
		if(head==null){
			return new LevelOrderBinaryTree(data);
		}
		if(data <head.data){
			head.left = insert2(head.left, data);
		}else{
			head.right = insert2(head.right, data);
		}
		
		/*this will return the head node, which is passed to this function in main
		 * this will retain is head value while backtrcking.
		 */
		
		return head;
	}
	
	/*
	 * Print the tree in level order.
	 */
	public void inorder(LevelOrderBinaryTree head){
		if(head==null){
			return;
		}
		else{
			inorder(head.left);
			System.out.println("Data:"+head.data);
			inorder(head.right);
		}
		return;
	}
	
	// 2xW==1Xk
	
	public void levelOrderTraverser(LevelOrderBinaryTree head){
		
		Queue<LevelOrderBinaryTree> level = new LinkedList<LevelOrderBinaryTree>();
		level.add(head);
		while(!level.isEmpty()){
			if(level.peek().left!=null)
				level.add(level.peek().left);
			if(level.peek().right!=null)
				level.add(level.peek().right);
			System.out.println(level.peek().data);
			level.poll();
		}
	}

	public static void main(String[] args) {
		
		LevelOrderBinaryTree head = new LevelOrderBinaryTree(70);
		head.insert(head, 50);
		head.insert(head, 90);
		head.insert(head, 80);
		head.insert(head, 20);
		head.insert(head, 30);
		head.insert(head, 40);
		head.insert(head, 80);
		head.insert(head, 95);
		System.out.println("Insertion is done");
		
		System.out.println("In Order");
		head.inorder(head);
		
		
		System.out.println("Level Order Print");
		head.levelOrderTraverser(head);
		
		
		
		System.out.println("Next Tree");
		LevelOrderBinaryTree head2 = new LevelOrderBinaryTree(70);
		head2.insert(head2, 50);
		head2.insert(head2, 90);
		head2.insert(head2, 80);
		head2.insert(head2, 20);
		head2.insert(head2, 30);
		head2.insert(head2, 40);
		head2.insert(head2, 80);
		head2.insert(head2, 95);
		
		System.out.println("Level Order ");
		head2.levelOrderTraverser(head2);


	}

}
