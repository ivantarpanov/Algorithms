package Staircase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Its base and height are both equal to n. It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
//Write a program that prints a staircase of size m.
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
