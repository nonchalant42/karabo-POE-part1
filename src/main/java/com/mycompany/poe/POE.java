/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe;

import javax.swing.JOptionPane;

/**
 *
 * @author karabo tshivhase
 */
public class POE {

    public static void main(String[] args) {
        String userName , password, fName,lName;
        // prompt the user to enter their first name , last name and user name
          fName   = JOptionPane.showInputDialog(null, "Please enter your first name");
         JOptionPane.showMessageDialog(null, "First name successfully captured");
         
        lName = JOptionPane.showInputDialog(null, "Please enter your last name");
         JOptionPane.showMessageDialog(null, "Lastname successfully captured");
        
        userName = JOptionPane.showInputDialog(null, "Please enter your username");
         if (userName.contains("_") && userName .length() <= 5) {
               JOptionPane.showMessageDialog(null, "Username successfully captured");
          } else {
              JOptionPane.showMessageDialog(null, "Username is not correctly formatted,\nPlease ensure that your username"
                      + " contains an underscore, \nand is no more than 5 characters in length"); 
          }  
         //prompts the user to enter  their password 
         password = JOptionPane.showInputDialog(null,"Please enter your password");
         if(password.length() <8) {
             JOptionPane.showMessageDialog(null, "Password must be at least \n8 characters long");
         }else{
              JOptionPane.showMessageDialog(null, "Password successfully captured");
         }    
            JOptionPane.showMessageDialog(null," Welcome " +  fName  +  lName );   
           }  
         // checks if the password contains a number
         public boolean containsDigits(String password) {
             char[] passwordChar = password.toCharArray();
             for(int i = 0; i<passwordChar.length; i++) {
                 if(Character.isDigit(passwordChar[i]))    {
                      JOptionPane.showMessageDialog(null, "Password successfully captured");
          }else{
                     

                     return true;
                 }
             }
             return false;
         }
        //checks if the password contains a special character 
         public boolean containSpecialChar(String password) {
             char[] passwordChar = password.toCharArray();
             for(int i = 0; i<passwordChar.length; i++) {
                 if( !Character.isDigit(passwordChar[i]) && ! Character.isAlphabetic(passwordChar[i]))     {
                      JOptionPane.showMessageDialog(null, "Password successfully captured");
          }else{
                      JOptionPane.showMessageDialog(null, "Password must atleast contain a special character");
                     return true;
                 }
             }
             return false;
         }
         
         //checks if the password contains an uppercase
          public boolean containsUppercase(String password) {
             char[] passwordChar = password.toCharArray();
             for(int i = 0; i<passwordChar.length; i++) {
                 if( !Character.isUpperCase(passwordChar[i]) && ! Character.isAlphabetic(passwordChar[i]))     {
                     JOptionPane.showMessageDialog(null, "Password successfully captured");
                 }else{
                       JOptionPane.showMessageDialog(null, "Password must atleast contain an uppercase");
                     return true;
                      
                 }  
             }
             return false;
         }   
         
         
        
         
                
          
    
         
      
        
          
          
         
          
         
     
    }
 
         
