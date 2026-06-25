class Solution {

    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

       if(digits.length()==0)
        return ans; 

        String map[] = {"0","1","abc","def","ghi","jkl","mno",
                        "pqrs", "tuv", "wxyz"};

        StringBuilder curr = new StringBuilder();

        permute(digits,0,curr,map);
        return ans;                
        
    }

    public void permute(String A, int idx, StringBuilder curr, String map[]){

        if(idx == A.length()){
            ans.add(curr.toString());
            return;
        }

        String letter = map[A.charAt(idx)-'0'];

        for(int i=0;i<letter.length();i++){

            curr.append(letter.charAt(i));

            permute(A,idx+1,curr,map);

            curr.deleteCharAt(curr.length()-1);
        }
    }
}