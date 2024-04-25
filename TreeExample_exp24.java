import javax.swing.*;
import javax.swing.tree.*;

public class TreeExample_exp24 extends JFrame {

    public TreeExample_exp24() {
        setTitle("Tree Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create hierarchical data for the tree
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Root");

        // First Root
        DefaultMutableTreeNode root1 = new DefaultMutableTreeNode("Root 1");
        rootNode.add(root1);
        root1.add(new DefaultMutableTreeNode("Branch 1.1"));
        root1.add(new DefaultMutableTreeNode("Branch 1.2"));

        // Second Root
        DefaultMutableTreeNode root2 = new DefaultMutableTreeNode("Root 2");
        rootNode.add(root2);
        root2.add(new DefaultMutableTreeNode("Branch 2.1"));
        root2.add(new DefaultMutableTreeNode("Branch 2.2"));

        // Third Root
        DefaultMutableTreeNode root3 = new DefaultMutableTreeNode("Root 3");
        rootNode.add(root3);
        root3.add(new DefaultMutableTreeNode("Branch 3.1"));
        root3.add(new DefaultMutableTreeNode("Branch 3.2"));

        // Adding leaves
        // Leaf for Branch 1.1
        DefaultMutableTreeNode leaf1_1 = new DefaultMutableTreeNode("Leaf 1.1.1");
        ((DefaultMutableTreeNode) root1.getChildAt(0)).add(leaf1_1);

        // Leaf for Branch 1.2
        DefaultMutableTreeNode leaf1_2 = new DefaultMutableTreeNode("Leaf 1.2.1");
        ((DefaultMutableTreeNode) root1.getChildAt(1)).add(leaf1_2);

        // Leaf for Branch 2.1
        DefaultMutableTreeNode leaf2_1 = new DefaultMutableTreeNode("Leaf 2.1.1");
        ((DefaultMutableTreeNode) root2.getChildAt(0)).add(leaf2_1);

        // Leaf for Branch 2.2
        DefaultMutableTreeNode leaf2_2 = new DefaultMutableTreeNode("Leaf 2.2.1");
        ((DefaultMutableTreeNode) root2.getChildAt(1)).add(leaf2_2);

        // Leaf for Branch 3.1
        DefaultMutableTreeNode leaf3_1 = new DefaultMutableTreeNode("Leaf 3.1.1");
        ((DefaultMutableTreeNode) root3.getChildAt(0)).add(leaf3_1);

        // Leaf for Branch 3.2
        DefaultMutableTreeNode leaf3_2 = new DefaultMutableTreeNode("Leaf 3.2.1");
        ((DefaultMutableTreeNode) root3.getChildAt(1)).add(leaf3_2);

        // Create a JTree with the hierarchical data
        JTree tree = new JTree(rootNode);

        // Expand the tree nodes by default
        tree.expandRow(0);

        // Add the JTree to the frame
        add(new JScrollPane(tree));

        // Set frame size and visibility
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TreeExample_exp24::new);
    }
}
