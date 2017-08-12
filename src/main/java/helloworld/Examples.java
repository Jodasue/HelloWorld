package helloworld;

public class Examples {
    //This is a comment

    /*
     *  This is also a comment
     */

    int wholeNumber = 108983;
    float decimal = 0.12432F;
    boolean trueFalse = true;
    String someWord = "look words";

    public void conditional(int a, int b)
    {
        if(a < b)
        {
            System.out.print(a + " is less than " + b);
        }
        else if(a > b)
        {
            System.out.print(a + " is greater than " + b);
        }
        else
        {
            System.out.print(a + " equals " + b);
        }
    }

    public void loop(int reps)
    {
        for(int i = 0; i < reps; i++)
        {
            System.out.print("For rep: " + i);
        }

        int j = reps;
        while(j > 0)
        {
            System.out.print("While rep: " + j);
            j++;
        }
    }
}
