package coding.exercises.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";

        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        if (s1.equals(s2)) {
            System.out.println("Two strings are anagrams");
        } else {
            System.out.println("Two strings are not anagrams");
        }
    }

    static void usingSortAndEquals(String s1, String s2) {
        //Removing all white spaces from s1 and s2

        String copyOfs1 = s1.replaceAll("\\s", "");

        String copyOfs2 = s2.replaceAll("\\s", "");

        //Initially setting status as true

        boolean status = true;

        if (copyOfs1.length() != copyOfs2.length()) {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length

            status = false;
        } else {
            //Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array

            char[] s1Array = copyOfs1.toLowerCase().toCharArray();

            char[] s2Array = copyOfs2.toLowerCase().toCharArray();

            //Sorting both s1Array and s2Array

            Arrays.sort(s1Array);

            Arrays.sort(s2Array);

            //Checking whether s1Array and s2Array are equal

            status = Arrays.equals(s1Array, s2Array);
        }

        //Output

        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    static void iterativeMethod(String s1, String s2) {
        //Removing white spaces from s1 and s2 and changing case to lower

        String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();

        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();

        //Initially setting status as true

        boolean status = true;

        if (copyOfs1.length() != copyOfs2.length()) {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length

            status = false;
        } else {
            //Converting copyOfs1 to char array

            char[] s1ToArray = copyOfs1.toCharArray();

            //Checking whether each character of s1ToArray is present in copyOfs2

            for (char c : s1ToArray) {
                int index = copyOfs2.indexOf(c);

                if (index != -1) {
                    //If character is present in copyOfs2, removing that char from copyOfs2

                    copyOfs2 = copyOfs2.substring(0, index) + copyOfs2.substring(index + 1, copyOfs2.length());
                } else {
                    //If character is not present in copyOfs2, setting status as false and breaking the loop

                    status = false;

                    break;
                }
            }
        }

        //Output

        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    static void usingStringBuilder(String s1, String s2) {
        //Removing white spaces from s1 and s2 and converting case to lower

        String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();

        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();

        //Initially setting status as true

        boolean status = true;

        if (copyOfs1.length() != copyOfs2.length()) {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length

            status = false;
        } else {
            //Converting copyOfs1 to char array
            char[] s1Array = copyOfs1.toCharArray();

            //Constructing StringBuilder from copyOfs2
            StringBuilder sb = new StringBuilder(copyOfs2);

            //Checking whether each character of s1Array is present in sb

            for (char c : s1Array) {
                int index = sb.indexOf("" + c);

                if (index != -1) {
                    //If present, removing that character from sb
                    sb = sb.deleteCharAt(index);
                } else {
                    //If not present, setting status as false and breaking the loop
                    status = false;
                    break;
                }
            }
        }

        //Output

        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    static void usingHashMap(String s1, String s2) {
        //Removing white spaces from s1 and s2 and converting case to lower case

        String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();

        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();

        //Initially setting status as true

        boolean status = true;

        if (copyOfs1.length() != copyOfs2.length()) {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length

            status = false;
        } else {
            //Constructing a map containing character as a key and character occurrences as a value
            Map<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < copyOfs1.length(); i++) {
                //Getting char from copyOfs1

                char charAsKey = copyOfs1.charAt(i);

                //Initializing char count to 0

                int charCountAsValue = 0;

                //Checking whether map contains this char

                if (map.containsKey(charAsKey)) {
                    //If contains, retrieving it's count

                    charCountAsValue = map.get(charAsKey);
                }

                //Putting char and it's count to map with pre-incrementing char count

                map.put(charAsKey, ++charCountAsValue);

                //Getting char from copyOfs2

                charAsKey = copyOfs2.charAt(i);

                //Initializing char count to 0

                charCountAsValue = 0;

                //Checking whether map contains this char

                if (map.containsKey(charAsKey)) {
                    //If contains, retrieving it's count

                    charCountAsValue = map.get(charAsKey);
                }

                //Putting char and it's count to map with pre-decrementing char count

                map.put(charAsKey, --charCountAsValue);
            }

            //Checking each character and it's count

            for (int value : map.values()) {
                if (value != 0) {
                    //If character count is not equal to 0, then setting status as false

                    status = false;
                }
            }

        }

        //Output

        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }


}
