public class StringOperations {
    public static void main(String[] args) {
        String sampleString = "The quick brown fox jumps over the lazy dog.";

        // i. Compare two strings lexicographically, ignoring case differences
        String compareString = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        boolean lexicographicComparison = sampleString.equalsIgnoreCase(compareString);
        System.out.println("i. Lexicographic Comparison (Ignoring Case): " + lexicographicComparison);

        // ii. Check if the string ends with the contents of another string
        String endString = "dog.";
        boolean endsWith = sampleString.endsWith(endString);
        System.out.println("ii. Ends with \"" + endString + "\": " + endsWith);

        // iii. Print current date and time in the specified format
        java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date date = new java.util.Date();
        String formattedDate = dateFormat.format(date);
        System.out.println("iii. Current Date and Time: " + formattedDate);

        // iv. Get the index of all the characters of the alphabet
        for (char c = 'a'; c <= 'z'; c++) {
            int index = sampleString.indexOf(c);
            if (index != -1) {
                System.out.println("iv. Index of '" + c + "': " + index);
            }
        }

        // v. Replace each substring matching the given regular expression with the given replacement
        String replacedString = sampleString.replaceAll("fox", "cat");
        System.out.println("v. Replaced String: " + replacedString);

        // vi. Get a substring between two specified positions
        int startIndex = 4;
        int endIndex = 9;
        String substring = sampleString.substring(startIndex, endIndex);
        System.out.println("vi. Substring from position " + startIndex + " to " + endIndex + ": " + substring);

        // vii. Trim leading and trailing whitespace
        String trimmedString = sampleString.trim();
        System.out.println("vii. Trimmed String: " + trimmedString);

        // viii. Convert all characters to lowercase
        String lowercaseString = sampleString.toLowerCase();
        System.out.println("viii. Lowercase String: " + lowercaseString);

        // ix. Get the length of the string
        int length = sampleString.length();
        System.out.println("ix. Length of the String: " + length);

        // x. Check if two String objects contain the same data
        String anotherString = "The quick brown fox jumps over the lazy dog.";
        boolean isEqual = sampleString.equals(anotherString);
        System.out.println("x. Strings are Equal: " + isEqual);
    }
}
