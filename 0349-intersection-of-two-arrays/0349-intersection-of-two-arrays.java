class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int x:nums1)
         map.put(x,map.getOrDefault(x,0)+1);

        for(int x:nums2){
            if(map.containsKey(x) && map.get(x)>0){
                ans.add(x);
                map.put(x,0);
            }
        } 

        int result[] = new int[ans.size()];
        for(int i=0;i<ans.size();i++)
          result[i] = ans.get(i);

          return result;   
    }
}