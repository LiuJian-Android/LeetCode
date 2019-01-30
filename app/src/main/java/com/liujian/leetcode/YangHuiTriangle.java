package com.liujian.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liujian on 2019/1/30
 */
public class YangHuiTriangle {

//    118. 杨辉三角
//    给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
//
//
//
//    在杨辉三角中，每个数是它左上方和右上方的数的和。
//
//    示例:
//
//    输入: 5
//    输出:
//            [
//            [1],
//            [1,1],
//            [1,2,1],
//            [1,3,3,1],
//            [1,4,6,4,1]
//            ]


    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        if (numRows < 1) {
            return result;
        }
        //添加第一行元素
        List<Integer> num1Row = new ArrayList<>();
        num1Row.add(1);
        result.add(num1Row);
        //添加第二行以后
        for (int i = 1; i < numRows; i++) {
            List<Integer> numRow = new ArrayList<>();
            numRow.add(1);
            List<Integer> preNumRow = result.get(i - 1);
            for (int j = 1; j < preNumRow.size(); j++) {
                numRow.add(preNumRow.get(j) + preNumRow.get(j - 1));
            }
            numRow.add(1);
            result.add(numRow);
        }
        return result;
    }
}
