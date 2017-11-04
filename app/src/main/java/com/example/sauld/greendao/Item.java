package com.example.sauld.greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by sauld on 4/11/2017.
 */
@Entity
public class Item {
    @Id
    public Integer id;
    public String label;
    public String description;
 
    public int priority;

    @Generated(hash = 112588982)
    public Item(Integer id, String label, String description, int priority) {
        this.id = id;
        this.label = label;
        this.description = description;
        this.priority = priority;
    }

    @Generated(hash = 1470900980)
    public Item() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }
}
