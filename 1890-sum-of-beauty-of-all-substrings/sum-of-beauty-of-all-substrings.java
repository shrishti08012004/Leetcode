class Solution {
    public int beautySum(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];

            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;

                int max = 0, min = Integer.MAX_VALUE;

                for (int f : freq) {
                    if (f > 0) {
                        max = Math.max(max, f);
                        min = Math.min(min, f);
                    }
                }

                sum += (max - min);
            }
        }
        return sum;
    }
}

// class Solution {
//     public int beautySum(String s) {
//         int sum = 0;

//         for (int i = 0; i < s.length(); i++) {
//             for (int j = i; j < s.length(); j++) {

//                 String str = s.substring(i, j + 1);

//                 HashMap<Character, Integer> map = new HashMap<>();

//                 // count frequency
//                 for (char ch : str.toCharArray()) {
//                     map.put(ch, map.getOrDefault(ch, 0) + 1);
//                 }

//                 int max = Integer.MIN_VALUE;
//                 int min = Integer.MAX_VALUE;

//                 // find max & min frequency
//                 for (int freq : map.values()) {
//                     max = Math.max(max, freq);
//                     min = Math.min(min, freq);
//                 }

//                 sum += (max - min);
//             }
//         }
//         return sum;
//     }
// }