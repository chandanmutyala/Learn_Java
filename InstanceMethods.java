public class InstanceMethods {
    int add()
    {
        int x=5;
        int y=2;
        int sum =x+y;
        System.out.println(sum);
        return sum;
    }
    String revrseString()
    {
     String s1="nitin" ;
        char ch[] =s1.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--)
        {
            rev += ch[i];
        }
        System.out.println(rev);
        System.out.println(rev.equals(s1));
        return rev;
    }
    public static void main(String[] args){
        InstanceMethods obj = new InstanceMethods();
        obj.add();
        obj.revrseString();
}}
