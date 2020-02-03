package com.javarush.task.task07.task0706;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class task0706 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] numArr = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<15; i++)
        {
            numArr[i] = Integer.parseInt(reader.readLine());
        }
        int even = 0, odd = 0;
        for (int j=0; j<15; j++)
        {
            if(j%2==0||j==0) even+= numArr[j];
            else
                odd+= numArr[j];
        }
        if(even>odd) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
