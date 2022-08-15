import java.util.Scanner;

import java.io.*;
import java.io.BufferedReader;

public class classCalc {

    public void instanceCalc() throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int x, y, compOp;
        String strArr;
        String cmd;

        System.out.println("> Awaiting to start: [enter start to continue]");
        strArr = buffer.readLine();

        while (!strArr.equalsIgnoreCase("start"))
        {
            System.out.println("> Awaiting to start: [enter start to continue]");
            strArr = buffer.readLine();
            if (strArr.equalsIgnoreCase("start"))
            {
                ;;
            }
        }

        while(true)
        {
            System.out.println("> Enter a 'x' integer: ");
            x = sc.nextInt();
            System.out.println("> Enter a 'y' integer: ");
            y = sc.nextInt();
            System.out.println("> Enter a \"op[erator]\" ");
            char c = sc.next().charAt(0);

            try {

                switch (c) {
                    case '+':
                        compOp = x + y;
                        System.out.println("> x + y = [" + compOp + ']');
                        break;
                    case '-':
                        if (x > y) {
                            compOp = x - y;
                            System.out.println("> x - y = [" + compOp + ']');
                        } else if (x < y) {
                            compOp = y - x;
                            System.out.println("> y - x = [" + compOp + ']');
                        }
                        break;
                    case '/':
                        if (x > y) {
                            compOp = x / y;
                            System.out.println("> x / y = [" + (double)compOp + ']');
                        } else if (x < y) {
                            compOp = y / x;
                            System.out.println("> y / x = [" + (double)compOp + ']');
                        }
                        break;
                    case '*':
                        compOp = x * y;
                        System.out.println("> x * y = [" + compOp + ']');
                        break;
                    default:
                        System.out.println("> CHARACTER::BUFFER::NOT_STORED");
                        System.out.println("> ONLY::CHARACTER::['+','-','/','*']");
                        break;
                }
            }
            catch (Exception e) {
                System.out.println("> ONLY::CHARACTER::['+','-','/','*']");
                throw e;
            }
            /*cmd = sc.nextLine();
            switch (cmd)
            {
                case "exit/":
                    if (cmd.equalsIgnoreCase("exit/")) {
                        System.out.println("> exiting");
                        break;
                    }
                    break;
                case "continue/":
                    if (cmd.equalsIgnoreCase("continue/")) {
                        System.out.println("> ..continue");
                        continue;
                    }
                case "":
                    continue;
            }*/
            System.out.print('\n');
        }
    }
}
