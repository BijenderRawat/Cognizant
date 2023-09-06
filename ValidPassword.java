class ValidPassword {
    public int solve(String A) {
        if (A.length() < 8 || A.length() > 15)
            return 0;
        boolean isfound = false;
        for (char ch : A.toCharArray()) {
            if ((int) ch >= 48 && (int) ch <= 57) {
                isfound = true;
                break;
            }
        }
        if (!isfound)
            return 0;
        isfound = false;
        for (char ch : A.toCharArray()) {
            if ((int) ch >= 97 && (int) ch <= 122) {
                isfound = true;
                break;
            }
        }
        if (!isfound)
            return 0;
        isfound = false;
        for (char ch : A.toCharArray()) {
            if ((int) ch >= 65 && (int) ch <= 90) {
                isfound = true;
                break;
            }
        }
        if (!isfound)
            return 0;
        isfound = false;
        for (char ch : A.toCharArray()) {
            if ((int) ch == 33 || ((int) ch >= 35 && (int) ch <= 38) || (int) ch == 42 || (int) ch == 64) {
                isfound = true;
                break;
            }
        }
        if (!isfound)
            return 0;
        return 1;
    }
}
