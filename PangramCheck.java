import java.util.ArrayList;

class PangramCheck {
    public int solve(ArrayList<String> A) {
        int[] ch = new int[26];
        for (String s : A)
            for (char c : s.toCharArray())
                ch[c - 97]++;
        for (int i : ch)
            if (i == 0)
                return 0;
        return 1;
    }
}
