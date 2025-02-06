public class Variables_01 {
    int instanceVar = 10; //Instance Variable
    static int staticVar = 20; //Static Variable
    
    public void display() {
        int localVar = 5; //Local Variable
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        Variables_01 obj = new Variables_01();
        obj.display();
        System.out.println("Instance Variable: " + obj.instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }
}
