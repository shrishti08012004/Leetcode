// class Solution {
//     public int firstUniqChar(String s) {
//         int[] freq = new int[26];

//         // Step 1: Count frequency
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             int idx = ch - 'a';   // correct way
//             freq[idx]++;
//         }

//         // Step 2: Find first unique character
//         for (int i = 0; i < s.length(); i++) {
//             if (freq[s.charAt(i) - 'a'] == 1) {
//                 return i;
//             }
//         }

//         return -1;
//     }
// }


class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find first unique
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}