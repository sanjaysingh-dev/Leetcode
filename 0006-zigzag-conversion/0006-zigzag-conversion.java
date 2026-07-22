class Solution {
    public String convert(String s, int numRows) {

        if(numRows>s.length() || numRows==1)
         return s;

        StringBuilder row[] = new StringBuilder[numRows];

        for(int i=0;i<numRows;i++)
         row[i] = new StringBuilder();

        int currRow = 0;
        boolean gDown = true;

        for(int i=0;i<s.length();i++){

            row[currRow].append(s.charAt(i));

            if(currRow==0)
             gDown = true;

            else if(currRow == numRows-1)
              gDown = false;

            currRow+=(gDown==true)?1:-1;  
        } 

    StringBuilder sb = new StringBuilder();

    for(int i=0;i<numRows;i++)
     sb.append(row[i]);

     return sb.toString();
        
    }
}