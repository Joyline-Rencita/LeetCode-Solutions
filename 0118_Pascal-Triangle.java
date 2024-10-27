class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows==0)return ans;
        
        List<Integer> row = new ArrayList();
        // Create first row
        row.add(1);
        ans.add(new ArrayList(row));
        row.clear();
        
        int val=0;
        for(int i=1;i<numRows;i++){
            // Create subsequent rows
            for(int j=0;j<=i;j++){
                if(j>0)val+=ans.get(i-1).get(j-1);
                if(j<i)val+=ans.get(i-1).get(j);
                row.add(val);
                val=0;
            }
            ans.add(new ArrayList(row));
            row.clear();
        }
        return ans;
    }
}
