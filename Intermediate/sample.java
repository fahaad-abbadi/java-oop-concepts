package Intermediate;

public class sample {
    int data;
    String val;

    sample()
    {
        super();
    }

    sample(int data, String val)
    {
        this.data = data;
        this.val = val;
    }

    public static void main(String[] args) {
        sample s = new sample(10, "blah");
        System.out.println(s.data);
    }
}


