class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> visitedT = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char curS = s.charAt(i);
            char curT = t.charAt(i);

            // Finding the old character of T that maps to current character of S.
            Character oldT = map.put(curS, curT);

            if (oldT == null) {
                // Since the current char of S does not map to any older char of T, try adding
                // curT to the visitedT set to verify if curT is already seen before or not.
                if (!visitedT.add(curT)) {
                    return false;
                }
            } else if (!oldT.equals(curT)) {
                return false;
            }
        }

        return true;
    }
}
