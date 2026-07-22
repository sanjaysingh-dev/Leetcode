class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {

        StringBuilder sb = new StringBuilder();

        int i=0;

        while(i<s.length()){

            boolean rcheck = false;

            for(int j=0;j<indices.length;j++){
                if(i==indices[j] && s.startsWith(sources[j],i)){
                    sb.append(targets[j]);
                    i+=sources[j].length();
                    rcheck=true;
                    break;
                }
            }

            if(rcheck==false){
                sb.append(s.charAt(i));
                i++;
            }
        }  

        return sb.toString();
        
    }
}