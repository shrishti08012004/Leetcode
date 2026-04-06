class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Clean the string
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Two-pointer check
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false; // mismatch found
            }
            l++;
            r--;
        }
        return true; // all matched
    }
}



// class Solution {
//     public boolean isPalindrome(String s) {

//         // Step 1: make an empty string
//         String clean = "";

//         // Step 2: remove non-alphanumeric & make lowercase
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             if (Character.isLetterOrDigit(ch)) {
//                 clean = clean + Character.toLowerCase(ch);
//             }
//         }

//         // Step 3: reverse the cleaned string
//         String rev = "";
//         for (int i = clean.length() - 1; i >= 0; i--) {
//             rev = rev + clean.charAt(i);
//         }

//         // Step 4: compare both strings
//         return clean.equals(rev);
//     }
// }
