package practise.a20200220;

import java.util.ArrayList;
import java.util.List;

/**
 * @author malu
 * @description: leetcode-22
 * @date 2020/2/2021:03
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> resList = new ArrayList<>();
        if (n == 0) {
            return resList;
        }
        dfs("", n, n, resList);
        return resList;
    }

    /**
     * 二叉树的深度遍历
     *
     * @param curStr  当前递归得到的字符串
     * @param left    左括号剩余个数
     * @param right   右括号剩余个数
     * @param resList 结果集
     */
    private void dfs(String curStr, int left, int right, List<String> resList) {
        //当左右括号剩余都为0的时候添加到结果集
        if (left == 0 && right == 0) {
            resList.add(curStr);
            return;
        }
        //左括号数剩余数量大于右括号数说明右括号早于左括号放入，排除掉
        if (left > right) {
            return;
        }
        //递归遍历左子树
        if (left > 0) {
            dfs(curStr + '(', left - 1, right, resList);
        }
        //递归遍历右子树
        if (right > 0) {
            dfs(curStr + ')', left, right - 1, resList);
        }

    }

    public static void main(String[] args) {
        System.out.println(new GenerateParenthesis().generateParenthesis(3));
    }
}