package com.example.practice;

import com.example.practice.domain.BinaryTree;
import com.example.practice.domain.Node;

import java.util.*;

public class BFSTree {
     //traverse by levels
    // O time notation depends on the type of structure if it is adjency matrix or if it is an adjancy list.
    public void  applyNormalBFS(BinaryTree binaryTree){
        Node root = binaryTree.getRoot();
        if (root == null)
            return;
        Map so = new HashMap();
        so.put(1,1);
        so.put(2,1);
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        Set valuers = so.entrySet();
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
