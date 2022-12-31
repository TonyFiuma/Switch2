package it.develhope.switchstatement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start{
    public static void main(String[] args) throws InterruptedException{
        List<String> list = new ArrayList<>();

        System.out.println("Put a word");
        Scanner scanner = new Scanner(System.in);
        String  answer  = scanner.nextLine();
        float   x       = 2.4f;

        while(true){
            switch(answer){
                case "size":
                    System.out.println("The size is "+list.size());//Aggiunta mia
                    break;
                case "clear":
                    list.clear();
                    System.out.println("I cleared the list");//Aggiunta mia
                    break;
                case "print":
                    for (int i = 0 ; i < list.size() ; i++){
                        System.out.println(list.get(i));
                    }
                    break;
                default:
                    list.add(answer);
                    System.out.println("added an element in the list");//Aggiunta mia
                    break;
            }
            Thread.sleep(1000);
            System.out.println("Put a word");
            answer = scanner.nextLine();
        }
    }
}

