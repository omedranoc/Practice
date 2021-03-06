package com.example.practice.aws;

public class Height {

    public int height(Node root) {
            int leftHeight = 0;
            int rightHeight = 0;

        if(root.left != null)
            leftHeight = 1 + height(root.left);
        if(root.right != null)
            rightHeight = 1 + height(root.right);
        return leftHeight>rightHeight?leftHeight: rightHeight;
    }

}
