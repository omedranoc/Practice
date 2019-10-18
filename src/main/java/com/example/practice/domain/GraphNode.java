package com.example.practice.domain;

import lombok.Data;

import java.util.List;

@Data
public class GraphNode {
    private int vertexId;
    List<Node> nodes;
}
