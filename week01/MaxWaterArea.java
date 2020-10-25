package org.leetcode.question.week01;

//[11]给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i,
//ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
//
// 说明：你不能倾斜容器，且 n 的值至少为 2。
//
//
//
//
//
// 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
//
//
//
// 示例：
//
// 输入：[1,8,6,2,5,4,8,3,7]
//输出：49
public class MaxWaterArea {
    public int maxArea(int[] heights) {
        int maxArea = 0 ;
        for(int i = 0 , j = heights.length -1 ; i < j ;){

            int ii = heights[i] ;
            int jj = heights[j];
            maxArea = (heights[i] < heights[j] ?
                    Math.max(maxArea,(j - i ) * heights[i++]):
                    Math.max(maxArea,(j - i ) * heights[j--])
                    );
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = new int[]{1,8,6,2,5,4,8,3,7 };
        int area = new MaxWaterArea().maxArea(heights);
        System.out.println(area);




    }
}