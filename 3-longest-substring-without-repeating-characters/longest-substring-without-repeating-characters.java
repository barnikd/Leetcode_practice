class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;

        for (int i = 0; i < s.length(); i++) {
            String seen = "";

            for (int j = i; j < s.length(); j++) {

                if (seen.indexOf(s.charAt(j)) != -1) {
                    break;
                }

                seen += s.charAt(j);

                longest = Math.max(longest, seen.length());
            }
        }

        return longest;
    }
}