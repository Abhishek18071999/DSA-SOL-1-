public class nonRepeatChar{
        public static int firstUniqChar(String s) {
            int[] charCounts = new int[26]; // Array to store the counts of each character
    
            // Count the occurrences of each character
            for (char c : s.toCharArray()) {
                charCounts[c - 'a']++;
            }
    
            // Find the index of the first unique character
            for (int i = 0; i < s.length(); i++) {
                if (charCounts[s.charAt(i) - 'a'] == 1) {
                    return i;
                }
            }
    
            return -1; // No unique character found
        }
    
        public static void main(String[] args) {
            String s1 = "leetcode";
            System.out.println(firstUniqChar(s1)); // Output: 0
    
        }
    }
    