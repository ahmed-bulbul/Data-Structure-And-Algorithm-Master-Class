package tutorials.tree;

import java.util.ArrayList;

public class TreeNode {

    String data;

    ArrayList<TreeNode> children;

    public TreeNode(String data){
        this.data=data;
        this.children = new ArrayList<TreeNode>();
    }

    public void addChild(TreeNode node){
        this.children.add(node);
    }

    public String print(int level){
        String ret;
        ret =" ".repeat(level)+data+"\n";
       // System.out.println("ret : "+ret);
        for(TreeNode node : this.children){
            ret +=node.print(level+1);
        }
        return ret;
    }

}
