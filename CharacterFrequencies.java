import java.util.ArrayList;

class CharacterFrequencies {
    public ArrayList<Integer> solve(String A) {
        int[] array = new int[26];
        for (char ch : A.toCharArray())
            array[ch - 97]++;
        ArrayList<Integer> ans = new ArrayList<>();
        for (char ch : A.toCharArray()) {
            if (array[ch - 97] > 0) {
                ans.add(array[ch - 97]);
                array[ch - 97] = 0;
            }
        }
        return ans;
    }
}
