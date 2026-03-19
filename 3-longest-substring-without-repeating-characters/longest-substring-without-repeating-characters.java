import java.util.*;

class Solution {

    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for(int right = 0; right < s.length(); right++){

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
// import java.util.*;

// class Solution {

//     public int lengthOfLongestSubstring(String s) {

//         int maxLength = 0;

//         for(int i = 0; i < s.length(); i++){

//             Set<Character> set = new HashSet<>();

//             for(int j = i; j < s.length(); j++){

//                 char ch = s.charAt(j);

//                 if(set.contains(ch)){
//                     break;
//                 }

//                 set.add(ch);

//                 maxLength = Math.max(maxLength, j - i + 1);
//             }
//         }

//         return maxLength;
//     }
// }