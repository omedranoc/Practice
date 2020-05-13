package com.example.practice;

import com.example.practice.domain.Node;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class DFS {
    private List deepSearch = new ArrayList();
    public void preorder(Node node){
        if (node == null)
            return;
        System.out.println(node.getKey());
        preorder(node.getLeft());
        preorder(node.getRight());

    }
    public void inOrder(Node node){
        if (node == null)
            return;
        inOrder(node.getLeft());
        System.out.println(node.getKey());
        inOrder(node.getRight());
    }
    public void postOrder(Node node){
        if (node == null)
            return;
        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.println(node.getKey());

    }



}
