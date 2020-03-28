package djja;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static class ConsoleReader {

        public static String readString() throws Exception {
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        }

        public static int readInt() throws Exception {
            return Integer.valueOf(readString());
        }

        public static double readDouble() throws Exception {
            return Double.valueOf(readString());
        }

        public static void readLn() throws Exception {
            while (true) {
                if (readString().equals("")) return;
            }
        }

        public static void main(String[] args) throws Exception {
            readString();
            readInt();
            readDouble();
            System.out.println("Ждем нажатия Enter");
            readLn();
            System.out.println("Enter нажат");
        }
    }
}
