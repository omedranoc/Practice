package com.example.practice

import com.example.practice.domain.BinaryTree
import com.example.practice.domain.Node
import spock.lang.Specification

// Going deep before moving up
//three different types:
//  preorder: node is process before the left and right children to be traversal
//  postorder node is process after the children
//  inorder: left process first
// Implemented with recursion, base case is when it is nulll
class DFSTest extends Specification {

    DFS dfs = new DFS()

    def "aply the preorder depth first search algorithm"(){
        given:
        Node left = new Node(key: "4", left: new Node(key: "5"));
        Node root = new Node(key: "1", left: new Node(key: "2", left: left),
                right: new Node(key:"3"))
        BinaryTree binaryTree = new BinaryTree(root: root )

        when:
        dfs.preorder(binaryTree.root)

        then:
        print dfs.getDeepSearch()
    }

    def "apply the in-order depth first search algorithm"(){
        given:
        Node left = new Node(key: "4", left: new Node(key: "5"));
        Node root = new Node(key: "1", left: new Node(key: "2", left: left),
                right: new Node(key:"3"))
        BinaryTree binaryTree = new BinaryTree(root: root )

        when:
        dfs.inOrder(binaryTree.root)

        then:
        print dfs.getDeepSearch()
    }

    def "apply the post-order depth first search algorithm"(){
        given:
        Node left = new Node(key: "4", left: new Node(key: "5"));
        Node root = new Node(key: "1", left: new Node(key: "2", left: left),
                right: new Node(key:"3"))
        BinaryTree binaryTree = new BinaryTree(root: root )

        when:
        dfs.postOrder(binaryTree.root)

        then:
        print dfs.getDeepSearch()
    }


}
