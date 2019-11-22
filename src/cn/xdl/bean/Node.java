package cn.xdl.bean;

public class Node {
    public int iData;            //data item {key}
    public double dData;         //data item
    public Node leftChild;       //this node's left child
    public Node rightChild;      // this node's right child

    public void displayNode(){    // display ourself
        System.out.println("{");
        System.out.println(iData);
        System.out.println(",");
        System.out.println(dData);
        System.out.println("}");
    }
}
