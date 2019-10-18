package com.example.practice

import com.example.practice.domain.BinaryTree
import com.example.practice.domain.Node
import spock.lang.Specification

class BFSTreeTest extends Specification {

    BFSTree bfsTree = new BFSTree()

    def "print root level"(){
        given:
        Node left = new Node(key: "4", left: new Node(key: "5"));
        Node root = new Node(key: "1", left: new Node(key: "2", left: left),
                right: new Node(key:"3"))
         BinaryTree binaryTree = new BinaryTree(root: root )

        when:
        bfsTree.applyNormalBFS(binaryTree)

        then:
        1 == 1
    }
}
