interface testInterface {

    final int a = 10;
    void display();
}


class TestClass implements testInterface {
  
    public void display(){ 
      System.out.println("Geek"); 
    }
}

class Geeks{
    public static void main(String[] args)
    {
        TestClass t = new TestClass();
        t.display();
        System.out.println(t.a);
    }

}
