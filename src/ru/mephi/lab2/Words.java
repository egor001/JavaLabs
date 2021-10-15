package ru.mephi.lab2;


import java.util.*;

public class Words {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку");
        String line = input.nextLine();
        wordsList(line);
        correctLine(line);

    }
    public static void wordsList(String line) {
        Map<String, Integer> collection = new HashMap<>();
        line = line.trim();
        if (line.equals("") == false) {
            String[] words = line.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (collection.containsKey(words[i]) == true) {
                    collection.put(words[i], collection.get(words[i]) + 1);
                } else {
                    collection.put(words[i], 1);
                }
            }

            Iterator<Map.Entry<String, Integer>> iterator = collection.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Integer> temp = iterator.next();
                String key = temp.getKey();
                Integer value = temp.getValue();
                System.out.println(key + ": " + value);
            }

        }
        else{
            System.out.println("введена пустая строка!");
        }
    }
    public static void correctLine(String line){
        line = line.trim();
        String newLine = "";
        Set<String> result = new HashSet<>();
        String[] words = line.split(" ");
        for(int i =0; i< words.length;i++){
            if(result.contains(words[i]) == false){
                newLine = newLine + words[i] + " ";
            }
            result.add(words[i]);

        }
        System.out.println(newLine);
    }
}
