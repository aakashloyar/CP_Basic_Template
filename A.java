package com.aakash.BasicTemplate.CP_Basic_Template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class A {
    static BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        StringTokenizer s1
                = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(s1.nextToken());
        while(t-->0) {
            StringTokenizer s2
                    = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(s2.nextToken());
            int[] arr=new int[n];
            StringTokenizer s3
                    = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++) arr[i]=Integer.parseInt(s3.nextToken());
            solve(arr,n);
        }

    }
    static void solve(int[] arr,int n) {

    }
    static void print() {
        PrintWriter out=new PrintWriter(System.out);
        for (int i = 0; i < 100000; i++)
            out.print(i + "\n");
        out.flush();
    }
    static int hcf(int a, int b) {
        if(b==0) return a;
        return hcf(b,a%b);
    }
    static int lcm(int a,int b) {
        return (a*b)/hcf(a,b);
    }
    static void sort2dlist(ArrayList<ArrayList<Integer>> list) {
        Collections.sort(list, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                if(o1.get(0)!=o2.get(0))
                    return o1.get(0).compareTo(o2.get(0));
                else {
                    return o2.get(1).compareTo(o1.get(1));
                }
            }

        });
    }
    static void sort2darray(int[][] arr) {
        Arrays.sort(arr,(int[] a, int[] b)->{
            if(a[0]!=b[0])
                return a[0]-b[0];
            else return b[1]-a[1];

        });
    }
    static long deninv(long base,int pow,int mod) {
        //long deninverse =  deninv((int)den, mod - 2, mod);
        long res=base;
        long ans=1;
        while(pow!=0) {
            int bit=pow&1;
            if(bit==1) {
                ans=ans*res;
                ans%=mod;
            }
            res=res*res;
            res%=mod;
            pow=pow>>1;
        }
        return ans;
    }
    static int IR(int a,int b,int c,int d) throws IOException {
        System.out.println("? "+a+" "+b+" "+c+" "+d);
        System.out.flush();
        StringBuilder sb=new StringBuilder(br.readLine());
        if(sb.charAt(0)=='<') return -1;
        else if(sb.charAt(0)=='>') return 1;
        else return 0;
    }
}
class PC implements Comparator<Student>{

    // Overriding compare()method of Comparator
    // for descending order of cgpa
    public int compare(Student s1, Student s2) {
        if (s1.cgpa < s2.cgpa)
            return 1;
        else if (s1.cgpa > s2.cgpa)
            return -1;
        return 0;
    }
}

class Student {
    public String name;
    public double cgpa;

    // A parameterized student constructor
    public Student(String name, double cgpa) {

        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }
}
class Custom {
    int a,b;
    Custom(int a,int b) {
        this.a=a;
        this.b=b;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Custom other= (Custom) obj;
        return a == other.a && b==other.b;
    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + a;
        result = 31 * result + b;
        return result;
    }

}
