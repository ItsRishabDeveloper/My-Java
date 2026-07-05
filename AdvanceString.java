public class AdvanceString {
    public static void main(String[] args) {
        String r = "Rishab";
        String s = "Rishab";
//        Here extra space is not used , Java will instead point 2 variables to same Object
        String c = "Rishab";
        String d = new String("Rishab");
//        Here 2 object will be craeted , because the new keyword always give a new object
        String a = "Hello";
        String b = "Hello";

        System.out.println(a == b);
        System.out.println(c == d);
//        Because no two onjects are same.
//        But for comparing the contents inside the string we use this
        System.out.println(r.equals(s));
        System.out.println(r.equals(c));
//        Strings are Immutable in java
        String name = "Rishab";
        name = name.toUpperCase();
        System.out.println(name);
//        Here Java Creates new object to get the string in uppercase letters
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
//        Memory changes instead of creating new String objects.
    }


}
