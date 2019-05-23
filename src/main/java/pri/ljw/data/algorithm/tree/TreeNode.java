package pri.ljw.data.algorithm.tree;

/**
 * @ClassName: TreeNode
 * @Description: 树节点对象
 * @Author: liaojinwei
 * @Date: 2019/5/22 12:37
 * @Version: v1.0.0
 **/
public class TreeNode {

    /**
     * 值
     */
    private Object value;

    /**
     * 左节点
     */
    private TreeNode leftNode;

    /**
     * 右节点
     */
    private TreeNode rightNode;

    public TreeNode(Object value, TreeNode leftNode, TreeNode rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public TreeNode() {
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public TreeNode getLeftTreeNode() {
        return leftNode;
    }

    public void setLeftTreeNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightTreeNode() {
        return rightNode;
    }

    public void setRightTreeNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
