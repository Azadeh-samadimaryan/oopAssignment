package com.workshop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person person1 = new Person();
        person1.setId(100);
        person1.setFirstname("Nisse");
        person1.setLastname("Olsson");
        person1.setEmail("nisse@gmail.com");
        System.out.println( person1.getSummary() );

    }
}
