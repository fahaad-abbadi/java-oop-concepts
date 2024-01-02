package Intermediate;

class parent{
    int data = 10;
    String val = "nothing";

    void practice()
    {
        System.out.println("Practicing...");
    }

    void load()
    {
        System.out.println("loading...");
    }

    public static void main(String[] args) {
        child c = new child();
        System.out.println(super.data);
    }
}

class child extends parent{
    int data = 6;
}
