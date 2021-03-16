public class KelasString {
    public void methodKelasString() {
        String s1 = "ABC";
        String s2 = new String("DEF");
        String s3 = "AB" + "C";

//        Test 1 => outputnya adalah -3
        System.out.println(s1.compareTo(s2));
//        Test 2 => outputnya adalah false
        System.out.println(s2.equals(s3));
//        Test 3 => outputnya adalah true
        System.out.println(s3 == s1);
//        Test 4 => outputnya adalah 3
        System.out.println(s2.compareTo(s3));
//        Test 5 => outputnya adalah true
        System.out.println(s3.equals(s1));

    }
}
