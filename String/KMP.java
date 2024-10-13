public class KMP {
    // Function to build LPS (Longest Prefix Suffix) array
    public void BuildLPSArray(int[] LPS, String pattern) {
        int length = 0; // Length of the previous longest prefix suffix
        LPS[0] = 0; // LPS of the first character is always 0

        // Start from the second character in the pattern
        for (int i = 1; i < pattern.length();) {
            if (pattern.charAt(i) == pattern.charAt(length)) { // Checking if P[i] == P[length]
                length++; // Increment length for the LPS
                LPS[i] = length; // Assign length to LPS[i]
                i++; // Move to the next character
            } else {
                if (length != 0) { // Check if length has value greater than zero
                    length = LPS[length - 1]; // Update length based on the LPS array
                } else {
                    LPS[i] = 0; // Assign value 0 to LPS[i]
                    i++; // Move to the next character
                }
            }
        }
    }

    // KMP search function
    public void KMPSearch(String str, String pattern) {
        int n = str.length();
        int m = pattern.length(); // Calculate length of string and pattern
        int[] LPS = new int[m]; // Create a new LPS array
        BuildLPSArray(LPS, pattern); // Fill the LPS array

        for (int i = 0, j = 0; i < n;) {
            if (str.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) { // Found a match
                System.out.println("Found pattern at index: " + (i - j));
                j = LPS[j - 1]; // Update j based on the LPS array
            }

            // If there's a mismatch after j matches
            if (i < n && str.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = LPS[j - 1]; // Update j based on the LPS array
                } else {
                    i++; // Move to the next character in str
                }
            }
        }
    }

    public static void main(String[] args) { // Corrected parameter type
        KMP obj = new KMP();
        String str = "abcdaabc";
        String pattern = "abc";
        obj.KMPSearch(str, pattern);
    }
}
