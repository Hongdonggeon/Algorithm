package Chapter10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
	int data;
	LinkedList<Node> adjacent; // 인접한 노드들과의 관계 링크드 리스트에 나열
	boolean marked; // 방문했는지 마킹하는 플래그

	Node(int data) {
		this.data = data;
		this.marked = false;
		adjacent = new LinkedList<Node>();
	}
}

class Graph {
	Node[] nodes; // 노드들을 저장할 배열

	Graph(int size) {
		nodes = new Node[size];
		for (int i = 0; i < size; i++) {
			nodes[i] = new Node(i);
		}
	}

	void addEdge(int i1, int i2) { // 두 노드에 관계를 저장하는 함수
		Node n1 = nodes[i1];
		Node n2 = nodes[i2];

		// 두개의 노드에 인접한 노드를 저장한 리스트에 상대방 있는지 확인하고 없으면 서로 연결
		if (!n1.adjacent.contains(n2))
			n1.adjacent.add(n2);
		if (!n2.adjacent.contains(n1))
			n1.adjacent.add(n1);

	}

//	void dfs() {
//		dfs(0);
//	}
//
//	void dfs(int index) {
//		Node root = nodes[index];
//		Stack<Node> stack = new Stack<Node>();
//		stack.push(root);
//		root.marked = true;
//		while (!stack.isEmpty()) {
//			Node r = stack.pop();
//			for (Node n : r.adjacent) {
//				if (n.marked == false) {
//					n.marked = true;
//					stack.push(n);
//				}
//			}
//			visit(r);
//		}
//	}

	

	void bfs(int index) {
		Node root = nodes[index];
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		root.marked = true;
		while (!queue.isEmpty()) {
			Node r = queue.poll();
			for (Node n : r.adjacent) {
				if (n.marked == false) {
					n.marked = true;
					queue.offer(n);
				}
			}
			visit(r);
		}
	}
	void bfs() {
		bfs(0);
	}

//	void dfsR(Node r) {
//		if (r == null)
//			return;
//		r.marked = true;
//		visit(r);
//		for (Node n : r.adjacent) {
//			if (n.marked == false) {
//				dfsR(n);
//			}
//		}
//	}
//
//	void dfsR(int index) {
//		Node r = nodes[index];
//		dfsR(r);
//	}
//
//	void dfsR() {
//		dfsR(0);
//	}

	void visit(Node n) {
		System.out.print(n.data + " ");
	}

}

public class Practice {
	public static void main(String[] args) {
		Graph g = new Graph(9);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.addEdge(5, 6);
		g.addEdge(5, 7);
		g.addEdge(6, 8);
		g.bfs();

	}
}
