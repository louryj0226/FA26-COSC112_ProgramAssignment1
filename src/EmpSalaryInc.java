/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// import libraries
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author CPAL-Admin_mobile
 */
public class EmpSalaryInc {
    public static void main (String []args) throws FileNotFoundException{

        // TO DO

        String filepath = "C:\\Users\\Licia\\IdeaProjects\\COSC112\\Programming Assignments1\\src\\EmpData.txt";
        String outputfilepath = "C:\\Users\\Licia\\IdeaProjects\\COSC112\\Programming Assignments1\\src\\EmpDataOutput.dat";
        Scanner fin = new Scanner(new FileReader(filepath));

        PrintWriter fout = new PrintWriter(outputfilepath); //output new salary to file

        // declare variables

        String lastName, firstName;
        double currentSalary, newSalary;
        double payIncrease;

        // employee info

        lastName = fin.next();
        firstName = fin.next();
        currentSalary = fin.nextDouble();
        payIncrease = fin.nextDouble();

        newSalary = (currentSalary * payIncrease / 100) + (currentSalary);

        //JOptionPane
        JOptionPane.showMessageDialog(null, lastName +"," + firstName + "\n"
                + String.format("Current salary: $%.2f", currentSalary) + "\n"
                + String.format("Percent pay rise:" + payIncrease + " percent") +"\n"
                + String.format("==== New salary amount: $%.2f",newSalary) + "\n");

        // output

        fout.println("Employee name: " + lastName + "," + firstName);
        fout.printf("Current salary: $" + currentSalary + "\n");
        fout.printf("Percent pay rise: " + payIncrease + " percent" + "\n");
        fout.printf("==== New salary amount: $%.2f\n", newSalary);

        lastName = fin.next();
        firstName = fin.next();
        currentSalary = fin.nextDouble();
        payIncrease = fin.nextDouble();

        newSalary = (currentSalary * payIncrease / 100) + (currentSalary);

        //JOptionPane
        JOptionPane.showMessageDialog(null, lastName +"," + firstName + "\n"
                + String.format("Current salary: $%.2f", currentSalary) + "\n"
                + String.format("Percent pay rise: " + payIncrease + " percent") +"\n"
                + String.format("==== New salary amount: $%.2f",newSalary) + "\n");

        // output

        fout.println("Employee name: " + lastName + "," + firstName);
        fout.printf("Current salary: $" + currentSalary + "\n");
        fout.printf("Percent pay rise: " + payIncrease + " percent" + "\n");
        fout.printf("==== New salary amount: $%.2f\n", newSalary);

        lastName = fin.next();
        firstName = fin.next();
        currentSalary = fin.nextDouble();
        payIncrease = fin.nextDouble();

        newSalary = (currentSalary * payIncrease / 100) + (currentSalary);

        //JOptionPane
        JOptionPane.showMessageDialog(null, lastName +"," + firstName + "\n"
                + String.format("Current salary: $%.2f", currentSalary) + "\n"
                + String.format("Percent pay rise:" + payIncrease + " percent") +"\n"
                + String.format("==== New salary amount: $%.2f",newSalary) + "\n");

        // output

        fout.println("Employee name: " + lastName + "," + firstName);
        fout.printf("Current salary: $" + currentSalary + "\n");
        fout.printf("Percent pay rise: " + payIncrease + " percent" + "\n");
        fout.printf("==== New salary amount: $%.2f\n", newSalary);

        fin.close();
        fout.close();

    }



    
}
