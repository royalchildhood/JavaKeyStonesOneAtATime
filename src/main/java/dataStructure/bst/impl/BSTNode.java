package dataStructure.bst.impl;

public class BSTNode
{
    public int value;
    public BSTNode right;
    public BSTNode left;
    public BSTNode parent;

    public BSTNode(int value)
    {
        this.value = value;
    }
}