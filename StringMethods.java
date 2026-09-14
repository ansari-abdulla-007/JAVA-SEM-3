public class StringMethods {
    public static void main(String[] args){
        String str1="Hello java";
        String str2="Hello python";
        String str3="Hello c++";
        System.out.println(str1.startsWith("Hello")); //Checks whether the string starts with "Hello".
        System.out.println(str2.endsWith("on")); //Checks whether the string ends with "on".
        System.out.println(str3.contains("S")); //Checks whether "S" exists in the string.
        System.out.println(str1.equals(str2)); //Checks whether two strings are exactly the same.
    }
}
