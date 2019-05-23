package pri.ljw.data.algorithm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName: TreeUtil
 * @Description: 树操作方法
 * @Author: liaojinwei
 * @Date: 2019/5/23 10:10
 * @Version: v1.0.0
 **/
public class TreeUtil {

    /**
     * 树遍历
     * @param root - 根节点
     * @param traversalType - 遍历类型, 1-前序，2-中序，3-后序
     * @return
     */
    public List<TreeNode> traversal(TreeNode root, int traversalType) {
        List<TreeNode> result = new ArrayList<TreeNode>();
        if (null != root) {
            if (1 == traversalType) {
                dlr(root, result);
            } else if (2 == traversalType) {
                // 先 左节点
                ldr(root.getLeftTreeNode(), result);
                // 再 根节点
                result.add(root);
                // 最后右节点
                ldr(root.getRightTreeNode(), result);
            } else if (3 == traversalType) {
                lrd(root, result);
            }
        }
        return result;
    }

    /**
     * 返回TreeNode集合的value值
     * @param treeNodes
     * @return
     */
    public String printTreeNodeValue(List<TreeNode> treeNodes) {
        String result = "";
        for (TreeNode treeNode : treeNodes) {
            result += treeNode.getValue().toString() + ", ";
        }
        result = result.substring(0, result.lastIndexOf(","));
        return result;
    }

    /**
     * 前序遍历
     * @param root
     * @param result
     */
    private void dlr(TreeNode root, List<TreeNode> result) {
        if (root != null) {
            // 先 根节点
            result.add(root);
            // 再 左节点
            dlr(root.getLeftTreeNode(), result);
            // 最后 右节点
            dlr(root.getRightTreeNode(), result);
        }
    }

    /**
     * 中序遍历
     * @param root
     * @param result
     */
    private void ldr(TreeNode root, List<TreeNode> result) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (null != root || !stack.empty()) {
            // 先将节点及其左子节点压入栈
            while (null != root) {
                stack.push(root);
                root = root.getLeftTreeNode();
            }
            // 当前节点及其左子节点入栈后，依次弹出，并压入其右子节点
            root = stack.pop();
            result.add(root);
            root = root.getRightTreeNode();
        }
    }

    /**
     * 后序遍历
     * @param root
     * @param result
     */
    private void lrd(TreeNode root, List<TreeNode> result) {
        if (root != null) {
            // 先 左节点
            lrd(root.getLeftTreeNode(), result);
            // 再 右节点
            lrd(root.getRightTreeNode(), result);
            // 最后 根节点
            result.add(root);
        }
    }

}
