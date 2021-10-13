package ru.mephi.hw1;

public class Map {

    public static void main(String... args) {

        Map t = new Map();
        System.out.println(t.isEmpty());
        System.out.println(t.size());
        t.put('a',12);
        t.put(77,"www");
        t.put("er",'q');
        System.out.println(t.get(77,"no"));
        t.remove(77);
        System.out.println(t.get(77,"no"));
        System.out.println(t.keyContains('a'));
        System.out.println(t.keyContains('b'));
        for(int i=0; i< t.getKeys().size();i++){
            System.out.println(t.getKeys().get(i));
            //System.out.println(t.getValues().get(i));
            //System.out.println(t.getEntries().get(i));
        }
        System.out.println(t.isEmpty());
        System.out.println(t.size());
    }

    private MyList list;

    public Map() {
        this.list = new MyList();
    }

    public void put(Object key, Object value) {
        if (this.keyContains(key) == true) {
            Struct temp = new Struct(key, value);
            this.list.add(temp);
        } else {
            this.remove(key);
            Struct temp = new Struct(key, value);
            this.list.add(temp);
        }
    }//++

    public Object get(Object key) {
        Object result = null;
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i) != null) {
                Struct temp = (Struct) this.list.get(i);
                if (temp.getKey().equals(key)) {
                    result = temp.getData();
                    break;
                }
            }
        }
        return result;
    }//++

    public Object get(Object key, Object bydefult) {
        Object result = bydefult;
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i) != null) {
                Struct temp = (Struct) this.list.get(i);
                if (temp.getKey().equals(key)) {
                    result = temp.getData();
                    break;
                }
            }
        }
        return result;
    }//++

    public Object remove(Object key) {
        Object result = null;
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i) != null) {
                Struct temp = (Struct) this.list.get(i);
                if (temp.getKey().equals(key)) {
                    result = this.list.remove(i);
                    break;
                }
            }
        }
        return result;
    }//++

    public boolean keyContains(Object key) {
        boolean result = false;
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i) != null) {
                Struct temp = (Struct) this.list.get(i);
                if (temp.getKey().equals(key)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }//++

    public MyList getKeys() {
        MyList resultList = new MyList();
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i) != null) {
                Struct temp = (Struct) this.list.get(i);
                resultList.add(temp.getKey());
            }
        }
        return resultList;
    }//++

    public MyList getValues() {
        MyList resultList = new MyList();
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i) != null) {
                Struct temp = (Struct) this.list.get(i);
                resultList.add(temp.getData());
            }
        }
        return resultList;
    }//++

    public MyList getEntries() {
        MyList resultList = new MyList();
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i) != null) {
                Struct temp = (Struct) this.list.get(i);
                resultList.add(temp);
            }
        }
        return resultList;
    }//++

    public int size() {
        return list.size();
    }//++

    public boolean isEmpty() {
        boolean result = false;
        if (list.isEmpty() == true) {
            result = true;
        }
        return result;
    }//++
}
