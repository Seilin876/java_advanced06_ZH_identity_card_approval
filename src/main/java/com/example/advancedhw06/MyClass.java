package com.example.advancedhw06;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        char IDfirst[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R','S', 'T', 'U', 'V', 'X', 'Y', 'W', 'Z', 'I', 'O'};
        int val=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("�п�J�����Ҹ�:");
        String ID = scanner.next();
        char[] IDNumberIndividual = new char[11];

        if (ID.length() !=10) System.out.println("�����Ҹ��t1��j�g�^������10�X");
        else{ IDNumberIndividual[0] = ID.charAt(0);
            for (int i = 1; i < 10; i++) {
                IDNumberIndividual[i+1] = ID.charAt(i);
            }
            for (int i = 0; i < 26; i++) {
                if (IDNumberIndividual[0] == IDfirst[i]) {
                    IDNumberIndividual[0] = String.valueOf(1 + (i / 10)).charAt(0);
                    IDNumberIndividual[1] = String.valueOf((i % 10)).charAt(0);
                }
            }

            for (int i = 0; i < 11; i++) {
                if (i == 0 || i == 10) {
                    val += Integer.parseInt(String.valueOf(IDNumberIndividual[i]));
                } else {
                    val += (10 - i) * Integer.parseInt(String.valueOf(IDNumberIndividual[i]));
                }
            }
            if (val % 10 == 0) {
                System.out.println("��ĤO�������Ҧr��");
            }
            else {
                System.out.println("����ĤO�������Ҧr��");
            }
            }        }
    }

