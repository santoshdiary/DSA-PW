package StringsStringBuilder;

public class CompressChar {
    public static void main(String[] args) {
        String str = "aaaabbbcccdddeee";
        String ans = "" + str.charAt(0);

        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1); // Corrected from `char prev = str.charAt(i = 1);`

            if (curr == prev) {
                count++;
            } else {
                if (count > 1) {
                    ans += count; // Append the count if it is greater than 1
                }
                count = 1; // Reset count for the new character
                ans += curr; // Append the current character to `ans`
            }
        }
        if (count > 1) {
            ans += count; // Append the final count if needed
        }
        System.out.println(ans);
    }
}
