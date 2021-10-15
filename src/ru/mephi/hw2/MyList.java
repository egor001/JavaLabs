package ru.mephi.hw2;

public class MyList {

    private Integer[] array;
    private int size;

    public MyList() {
        this.array = new Integer[5];
        this.size = 0;
    }
    public MyList(Integer[] array){
        this.size = array.length;
        this.array = array;
    }

    public void add(int arg) {
        array[this.size] = arg;
        this.size++;
        if (this.size == array.length) {
            int newsize = array.length + 5;
            Integer[] newArray = new Integer[newsize];
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

    public void add(int arg, int index) {
        Integer[] newArray = new Integer[array.length];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = arg;
        System.arraycopy(array, index, newArray, index + 1, array.length - index - 1);
        array = newArray;
        this.size++;
        if (this.size == array.length) {
            int newsize = array.length + 5;
            Integer[] newArr = new Integer[newsize];
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

    public Integer get(int index) {
        return array[index];
    }//++

    public boolean contains(Integer arg) {
        boolean result;
        if (indexOf(arg) == -1) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }//++

    public int indexOf(Integer arg) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == arg) {
                index = i;
                break;
            }
        }
        return index;
    }//++

    public Integer set(Integer arg, int index) {
        Integer temp = array[index];
        array[index] = arg;
        return temp;
    }//++

    public Integer remove(int index) {
        Integer temp = null;
        Integer[] newArray = new Integer[array.length];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        if(array[index] != null){
            temp = array[index];
        }
        array = newArray;
        this.size--;
        if(array.length - this.size > 5){
            Integer[] newArray1 = new Integer[array.length - 5];
            System.arraycopy(array, 0, newArray1, 0, newArray1.length);
            array = newArray1;
        }

        return temp;


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

