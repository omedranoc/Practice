package com.example.practice.domain;

import lombok.Data;

@Data
public class Node {
    private String Key;
    private Node left;
    private Node right;
}
