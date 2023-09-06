class WhichSeason {
    public String solve(int A) {
        if (A < 1 || A > 12)
            return "Invalid";
        if (A >= 3 && A <= 5)
            return "Spring";
        if (A >= 6 && A <= 8)
            return "Summer";
        if (A >= 9 && A <= 11)
            return "Autumn";
        return "Winter";
    }
}
