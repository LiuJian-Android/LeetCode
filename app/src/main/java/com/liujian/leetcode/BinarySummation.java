package com.liujian.leetcode;

/**
 * Created by Liujian on 2019/1/30
 */
public class BinarySummation {


//    给定两个二进制字符串，返回他们的和（用二进制表示）。
//
//    输入为非空字符串且只包含数字 1 和 0。
//
//    示例 1:
//
//    输入: a = "11", b = "1"
//    输出: "100"
//    示例 2:
//
//    输入: a = "1010", b = "1011"
//    输出: "10101"

    public static void main(String[] args) {


    }


    public String addBinary(String a, String b) {


        if (a == null || b == null) {
            return null;
        }

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }

            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            sb.append(sum % 2);
            carry = sum / 2;
        }

        if(carry != 0){
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}
