package com.kenzie.classes;

import java.util.ArrayList;

public class ToDoList {
    String listName;
    int maxItems;
    ArrayList<ToDoItem> itemList;
    public ToDoList(){
        this.listName = "";
        this.maxItems = 10;
        this.itemList = new ArrayList<ToDoItem>();
    }
    public ToDoList(String listName, int maxItems){
        this.listName = listName;
        this.maxItems = maxItems;
        this.itemList = new ArrayList<ToDoItem>();
    }
    public String getListName(){
        return this.listName;
    }
    public int getMaxItems(){
        return this.maxItems;
    }
    public ArrayList<ToDoItem> getItemList(){
        return this.itemList;
    }
    public void setListName(String listName){
        this.listName = listName;
    }
    public void setMaxItems(int maxItems){
        this.maxItems = maxItems;
    }
    public void setItemList(ArrayList<ToDoItem> itemList){
        this.itemList = itemList;
    }
}


class ToDoItem {
    public String description;
    public String priority;
    public boolean isDone;

    public ToDoItem(){
        this.description = "";
        this.priority = "";
        this.isDone = false;
    }
    public ToDoItem(String description, String priority) {
        this.description = description;
        this.priority = priority;
        this.isDone = false;
    }
    public String getDescription() {
        return this.description;
    }
    public String getPriority() {
        return this.priority;
    }
    public boolean getIsDone(){
        return this.isDone;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setPriority(String priority){
        this.priority = priority;
    }
    public void setIsDone(boolean isDone){
        this.isDone = isDone;
    }
}
