package com.elite.leetcode;

/**
 * 两个数相加的算法：
 *  给定的一个增顺序的数据集，找到两个数，使他们的和为定值。已知有且只有一个解。
 *
 *
 */
public class TwoNumAdd {

    public static void main(String[] args) {

        Integer[] nums = {2,7,15,17};
        Integer target = 17;
        Integer[] result = twoNumSum(nums,target);
        for( int i = 0; i < result.length;i++)
            System.out.println(result[i]);

    }
    public static Integer[]  twoNumSum(Integer[] nums,Integer target){
        //使用双指针的思想
        Integer first = 0,last = nums.length -1 ,sum;
        while( first < last){
             sum = nums[first] + nums[last];
            if(sum == target) break;
            if( sum < target) first ++;
            else
                last --;
        }
        return new Integer[]{first+1,last+1};
    }


}
