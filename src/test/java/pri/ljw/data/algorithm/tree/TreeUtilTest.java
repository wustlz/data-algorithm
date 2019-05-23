package pri.ljw.data.algorithm.tree;

import org.junit.Test;

import java.util.List;

public class TreeUtilTest {

    private TreeUtil treeUtil = new TreeUtil();

    @Test
    public void traversal() {
        TreeNode root = init();
        List<TreeNode> pre_result = treeUtil.traversal(root, 1);
        List<TreeNode> in_result = treeUtil.traversal(root, 2);
        List<TreeNode> back_result = treeUtil.traversal(root, 3);
        System.out.println(treeUtil.printTreeNodeValue(pre_result));
        System.out.println(treeUtil.printTreeNodeValue(in_result));
        System.out.println(treeUtil.printTreeNodeValue(back_result));
    }


    private TreeNode init() {
        TreeNode c = new TreeNode("C", null, null);
        TreeNode d = new TreeNode("D", null, null);
        TreeNode f = new TreeNode("F", null, null);
        TreeNode g = new TreeNode("G", null, null);

        TreeNode b = new TreeNode("B", c, d);
        TreeNode e = new TreeNode("E", f, g);

        TreeNode root = new TreeNode("A", b, e);

        return root;
    }
}
