package br.com.panvel.excecoes.BasicExceptions;

public class Main_BasicExceptions {

    public static void main(String[] args) {

        System.out.println("Start -> MAIN");
        System.out.println("Start -> Testing Checked exception:");
        try{
            TestChecked();
        }
        catch (MyCheckedException ex)
        {
            ex.printStackTrace();
        }
        System.out.println("Finish -> Testing Checked exception:");


        System.out.println("Start -> Testing Unchecked exception:");
        try{
            TestUnchecked();
        }
        catch (MyUncheckedException ex)
        {
            ex.printStackTrace();
        }
        System.out.println("Finish -> Testing Unchecked exception:");
        System.out.println("Finish -> MAIN");


    }

    private static void TestChecked() throws MyCheckedException
    {
        throw new MyCheckedException("CHECKED EXCPETION!!!");
    }

    private static void TestUnchecked()
    {
        throw new MyUncheckedException("UNCHECKED EXCPETION!!!");
    }
}
