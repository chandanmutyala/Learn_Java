public class A {
    Student getStudent()
    {
        Student ram=new Student();
        ram.name="Ramu";
        ram.rollno=101;
        ram.email="ram@gmail.com";
        return ram;
    }
    Address getAddress()
    {
        Address ram=new Address();
        ram.houseNo="3-145";
        ram.village="Munagala";
        ram.district="Suryapet";
        ram.state="Telangana";
        return ram;
    }

    public static void main(String [] args )
    {
        A obj=new A();
        System.out.println(obj.getAddress().state);
        System.out.println(obj.getStudent().name);

    }
}
