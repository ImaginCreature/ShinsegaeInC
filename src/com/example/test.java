package com.example;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m_height = br.read();
        int m_weight = br.read();
        int k_height = br.read();
        int k_weight = br.read();

        if (m_height > k_height && m_weight > k_weight){
            System.out.println(1);
        }else System.out.println(0);
    }

}
