/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author ChxxxXL
 */
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {2, 8, 2, 6, 0, 1, 5, 4, 8};
        binTree tree = new binTree();
        for (int i:a)
            tree.insertByAsc(i);
        tree.traversal();
    } 
}

class binTree <Item extends Comparable>
{
    public Node root;      //二叉树头结点
    public binTree(Item e) {
        root = new Node(e);
    }
    public binTree() { }
    public void insertByAsc(Item e) {      //升序插入
        if (root == null){
            root = new Node(e);
            return;
        }
        Node ref = root;
        while (true) {
            if (e.compareTo(ref.elem) != 1) {
                if (ref.leftSubTree == null) {                 
                    ref.leftSubTree = new Node(e);
                    break;
                }else 
                    ref = ref.leftSubTree;
            }else if (1 == e.compareTo(ref.elem)){
                if (ref.rightSubTree == null){
                    ref.rightSubTree = new Node(e);
                    break;
                }else
                    ref = ref.rightSubTree;
            }
        }
    }
    
    public void travesal(Node ref){     //中序遍历
        if (ref.leftSubTree != null)
            this.travesal(ref.leftSubTree);      
        ref.display();      //打印节点内容
        if (ref.rightSubTree != null)
            this.travesal(ref.rightSubTree);
    }
    
    public void traversal(){
        travesal(root);
    }
}

 class Node <Item>         //树节点
{
    public Item elem;       //节点元素
    public Node leftSubTree;       //左子树
    public Node rightSubTree;      //右子树
    public Node(Item e, Node l, Node r){
        elem = e;
        leftSubTree = l;
        rightSubTree = r;
    }
    public Node(Item e){ elem = e; }
    public Node(){}
    public void display(){
        System.out.println(this.elem);
    }
}

class DataType
{
    
}