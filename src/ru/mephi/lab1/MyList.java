package ru.mephi.lab1;

public class MyList {

    public static void main(String... args) {
        MyList b = new MyList();
        System.out.println(b.isEmpty());
        b.add(12);
        b.add(13);
        b.add(14);
        b.add(15);
        b.add(16);
        b.add(17);
        System.out.println(b.remove(5));
        System.out.println(b.isEmpty());
        System.out.println(b.set(222, 1));
        System.out.println(b.get(1));
        //b.add(16);
        //b.add(17);
        // b.add(18);
        System.out.println(b.size());
        b.add(111, 1);
        for (int i = 0; i < b.size(); i++) {
            System.out.print(b.get(i) + " ");
        }
    }

    private Object[] array;
    private int size;

    public MyList() {
        this.array = new Object[5];
        this.size = 0;
    }

    public void add(Object arg) {
        array[this.size] = arg;
        this.size++;
        if (this.size == array.length) {
            int newsize = array.length + 5;
            Object[] newArray = new Object[newsize];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        /*
        if(findLast() == array.length-1){
            int newsize = array.length + 5;
            Object[] newArray = new Object[newsize];
            System.arraycopy(array,0,newArray,0, array.length);
            array = newArray;
            array[findLast()] = arg;
        }
        else{
            array[findLast()]= arg;
        }

         */
    }//++

    public void add(Object arg, int index) {
        Object[] newArray = new Object[array.length];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = arg;
        System.arraycopy(array, index, newArray, index + 1, array.length - index - 1);
        array = newArray;
        this.size++;
        if (this.size == array.length) {
            int newsize = array.length + 5;
            Object[] newArr = new Object[newsize];
            System.arraycopy(array, 0, newArr, 0, array.length);
            array = newArr;
        }
        /*
        if (findLast() == array.length){
            int newsize = array.length + 5;
            Object[] newArray = new Object[newsize];
            System.arraycopy(array,0,newArray,0, index);
            newArray[index] = arg;
            System.arraycopy(array,index,newArray,index+1,array.length - index -1);
            array = newArray;
        }
        else{
            Object[] newArray = new Object[array.length];
            System.arraycopy(array,0,newArray,0, index);
            newArray[index] = arg;
            System.arraycopy(array,index,newArray,index+1,array.length - index-1);
            array = newArray;

        }

         */
    }//++

    public int size() {
        return this.size;
    }//++

    public Object get(int index) {
        return array[index];
    }//++

    public boolean contains(Object arg) {
        boolean result;
        if (indexOf(arg) == -1) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }//++

    public int indexOf(Object arg) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == arg) {
                index = i;
                break;
            }
        }
        return index;
    }//++

    public Object set(Object arg, int index) {
        Object temp = array[index];
        array[index] = arg;
        return temp;
    }//++

    public Object remove(int index) {
        Object temp = null;
        Object[] newArray = new Object[array.length];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        if(array[index] != null){
            temp = array[index];
        }
        array = newArray;
        this.size--;
        if(array.length - this.size > 5){
            Object[] newArray1 = new Object[array.length - 5];
            System.arraycopy(array, 0, newArray1, 0, newArray1.length);
            array = newArray1;
        }

        return temp;

        /*
        if (findLast() % 5 != 0 || array.length == 5) {
            Object[] newArray = new Object[array.length];
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
            Object temp = array[index];
            array = newArray;
            return temp;
            //дописать!!!
        } else {
            Object[] newArray = new Object[array.length - 5];
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 6);
            Object temp = array[index];
            array = newArray;
            return temp;
        }
        */
    }//++

    public boolean isEmpty() {
        boolean temp = true;
        if (this.size == 0) {
            temp = true;
            return temp;
        } else {
            temp = false;
            return temp;
        }
    }//++

}
