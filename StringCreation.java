class StringCreation {
    public static void main(String[] args)
    {
        String s1= new String("Muthyala.");
        String s2="Chandhan ";
        char ch [] = {'K','u','m','a','r'};
        String s3= new String(ch);
        System.out.print(s1);System.out.print(s2);System.out.println(s3);

        System.out.println(s1.equals(s3));
        System.out.println(s3.compareTo(s2));
        StringBuilder s4 = new StringBuilder("Iam Happy ");
        StringBuilder s5 = new StringBuilder("and Sad");
        StringBuilder s=s4.append(s5);
        System.out.println(s.toString());
        System.out.println(s1 == s2);
        System.out.println(s4.equals(s5));
        System.out.println(s4.reverse()); // THIS IS APPLICABLE ONLY FOR STRING BUILDER




    }
}
