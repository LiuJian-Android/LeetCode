package com.liujian.leetcode;

import java.util.Scanner;

/**
 * Created by Liujian on 2019/1/23
 */
public class LastestWordLength {

//    给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
//
//    如果不存在最后一个单词，请返回 0 。
//
//    说明：一个单词是指由字母组成，但不包含任何空格的字符串。
//
//    示例:
//
//    输入: "Hello World"
//    输出: 5


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("一个仅包含大小写字母和空格 ' ' 的字符串");
        String words = sc.nextLine();

        int wordLength = lengthOfLastWord(words);
        System.out.print(wordLength);
    }

    public static int lengthOfLastWord(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }
        String[] sArray = s.split(" ");
        if (sArray == null || sArray.length == 0) {
            return 0;
        } else {
            String temp = sArray[sArray.length - 1];
            return temp.length();
        }
    }
}
