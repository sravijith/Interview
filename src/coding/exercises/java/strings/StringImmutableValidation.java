package coding.exercises.java.strings;

public class StringImmutableValidation {

    public static void main(String[] args) {
        String s1 = "JAVA";

        String s2 = "JAVA";

        System.out.println(s1 == s2);         // Output : true

        s1 = s1 + "J2EE";

        System.out.println(s1 == s2);         // Output : false

        String s3 = new String("JAVA");

        System.out.println(s3);         // Output : JAVA

        s3.concat("J2EE");

        System.out.println(s3);         // Output : JAVA
    }

}
