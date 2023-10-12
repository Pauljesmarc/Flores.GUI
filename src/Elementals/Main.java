package Elementals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        List<Alloy> alloys = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter element/alloy: ");
            input = sc.nextLine();
            switch (input) {
                case "Copper":
                    // UNCOMMENT these when you want to solve the problem already
                    // elements.add(new TransitionMetal.Copper());
                    break;
                // TODO add more cases here
            }
        } while (!input.equals("DONE"));

        do {
            System.out.print("Enter action: ");
            input = sc.nextLine();
            switch (input){
                case "Radiate":
                    // TODO Radiate here
                    break;
                case "Magnetize":
                    // TODO Magnetize here
                    break;
                case "Conduct":
                    // TODO Conduct here
                    break;
                case "Alloy Components":
                    // TODO Alloy Components here
                    break;
                case "Get State":
                    System.out.print("Enter temperature: ");
                    double temp = sc.nextDouble();
                    sc.nextLine(); // This is to clear the newline
                    // TODO print state of elements
                    break;
                case "Sort by Weight":
                    // UNCOMMENT these when you want to solve the problem already
                    /*
                    Collections.sort(elements);
                    for (Element e : elements) {
                        System.out.println(e + " = " + e.getAtomicWeight());
                    }
                    if (elements.isEmpty()) {
                        System.out.println("No elements present");
                    }
                     */
                    break;
            }
        } while (!input.equals("DONE"));
    }
}