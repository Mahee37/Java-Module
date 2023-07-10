public class string1 {
    public static void main(String args[])
    { // String Operations
        String name  = "Mahee";
        String name1 = "Sree";
        System.out.println(name.charAt(2));
        System.out.println(name.length());
        System.out.println(name.valueOf("M"));
        System.out.println(name.compareTo(name1));
        System.out.println(name.hashCode());
        System.out.println(name.concat(name1));
        System.out.println(name.replace('e','i'));
        System.out.println(name.getClass());
        System.out.println(name.endsWith("e"));
        System.out.println(name.contains("ee"));
        System.out.println(name.substring(2,3));
        System.out.println(name1.trim());
        System.out.println(name.indexOf(name));
        System.out.println(name.getBytes());

    }
}
