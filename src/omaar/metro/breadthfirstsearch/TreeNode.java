package omaar.metro.breadthfirstsearch;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Omar Raed 
 * 
 * A class that represents a Tree Node wrapper for each Station
 */
public class TreeNode{

    private MetroStation station;
    private TreeNode parent;
    private List<TreeNode> children;

    public TreeNode(MetroStation station) {
        this.station = station;
        this.children = new ArrayList<>();
    }

    public TreeNode(MetroStation station, TreeNode parent) {
        this.station = station;
        this.parent = parent;
        parent.addChild(this);
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        this.children.add(child);
    }

    public MetroStation getStation() {
        return station;
    }

    public TreeNode getParent() {
        return parent;
    }

    public List<TreeNode> getChildren() {
        return children;
    }
}
