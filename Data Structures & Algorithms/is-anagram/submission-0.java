class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] Count = new int[26];

        for(int i=0; i<s.length(); i++){
            Count[s.charAt(i) - 'a']++;
            Count[t.charAt(i) - 'a']--;
        }

        for(int i=0; i<Count.length; i++){
            if(Count[i] != 0){
                return false;
            }
        }

        return true;

    }
}
