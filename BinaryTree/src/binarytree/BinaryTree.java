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

class binTree
{
    public Node head;      //二叉树头结点
    public binTree(int e)
    {
        head = new Node(e);
    }
    public binTree()
    {
       
    }
    public void insertByAsc(int e)      //升序插入
    {
        if (head == null)
        {
            head = new Node(e);
            return;
        }
        Node ref = head;
        while (true)
        {
            if (e <= ref.elem)
            {
                if (ref.leftSubTree == null)
                {
                    ref.insertAsLeft(e);
                    break;
                }
                else 
                    ref = ref.leftSubTree;
            }
            else if (e > ref.elem)
            {
                if (ref.rightSubTree == null)
                {
                    ref.insertAsRight(e);
                    break;
                }
                else
                    ref = ref.rightSubTree;
            }
        }
    }
    
    public void travesal(Node ref)     //中序遍历
    {
        if (ref.leftSubTree != null)
            this.travesal(ref.leftSubTree);      
         System.out.println(ref.elem);      //打印节点内容
        if (ref.rightSubTree != null)
            this.travesal(ref.rightSubTree);
        
    }
    public void traversal()
    {
        travesal(head);
    }
}

class Node          //树节点
{
    public int elem;       //节点元素
    public Node leftSubTree;       //左子树
    public Node rightSubTree;      //右子树
    public Node(int e, Node l, Node r)
    {
        elem = e;
        leftSubTree = l;
        rightSubTree = r;
    }
    public Node(int e)
    {
        elem = e;
    }
    public Node()
    {
        elem = 0;
    }
    public void insertAsLeft(Node l)        //作为当前节点的左子树插入
    {
        leftSubTree = l;
    }
    public void insertAsLeft(int e)         //作为当前节点的左子树插入
    {
        leftSubTree = new Node(e);
    }
    public void insertAsRight(Node r)       //作为当前节点的右子树插入
    {
        rightSubTree = r;
    }
    public void insertAsRight(int e)       //作为当前节点的右子树插入
    {
        rightSubTree = new Node(e);
    }
    
}
