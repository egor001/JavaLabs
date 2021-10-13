package ru.mephi.hw1;

public class Struct {
    private Object key;
    private Object data;
    public Struct(){
        key=null;
        data=null;
    }
    public Struct(Object key, Object data){
        this.key = key;
        this.data = data;
    }
    public void setKey(Object key){
        this.key = key;
    }
    public Object getKey(){
        return this.key;
    }
    public void setData(Object data){
        this.data = data;
    }
    public Object getData(){
        return this.data;
    }
}
