package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String departement;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String companySuffix = "aey.com";
    private int mailBoxCapacity = 500;
    private String alternateEmail;

    // Constructor to receive the first name and last name
   public Email(String firstName, String lastName)
   {    this.firstName = firstName;
       this.lastName = lastName;

       this.departement = setDepartement();


       this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

       // Combine elements to generate email
       email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + departement + "." + companySuffix;

   }


   // Ask for departement
    private String setDepartement()
    {   System.out.print("New Worker: "+ firstName +  ". Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter departmpent code: ");
       Scanner in = new Scanner(System.in);
      int depChoise =  in.nextInt();

      if (depChoise ==1) { return "sales"; }
      else if (depChoise ==2 ){ return "dev"; }
      else if (depChoise ==3) { return "acct"; }
      else { return "";}

    }
    // Generate a randow password
    private String randomPassword(int length)
    {   String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
        char[] password = new char[length];

        for(int i =0; i<length; i++)
        {   int rand = (int)( Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password) ;
    }

    public void setMailBoxCapacity(int capacity)
    {   this.mailBoxCapacity = capacity;
    }

    public void setAlternateEmail(String altEmail)
    {   this.alternateEmail = altEmail;
    }
    public void changePassword(String password)
    {   this.password = password;
    }

    public int getMailboxCapacity()
    {   return mailboxCapacity;
    }

    public String getAlternateEmail()
    {   return alternateEmail;
    }

    public String getPassword()
    {   return password;
    }

    public String showInfo()
    {   return "DISPLAY NAME: " + firstName + " " + lastName +
            "\nCOMPANY EMAIL: "+ email +
            "\nMAILBOX CAPACITY: "+ mailBoxCapacity+ "mb";
    }
}
