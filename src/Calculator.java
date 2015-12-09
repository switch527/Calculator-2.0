import java.util.*;

public class Calculator {

    Operation op = new Operation();
    int int1 = 0, int2 = 0, intMem = 0;
    double double1 = 0.0, double2 = 0.0, dubMem = 0.0, dubModulus;
    boolean iflag1 = false, iflag2 = false, iflag3 = false, opflag1 = false, opflag2 = false, opflagCheck = false;
    boolean input1Numeric = false, input2Numeric = false, input3Numeric = false;
    boolean s1Needed = true, s2Needed = true, opNeeded = true, anythingNeeded = true, memEmpty = true, whatNowFlag = true;
    String input1 = "";
    String input2 = "";
    String input3 = "";
    String s1 = "";
    String s2 = "";
    String o1 = "";
    String r1 = "";
    String m = "0";
    String decision = "";
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.goGoGadget();
    }


    public void goGoGadget() {
        System.out.println("This is Calculator 2.0");
        System.out.println("The new and improved iteration of the Calculator Series by Steve Collins");
        System.out.println("follow the promps to the letter and you will be led through calculation after calculation");
        System.out.println("Remember, the only valid memory commands are - ");
        System.out.println("setmem: stores previous number in memory");
        System.out.println("getmem: retrieves the number that is in memory and put it into the equation");
        System.out.println("clearmem: erases memory (pretty self explainatory)");
        System.out.println("You can also use the \"exit\" command at any time to terminate the program");
        System.out.println("Let's get started!!!");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        getS1();

    }

    void getS1() {
        do {
//------------------------------------------------------------------------------------------------------------------------------------------------------------------
            if (s1Needed) {
                do {
                    System.out.println("Enter first number or memory command");
                    input1 = scanner.next();
                    try {
                        double d = Double.parseDouble(input1);
                        input1Numeric = true;
                    }
                    catch (NumberFormatException nfe) {
                        input1Numeric = false;
                    }
                    if (input1Numeric == true) {
                        s1 = input1;
                        s1Needed = false;
                        input1 = "";
                        //input1 = "";
                    }
                    else if (input1.equals("+") || input1.equals("-") || input1.equals("*") || input1.equals("/")) {
                        o1 = input1;
                        opNeeded = false;
                        s1Needed = true;
                        input1 = "";
                    }
                    else if (input1.equalsIgnoreCase("setmem")) {
                        if (!(s1.equals("0") || s1.equals("0.0") || s1.equals(""))) {
                            m = s1;
                            memEmpty = false;
                            input1 = "";
                            System.out.println(m + " saved to mem");
                        }
                        else {
                            System.out.println("Nothing to put in memory");
                            input1 = "";
                        }
                    }
                    else if (input1.equalsIgnoreCase("getmem")) {
                        if (memEmpty == true) {
                            System.out.println("Nothing in memory");
                        }
                        else {
                            s1 = m;
                            s1Needed = false;
                            System.out.println(s1);
                            input1 = "";
                        }
                    }
                    else if (input1.equalsIgnoreCase("clearmem")) {
                        m = "";
                        memEmpty = true;
                        input1 = "";
                    }
                    else if (input1.equalsIgnoreCase("exit")) {
                        System.out.println("Goodbye");
                        decision = ""; s1 = ""; s2 = ""; o1 = ""; r1 = ""; input1 = ""; input2 = ""; input3 = "";
                        s1Needed = true; s2Needed = true; opNeeded = true; anythingNeeded = true;
                        input1Numeric = false; input2Numeric = false; input3Numeric = false;
                    }
                    else {
                        System.out.println("invalid input");
                    }
                } while (s1Needed);
            }
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
            else if (opNeeded) {
                do {
                    System.out.println("Enter operation");
                    input2 = scanner.next();
                    try {
                        double d = Double.parseDouble(input2);
                        input2Numeric = true;
                    }
                    catch (NumberFormatException nfe) {
                        input2Numeric = false;
                    }
                    if (input2Numeric) {
                        s1 = input2;
                        s1Needed = false;
                    }
                    else if (input2.equals("+") || input2.equals("-") || input2.equals("*") || input2.equals("/")) {
                        o1 = input2;
                        opNeeded = false;
                    }
                    else if (input2.equalsIgnoreCase("setmem")) {
                        if (!(s1.equals("0") || s1.equals("0.0") || s1.equals(""))) {
                            m = s1;
                            memEmpty = false;
                            input2 = "";
                            System.out.println(m + " saved to mem");
                        }
                        else {
                            System.out.println("Nothing to put in memory");
                            input2 = "";
                        }
                    }
                    else if (input2.equalsIgnoreCase("getmem")) {
                        if (memEmpty) {
                            System.out.println("Nothing in memory");
                        }
                        else {
                            s1 = m;
                            s1Needed = false;
                            System.out.println(s1);
                            input2 = "";
                        }
                    }
                    else if (input2.equalsIgnoreCase("clearmem")) {
                        m = "";
                        memEmpty = true;
                        input2 = "";
                    }
                    else if (input2.equalsIgnoreCase("exit")) {
                        System.out.println("Goodbye");
                        decision = ""; s1 = ""; s2 = ""; o1 = ""; r1 = ""; input1 = ""; input2 = ""; input3 = "";
                        s1Needed = true; s2Needed = true; opNeeded = true; anythingNeeded = true;
                        input1Numeric = false; input2Numeric = false; input3Numeric = false;
                    }
                    else {
                        System.out.println("input2 error");
                    }
                } while (opNeeded);
            }
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
            else if (s2Needed) {
                do {
                    System.out.println("Enter numero dos or memory command");
                    input3 = scanner.next();
                    try {
                        double d = Double.parseDouble(input3);
                        input3Numeric = true;
                    }
                    catch (NumberFormatException nfe) {
                        input3Numeric = false;
                    }
                    if (input3Numeric) {
                        s2 = input3;
                        s2Needed = false;
                        input3 = "";
                    }
                    else if (input3.equals("+") || input3.equals("-") || input3.equals("*") || input3.equals("/")) {
                        o1 = input3;
                        opNeeded = false;
                    }
                    else if (input3.equalsIgnoreCase("setmem")) {
                        if (!(s1.equals("0") || s1.equals("0.0") || s1.equals(""))) {
                            m = s1;
                            memEmpty = false;
                            input3 = "";
                            System.out.println(m + " saved to mem");
                        }
                        else {
                            System.out.println("Nothing to put in memory");
                            input3 = "";
                            getS1();
                        }
                    }
                    else if (input3.equalsIgnoreCase("getmem")) {
                        if (memEmpty) {
                            System.out.println("Nothing in memory");
                        }
                        else {
                            s2 = m;
                            s2Needed = false;
                            System.out.println(s1);
                            input3 = "";
                        }
                    }
                    else if (input3.equalsIgnoreCase("clearmem")) {
                        m = "";
                        memEmpty = true;
                        input3 = "";
                    }
                    else if (input3.equalsIgnoreCase("exit")) {
                        System.out.println("Goodbye");
                        decision = ""; s1 = ""; s2 = ""; o1 = ""; r1 = ""; input1 = ""; input2 = ""; input3 = "";
                        s1Needed = true; s2Needed = true; opNeeded = true; anythingNeeded = true;
                        input1Numeric = false; input2Numeric = false; input3Numeric = false;
                    }
                    else {
                        System.out.println("input3 error");
                    }
                } while (s2Needed);
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------
                //Compute switch
                if (!s1Needed && !s2Needed && !opNeeded) {
                    anythingNeeded = false;
                }
                else {
                    anythingNeeded = true;
                }
            }
        } while (anythingNeeded);
        parseFlag();
    }
    //Integer or Double parsing
    void parseFlag() {
        iflag1 = true;
        for (int loop = 0; loop < s1.length(); loop++) {
            if (s1.charAt(loop) == '.') iflag1 = false;
        }

        if (iflag1) int1 = Integer.parseInt(s1);
        else double1 = Double.parseDouble(s1);

        iflag2 = true;
        for (int loop = 0; loop < s2.length(); loop++) {
            if (s2.charAt(loop) == '.') iflag2 = false;
        }

        if (iflag2) int2 = Integer.parseInt(s2);
        else double2 = Double.parseDouble(s2);

        iflag3 = true;
        for (int loop = 0; loop < m.length(); loop++) {
            if (m.charAt(loop) == '.') iflag3 = false;
        }

        if (iflag3) intMem = Integer.parseInt(m);
        else dubMem = Double.parseDouble(m);

        opFlag();
    }

    //Operation Selection
    void opFlag() {
        if (o1.equals("+")) {
            opflag1 = true;
            opflag2 = true;
            opflagCheck = true;
        }
        else if (o1.equals("-")) {
            opflag1 = true;
            opflag2 = false;
            opflagCheck = true;
        }
        else if (o1.equals("*")) {
            opflag1 = false;
            opflag2 = true;
            opflagCheck = true;
        }
        else if (o1.equals("/")) {
            opflag1 = false;
            opflag2 = false;
            opflagCheck = true;
        }
        else {
            opflagCheck = false;
            System.out.println("error at operations flags");
        }

        compute();
    }

    //Computation engine
    void compute() {
        System.out.print(s1 + " " + o1 + " " + s2 + " = ");
        //Addition
        if (iflag1 && iflag2 && opflagCheck && opflag1 && opflag2) {
            System.out.println(op.add(int1, int2));
            r1 = Integer.toString(op.add(int1, int2));
        }
        else if (!iflag1 && iflag2 && opflagCheck && opflag1 && opflag2) {
            System.out.println(op.add(double1, int2));
            r1 = Double.toString(op.add(double1, int2));
        }
        else if (iflag1 && !iflag2 && opflagCheck && opflag1 && opflag2) {
            System.out.println(op.add(int1, double2));
            r1 = Double.toString(op.add(int1, double2));
        }
        else if (!iflag1 && !iflag2 && opflagCheck && opflag1 && opflag2) {
            System.out.println(op.add(double1, double2));
            r1 = Double.toString(op.add(double1, double2));
        }
        //Subtraction
        else if (iflag1 && iflag2 && opflagCheck && opflag1 && !opflag2) {
            System.out.println(op.subtract(int1, int2));
            r1 = Integer.toString(op.subtract(int1, int2));
        }
        else if (!iflag1 && iflag2 && opflagCheck && opflag1 && !opflag2) {
            System.out.println(op.subtract(double1, int2));
            r1 = Double.toString(op.subtract(double1, int2));
        }
        else if (iflag1 && !iflag2 && opflagCheck && opflag1 && !opflag2) {
            System.out.println(op.subtract(int1, double2));
            r1 = Double.toString(op.subtract(int1, double2));
        }
        else if (!iflag1 && !iflag2 && opflagCheck && opflag1 && !opflag2) {
            System.out.println(op.subtract(double1, double2));
            r1 = Double.toString(op.subtract(double1, double2));
        }
        //Multiplication
        else if (iflag1 && iflag2 && opflagCheck && !opflag1 && opflag2) {
            System.out.println(op.multiply(int1, int2));
            r1 = Integer.toString(op.multiply(int1, int2));
        }
        else if (!iflag1 && iflag2 && opflagCheck && !opflag1 && opflag2) {
            System.out.println(op.multiply(double1, int2));
            r1 = Double.toString(op.multiply(double1, int2));
        }
        else if (iflag1 && !iflag2 && opflagCheck && !opflag1 && opflag2) {
            System.out.println(op.multiply(int1, double2));
            r1 = Double.toString(op.multiply(int1, double2));
        }
        else if (!iflag1 && !iflag2 && opflagCheck && !opflag1 && opflag2) {
            System.out.println(op.multiply(double1, double2));
            r1 = Double.toString(op.multiply(double1, double2));
        }
        //Division
        else if (iflag1 && iflag2 && opflagCheck && !opflag1 && !opflag2) {
            dubModulus = op.modulus(int1, int2);
            if (dubModulus == 0.0) {
                System.out.println(op.divide(int1, int2));
                r1 = Integer.toString(op.divide(int1, int2));
            }
            else {
                double1 = int1; double2 = int2;
                System.out.println(op.divide(double1, double2));
                r1 = Double.toString(op.divide(double1, double2));
            }
        }
        else if (!iflag1 && iflag2 && opflagCheck && !opflag1 && !opflag2) {
            System.out.println(op.divide(double1, int2));
            r1 = Double.toString(op.divide(double1, int2));
        }
        else if (iflag1 && !iflag2 && opflagCheck && !opflag1 && !opflag2) {
            System.out.println(op.divide(int1, double2));
            r1 = Double.toString(op.divide(int1, double2));
        }
        else if (!iflag1 && !iflag2 && opflagCheck && !opflag1 && !opflag2) {
            System.out.println(op.divide(double1, double2));
            r1 = Double.toString(op.divide(double1, double2));
        }
        //Invalid Input
        else {
            System.out.println("Computation error");
        }
        do {
            System.out.println("Please enter setmem, clearmem, restart, or exit");
            input1 = scanner.next();
            if (input1.equalsIgnoreCase("setmem")) {
                if (!(r1.equals("0") || r1.equals("0.0") || r1.equals(""))) {
                    m = r1;
                    memEmpty = false;
                    input1 = "";
                    whatNowFlag = false;
                    System.out.println(m + " saved to mem");
                }
                else {
                    System.out.println("Nothing to put in memory");
                    input1 = "";
                }
            }
            else if (input1.equalsIgnoreCase("clearmem")) {
                m = "";
                memEmpty = true;
                input3 = "";
                whatNowFlag = false;
            }
            else if (input1.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye");
                int1 = 0; int2 = 0; double1 = 0.0; double2 = 0.0; dubModulus = 0.0;
                decision = ""; s1 = ""; s2 = ""; o1 = ""; r1 = ""; input1 = ""; input2 = ""; input3 = "";
                s1Needed = true; s2Needed = true; opNeeded = true; anythingNeeded = true;
                input1Numeric = false; input2Numeric = false; input3Numeric = false;
            }
            else if (input1.equalsIgnoreCase("restart")) {
                int1 = 0; int2 = 0; double1 = 0.0; double2 = 0.0; dubModulus = 0.0;
                decision = ""; s1 = ""; s2 = ""; o1 = ""; r1 = ""; input1 = ""; input2 = ""; input3 = "";
                s1Needed = true; s2Needed = true; opNeeded = true; anythingNeeded = true;
                input1Numeric = false; input2Numeric = false; input3Numeric = false;
                goGoGadget();
            }
            else {
                System.out.println("Invalid selection");
                whatNowFlag = true;
            }
        } while (whatNowFlag);
        restart();
    }

    void restart() {
        int1 = 0; int2 = 0; double1 = 0.0; double2 = 0.0; dubModulus = 0.0;
        decision = ""; s1 = ""; s2 = ""; o1 = ""; r1 = ""; input1 = ""; input2 = ""; input3 = "";
        s1Needed = true; s2Needed = true; opNeeded = true; anythingNeeded = true;
        input1Numeric = false; input2Numeric = false; input3Numeric = false;
        System.out.println("Restart? (y or n):");
        decision = scanner.next();
        if (decision.equalsIgnoreCase("y")) {
            getS1();
        }
        else if (decision.equalsIgnoreCase("n")) {
            System.out.println("Fine, be that way. Shutting Down.");
        }
        else {
            System.out.println("Invlaid choice, try again.");
            restart();
        }
    }

    private class Number {

    }

    private class Operation {
        int add(int a, int b) {
            int c = a + b;
            return c;
        }
        double add(int a, double b) {
            double c = a + b;
            return c;
        }
        double add(double a, int b) {
            double c = a + b;
            return c;
        }
        double add(double a, double b) {
            double c = a + b;
            return c;
        }
        int subtract(int a, int b) {
            int c = a - b;
            return c;
        }
        double subtract(int a, double b) {
            double c = a - b;
            return c;
        }
        double subtract(double a, int b) {
            double c = a - b;
            return c;
        }
        double subtract(double a, double b) {
            double c = a - b;
            return c;
        }
        int multiply(int a, int b) {
            int c = a * b;
            return c;
        }
        double multiply(int a, double b) {
            double c = a * b;
            return c;
        }
        double multiply(double a, int b) {
            double c = a * b;
            return c;
        }
        double multiply(double a, double b) {
            double c = a * b;
            return c;
        }
        int divide(int a, int b) {
            if (a == 0 || b == 0) {
                System.out.print("Cannot divide by ");
                return 0;
            }
            else {
                int c = a / b;
                return c;
            }
        }
        double divide(int a, double b) {
            if (a == 0 || b == 0.0) {
                System.out.print("Cannot divide by ");
                return 0;
            }
            else {
                double c = a / b;
                return c;
            }
        }
        double divide(double a, int b) {
            if (a == 0.0 || b == 0) {
                System.out.print("Cannot divide by ");
                return 0;
            }
            else {
                double c = a / b;
                return c;
            }
        }
        double divide(double a, double b) {
            if (a == 0.0 || b == 0.0) {
                System.out.print("Cannot divide by ");
                return 0;
            }
            else {
                double c = a / b;
                return c;
            }
        }
        double modulus(int a, int b) {
            if (a == 0 || b == 0) {
                System.out.print("Cannot divide by ");
                return 0;
            }
            else {
                double c = a % b;
                return c;
            }
        }
        double modulus(int a, double b) {
            if (a == 0 || b == 0.0) {
                System.out.print("Cannot divide by ");
                return 0;
            }
            else {
                double c = a % b;
                return c;
            }
        }
        double modulus(double a, int b) {
            if (a == 0.0 || b == 0) {
                System.out.print("Cannot divide by ");
                return 0;
            }
            else {
                double c = a % b;
                return c;
            }
        }
        double modulus(double a, double b) {
            if (a == 0.0 || b == 0.0) {
                System.out.print("Cannot divide by ");
                return 0;
            }
            else {
                double c = a % b;
                return c;
            }
        }
    }

    private class Memory {
        private int intMem;
        private double dubMem;

        public void setMem(double m) {
            dubMem = m;
        }
        public void setMem(int m) {
            intMem = (int) dubMem;
        }

        public double getDubMem(int m) {
            return dubMem;
        }
        public int getIntMem(int m) {
            return intMem;
        }
    }
}

