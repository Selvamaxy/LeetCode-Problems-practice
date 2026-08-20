class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> qu=new PriorityQueue<>();
        for(int n:nums){
            
                qu.add(n);
                if(qu.size()>k)
                    qu.poll();
        }
        return qu.peek();
    }
}