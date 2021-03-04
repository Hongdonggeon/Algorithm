package Chapter10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

 class Node1 {
	int data;
	LinkedList<Node1> adj;
	boolean marked;
	
	public Node1(int data) {
		this.data=data;
		adj = new LinkedList<Node1>();
		this.marked = false;
	}
}

class Graph1{
	Node1[] nodes;
	
	public Graph1(int size) {
		nodes = new Node1[size];
		for (int i = 1; i <size+1 ; i++) {
			nodes[i-1] = new Node1(i);
		}
	}
	
	void addEdge(int idx1, int idx2) {
		Node1 n1 = nodes[idx1];
		Node1 n2 = nodes[idx2];
		if(!n1.adj.contains(n2))
			n1.adj.add(n2);
		if(!n2.adj.contains(n1))
			n2.adj.add(n1);
	}
	
	void visit(Node1 n) {
		System.out.print(n.data+" ");
	}
	
	void bfs(int index) {
		Node1 root = nodes[index];
		Queue<Node1> queue = new LinkedList<Node1>();
		queue.offer(root);
		root.marked = true;
		
		while(!queue.isEmpty()) {
			Node1 r =queue.poll();
			for(Node1 n : r.adj) {
				if(n.marked == false) {
					n.marked = true;
					queue.offer(n);
				}
			}
			visit(r);
		}
	}
	
	void dfs(int index) {
		Node1 root = nodes[index];
		Stack<Node1> stk = new Stack<Node1>();
		stk.push(root);
		root.marked = true;
		while(!stk.isEmpty()) {
			Node1 r = stk.pop();
			for(Node1 n : r.adj) {
				if(n.marked == false) {
					n.marked = true;
					stk.push(n);
				}
			}
			visit(r);
		}
	}
}


public class Test {
	public static void main(String[] args) {
		Graph1 g = new Graph1(9);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 5);
		g.addEdge(3, 4);
		g.addEdge(4, 5);
		g.addEdge(4, 6);
		g.addEdge(6, 7);
		g.addEdge(6, 8);
		g.addEdge(7, 8);
		g.dfs(0);
	}
}
