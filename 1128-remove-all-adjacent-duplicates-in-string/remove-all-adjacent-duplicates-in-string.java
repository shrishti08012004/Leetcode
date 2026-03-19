// class Solution {
//     public String removeDuplicates(String s) {

//         StringBuilder st = new StringBuilder();

//         for(char ch : s.toCharArray()){

//             int len = st.length();

//             if(len > 0 && st.charAt(len - 1) == ch){
//                 st.deleteCharAt(len - 1); // pop
//             }
//             else{
//                 st.append(ch); // push
//             }
//         }

//         return st.toString();
//     }
// }

import java.util.*;

class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);

            // if stack not empty and top == current → remove
            if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }

        // build result from stack
        StringBuilder res = new StringBuilder();

        while(!st.isEmpty()){
            res.append(st.pop());
        }

        return res.reverse().toString();
    }
}



// class Solution {
//     public String removeDuplicates(String s) {
//         Stack<Character> st = new Stack<>();
//         if(s.length()== 0) return s;
//         if(s.length()== 1) return s;
//         char i = 1;
//         while(i<s.length()){
//             if(s.charAt(i)==s.charAt(i-1)) i++;
//             else st.push(s.charAt(i));
//             i++;
//         }
//          String res = "";
//         while(!st.isEmpty()){
//            res += st.pop();
            
//         }
//         return res;
//     }
// }