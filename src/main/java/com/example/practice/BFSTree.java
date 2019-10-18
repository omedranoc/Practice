package com.example.practice;

import com.example.practice.domain.BinaryTree;
import com.example.practice.domain.Node;

import java.util.LinkedList;

public class BFSTree {
     //traverse by levels
    public void  applyNormalBFS(BinaryTree binaryTree){
        Node root = binaryTree.getRoot();
        if (root == null)
            return;

        LinkedList<Node> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()){
            Node node = queue.poll();
            System.out.println(node.getKey());
            if (node.getLeft() != null)
                queue.add(node.getLeft());
            if(node.getRight() != null)
                queue.add(node.getRight());
        }
    }



}
