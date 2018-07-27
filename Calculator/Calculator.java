package Calculator;

import java.io.File;

import java.io.FileWriter;

import java.util.ArrayList;

import java.util.Scanner;

import javax.swing.JFileChooser;

class Calculator {

    ArrayList<String> list = new ArrayList<String>();

    public static double currentValue = 0; //Variable to hold result

    public Calculator(double currentValue)

    {

        this.currentValue = currentValue;

    }

    public void display() {

        File outputFile = null;

        JFileChooser fileChooser = new JFileChooser( //Creating the JFileChooser

                "Choose a file to save the contents"); //Displaying the dialog and getting response

        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {

            outputFile = fileChooser.getSelectedFile();

            try {

                FileWriter fw = new FileWriter(outputFile); //Writing the Array List into the file and displaying on the console

                for (String i : list) {

                    System.out.println(i);

                    fw.write(i + "\r\n");

                }

                fw.close();

            } catch (Exception e) {

                System.out.println(e);

            }

        }

    }

    public static int displayMenu(Scanner choose)

    {

        int choice;

        System.out.println(" ");

        System.out.println("Menu ");

        System.out.println("1. Add");

        System.out.println("2. Subtract");

        System.out.println("3. Multiply");

        System.out.println("4. Divide");

        System.out.println("5. Clear");

        System.out.println("6. Save");

        System.out.println("7. Quit");

        System.out.println(" ");

        System.out.print("What would you like to do? ");

        choice = choose.nextInt();

        return choice;

    }

    public static double getOperand(String prompt)

    {

        Scanner choose = new Scanner(System.in);

        System.out.print(prompt);

        double option = choose.nextDouble();

        return option;

    }

    public double getCurrentValue()

    {

        return this.currentValue;

    }

    public void add(double operand2)

    {

        list.add(this.currentValue+" + "+operand2+" = "+String.format ("%.1f", (this.currentValue + operand2)));

        this.currentValue += operand2;

    }

    public void subtract(double operand2)

    {

        list.add(this.currentValue+" - "+operand2+" = "+String.format ("%.1f",(this.currentValue - operand2)));

        this.currentValue -= operand2;

    }

    public void multiply(double operand2)

    {

        list.add(this.currentValue+" * "+operand2+" = "+String.format ("%.1f", (this.currentValue * operand2)));

        this.currentValue *= operand2;

    }

    public void divide(double operand2)

    {

        if (operand2 == 0)

        {

            System.out.println("The current value is NaN ");

            list.add((int) this.currentValue + " / " + (int) operand2 + " = NaN");

            clear();

        }

        else

        {

            list.add((int)this.currentValue+" / "+(int)operand2+" = "+String.format ("%.1f",(this.currentValue / operand2)));

            this.currentValue /= operand2;

        }

    }

    public void clear()

    {

        list.add("Cleared");

        this.currentValue = 0;

    }


}