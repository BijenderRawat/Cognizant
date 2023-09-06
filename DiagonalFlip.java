import java.util.ArrayList;

class DiagonalFlip {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            ArrayList<Integer> row = new ArrayList<>();
            int t = 0;
            while (t < A.size()) {
                row.add(A.get(t).get(i));
                t++;
            }
            ans.add(row);
        }
        return ans;
    }
}
