package edu.jsu.mcis.cs310;
import java.lang.StringBuilder;
public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        
        String message = m.getGreeting();
        String reverse = m.reverse(message);
        System.out.println(message);
        System.out.println(reverse);
        
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        StringBuilder s = new StringBuilder();
        s.append(message);
        s.reverse();
        return s.toString();
    }
    
}