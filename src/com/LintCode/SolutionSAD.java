package com.LintCode;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

import javax.swing.text.AbstractDocument.LeafElement;

public class SolutionSAD {
	/**
     * This method will be invoked first, you should design your own algorithm 
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TreeNode root) {
        // write your code here'
    	if(root == null) 
    		return "{}";
    	ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
    	queue.add(root);
    	for(int i = 0; i < queue.size(); i++) {
    		if(queue.get(i) != null) {
    			queue.add(queue.get(i).left);
    			queue.add(queue.get(i).right);
    		}
    	}
    	while(queue.get(queue.size() - 1) == null) {	//É¾³ýÄ©Î²µÄnull
    		queue.remove(queue.size() - 1);
    	}
    	StringBuilder s = new StringBuilder();
    	s.append("{");
    	for(int i = 0; i < queue.size(); i++) {
    		TreeNode t = queue.get(i);
    		if(t == null) {								//½«nullÌæ»»Îª# 
    			s.append(",#");
    		}else {
    			if(i != 0) {
    				s.append(",");
    			}
	    		s.append(t.val);
    		}
    	}
    	s.append("}");
    	return s.toString();
    }
    
    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in 
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
    	if(data.equals("{}"))
    		return null;
        // write your code here
    	String str = data.substring(1, data.length() - 1);
    	String[] vals = str.split(",");
    	ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
    	TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
    	queue.add(root);
    	int index = 0;
    	Boolean isLeftChild = true;
    	for(int i = 1; i < vals.length; i++){
    		if(!vals[i].equals("#")){
    			TreeNode t = new TreeNode(Integer.parseInt(vals[i]));
    			queue.add(t);
    			if(isLeftChild) {
    				queue.get(index).left = t;
    			}else {
    				queue.get(index).right = t;
    			}
    		}
    		if(!isLeftChild) {
    			index++;
    		}
    		isLeftChild  = !isLeftChild;
    	}
    	return root;
    }
}
