/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.
*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> resultSet=new HashSet<>();
        boolean[] boolArr=new boolean[1001];
        
        for(int i : nums2){
            boolArr[i] = true;
        }
        
        for(int i : nums1){
            if(boolArr[i])
                resultSet.add(i);
        }
        
        Iterator<Integer> iterator = resultSet.iterator();
        int[] resultArr = new int[resultSet.size()];
        int i = 0;
        while(iterator.hasNext()){
            resultArr[i++]=iterator.next();
        }
        return resultArr;
        
    }
}
