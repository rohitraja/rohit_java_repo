package com.rohit.exceptionHandling;

/*
 * 
 * 
 * @source: http://geeksquiz.com/java/exception-handling-2/
 * @explanation: 'throw' keyword is used to explicitly throw an exception.
 *  finally block is always executed even when an exception occurs.
 *   Call to method C() throws an exception. Thus, control
 *    goes in catch block of method B() which again throws 
 *    an exception. So, control goes in catch block of method A().
 * @ouput: abdec
 */
public class ExceptionEg1
{
    String str = "a";
 
    void A()
    {
    	
        try
        {
            str +="b";
            B();
        }
        catch (Exception e)
        {
            str += "c";
        }
    }
 
    void B() throws Exception
    {
        try
        {
            str += "d";
            C();
        }
        catch(Exception e)
        {
            throw new Exception();
        }
        finally
        {
            str += "e";
        }
 
        str += "f";
 
    }
     
    void C() throws Exception
    {
        throw new Exception();
    }
 
    void display()
    {
        System.out.println(str);
    }
 
    public static void main(String[] args)
    {
    	ExceptionEg1 object = new ExceptionEg1();
        object.A();
        object.display();
    }
 
}