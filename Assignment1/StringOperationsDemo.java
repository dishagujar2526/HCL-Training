package AssignmentOne;

public class StringOperationsDemo {

    public static void main(String[] args) {

        String s1 = " Hello Java World ";
        String s2 = "Java";
        String s3 = "Java";

        // length()
        System.out.println("Length: " + s1.length());

        // isEmpty()
        System.out.println("Is Empty: " + s1.isEmpty());

        // charAt()
        System.out.println("Character at index 1: " + s1.charAt(1));

        // toString()
        StringBuffer sb = new StringBuffer("Buffer");
        System.out.println("toString(): " + sb.toString());

        // equals()
        System.out.println("Equals: " + s2.equals(s3));

        // compareTo()
        System.out.println("CompareTo: " + s2.compareTo(s3));

        // contains()
        System.out.println("Contains 'Java': " + s1.contains("Java"));

        // indexOf()
        System.out.println("IndexOf 'Java': " + s1.indexOf("Java"));

        // lastIndexOf()
        System.out.println("LastIndexOf 'a': " + s1.lastIndexOf("a"));

        // startsWith()
        System.out.println("StartsWith ' Hello': " + s1.startsWith(" Hello"));

        // endsWith()
        System.out.println("EndsWith 'World ': " + s1.endsWith("World "));

        // matches()
        System.out.println("Matches regex: " + s2.matches("[A-Za-z]+"));

        // substring()
        System.out.println("Substring: " + s1.substring(1, 6));

        // toLowerCase()
        System.out.println("Lowercase: " + s1.toLowerCase());

        // trim()
        System.out.println("Trimmed: '" + s1.trim() + "'");

        // replace()
        System.out.println("Replace: " + s1.replace("Java", "Python"));

        // split()
        String[] words = s1.trim().split(" ");
        System.out.println("Split:");
        for (String w : words) {
            System.out.println(w);
        }

        // join()
        String joined = String.join("-", "Java", "is", "Powerful");
        System.out.println("Joined: " + joined);

        // valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("ValueOf: " + numStr);
    }
}
