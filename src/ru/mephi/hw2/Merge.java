package ru.mephi.hw2;

public class Merge {
    public static void main(String... args) {
        Integer[] tempArr1 = {23, 50};
        Integer[] tempArr2 = {1, 20, 30, 4, 7, 44, 9, 0, 2};
        MyList list1 = new MyList(tempArr2);
        MyList list2 = new MyList(tempArr1);
        MyList result = new MyList();
        sort(list1);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        result = merge(list1, list2);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
        System.out.println();

    }

    public static void sort(MyList list) {
        int size = list.size();
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if ((int) list.get(j) > (int) list.get(j + 1)) {
                    int temp = (int) list.get(j);
                    list.set(list.get(j + 1), j);
                    list.set(temp, j + 1);
                }
            }
        }
    }

    public static MyList merge(MyList list1, MyList list2) {
        MyList newList = new MyList();
        int size = list1.size() + list2.size();
        int index1 = 0;
        int index2 = 0;

        while (index1 < list1.size() && index2 < list2.size()) {
            if ((int) list1.get(index1) <= (int) list2.get(index2)) {
                newList.add(list1.get(index1));
                index1++;
            } else {
                newList.add(list2.get(index2));
                index2++;
            }
        }

        while (index1 < list1.size()) {
            newList.add(list1.get(index1));
            index1++;
        }

        while (index2 < list2.size()) {
            newList.add(list2.get(index2));
            index2++;
        }


        return newList;
    }
}
//что с исключениями?
//что с тестами?