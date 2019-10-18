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
        deepSearch.add(node.getKey());
        preorder(node.getLeft());
        preorder(node.getRight());

    }
    public void inOrder(Node node){
        if (node == null)
            return;
        inOrder(node.getLeft());
        System.out.println(node.getKey());
        deepSearch.add(node.getKey());
        inOrder(node.getRight());
    }
    public void cc(Node node){
        if (node == null)
            return;
        inOrder(node.getLeft());
        inOrder(node.getRight());
        System.out.println(node.getKey());
        deepSearch.add(node.getKey());
    }



}
