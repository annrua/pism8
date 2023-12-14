

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyArrayListService listService = new MyArrayListService(new ArrayList<>());

        listService.addElement("aboba");
        listService.addElement("boba");
        listService.addElement("biba");


        workWithFunctions(listService);
    }

    public static void workWithFunctions(MyArrayListService listService) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            clearConsole();
            System.out.println("Select an action: \n" +
                    "1.Add an element\n" +
                    "2.Delete an element\n" +
                    "3.Reverse all strings\n" +
                    "4.Character statistic\n" +
                    "5.Find the substring\n" +
                    "6.Print .txt file\n" +
                    "7.Count and sort strings\n" +
                    "8.Dynamic opportunity\n" +
                    "9.Comparison of strings\n" +
                    "10.Save to XML\n" +
                    "11.Output of elements\n" +
                    "12.Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    String temp;
                    System.out.print("Enter element: ");
                    temp = scanner.next();
                    listService.addElement(temp);
                }
                case 2 -> {
                    int position;
                    System.out.print("Enter index: ");
                    position = scanner.nextInt();

                    listService.deleteElement(position);
                }
                case 3 -> listService.reverseAllStrings();

                case 4 -> System.out.println(listService.getCharacterStatistics());

                case 5 -> {
                    String substring;
                    System.out.print("Enter the substring: ");
                    substring = scanner.next();
                    listService.findSubstring(substring);
                }
                case 6 -> {
                    MyArrayListService workingWithTxtList = new MyArrayListService("input.txt");
                    workingWithTxtList.printArrayList();
                }
                case 7 -> System.out.println(listService.countAndSortStringLengths());

                case 8 -> {
                    MyArrayList<Integer> collection = new MyArrayList<>(5);
                    for (int i = 1; i <= 10; i++) {
                        collection.add(i);
                        System.out.println("Added: " + i);
                        System.out.println("Collection: " + collection.getCollection());
                    }
                }
                case 9 -> {
                    int position1, position2;
                    System.out.println("Enter the position of the elements that you want to compare: ");
                    position1 = scanner.nextInt();
                    position2 = scanner.nextInt();

                    if (listService.compareInnerObjects(position1, position2)) {
                        System.out.println("Elements with indexes:" + position1 + " and " + position2 +
                                "are equal");
                    } else {
                        System.out.println("Elements with indexes:" + position1 + " and " + position2 +
                                " not equal");
                    }

                }
                case 10 -> listService.saveArrayListToXML("result.xml");

                case 11 -> listService.printArrayList();

                case 12 -> {
                    return;
                }
                default -> System.out.println("invalid input");
            }
        }

    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
