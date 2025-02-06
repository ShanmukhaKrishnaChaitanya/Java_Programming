public class DataTypes_01 {
    public static void main(String[] args) {
        //Primitive Data Types
        int myInt = 10089;   //int Example
        double myDouble = 8.13;  //double Example
        char myChar = 'A';  //char Example
        boolean myBool = true;  //boolean Example

        //Non-Primitive Data Types
        String name = "Shanmukha";    //String Example
        Car myCar = new Car();        //Object Example
        myCar.speed = 100;
        String[] friends = {"Kundan","Gowreesh","Bhagya","Thanmai","Aasrita"};   //Array Example
        //Output
        System.out.println(name + "\'s Roll Number is " + myInt);
        System.out.println("His SGPA is " + myDouble);
        System.out.println("and he is from Section " + myChar);
        System.out.println("He frequntly meet his friends named as ");
        for(int i=0; i<friends.length; i++)
        {
            System.out.print(friends[i] + " ");
        }
        System.out.println("\nMoreover he likes to drive car at the speed of " + myCar.speed + " Kmph");
        System.out.println("and that\'s " + myBool + "...");
    }
}

class Car{         //Class Example
    int speed;
}