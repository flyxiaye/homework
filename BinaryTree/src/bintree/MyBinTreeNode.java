/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintree;

import java.util.Enumeration;
import java.util.Vector;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

/**
 *
 * @author ChxxxXL
 */
public class MyBinTreeNode extends DefaultMutableTreeNode {

    public static MyBinTreeNode root;

    public MyBinTreeNode(double data) {
        this.userObject = data;
        this.children = new Vector(2);
    }

    public MyBinTreeNode getLeftChild() {
        if (this.children.size() > 0) {
            return (MyBinTreeNode) this.children.elementAt(0);
        } else {
            return null;
        }
    }

    public MyBinTreeNode getRightChild() {
        if (this.children.size() > 1) {
            return (MyBinTreeNode) this.children.elementAt(1);
        } else {
            return null;
        }
    }

    public void insertNode(MyBinTreeNode node) {
        if (((Double) node.userObject).compareTo((Double) this.userObject) < 0) {
            if (this.getLeftChild() == null) {
                this.children.setElementAt(node, 0);
                node.parent = this;
            } else {
                this.getLeftChild().insertNode(node);
            }
        } else {
            if (this.getRightChild() == null) {
                this.children.setElementAt(node, 1);
                node.parent = this;
            } else {
                this.getRightChild().insertNode(node);
            }
        }
    }

    @Override
    public TreeNode getChildAt(int childIndex) {
        if (0 == childIndex) {
            return this.getLeftChild();
        } else if (1 == childIndex) {
            return this.getRightChild();
        } else {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    @Override
    public int getChildCount() {
        if (this.getLeftChild() == null && this.getRightChild() == null) {
            return 0;
        } else if (this.getLeftChild() == null || this.getRightChild() == null) {
            return 1;
        } else {
            return 2;
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TreeNode getParent() {
        return this.parent;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getIndex(TreeNode node) {
        if (node == this.getLeftChild()) {
            return 0;
        } else if (node == this.getRightChild()) {
            return 1;
        } else {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    @Override
    public boolean getAllowsChildren() {
        return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isLeaf() {
        if (this.getLeftChild() == null && this.getRightChild() == null) {
            return true;
        } else {
            return false;
        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
