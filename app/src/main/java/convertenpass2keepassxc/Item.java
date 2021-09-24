/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertenpass2keepassxc;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author christoph
 */
public class Item {
    
    private String category;
    private String note;
    private String title;
    private String updatedAt;
    private Set<Field> fields;

    private static final Logger LOG = Logger.getLogger(Item.class.getName());

    public Item() {
        title = "";
        note = "";
        category = "";
        updatedAt = "";
        fields = new HashSet<>();
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setNote(String note) {
        this.note = note;
    }
    public void appendNote(String note) {
        this.note += note;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setFields(Set<Field> fields) {
        this.fields = fields;
    }

    public String getCategory() {
        return category;
    }

    public String getNote() {
        return note;
    }

    public String getTitle() {
        return title;
    }

    public Set<Field> getFields() {
        return fields;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    public List<Field> getFieldByType(String type) {
        List<Field> temp;
        switch (type) {
            case "username":
                temp = fields.stream()
                        .filter(f -> f.getType().equalsIgnoreCase(type))
                        .filter(f -> f.getLabel().equalsIgnoreCase("Benutzername"))
                        .collect(Collectors.toList());
                if (temp.size()==0)
                    temp = fields.stream()
                        .filter(f -> f.getType().equalsIgnoreCase(type))
                        .collect(Collectors.toList());
                return temp;
            case "email":
                temp = fields.stream()
                        .filter(f -> f.getType().equalsIgnoreCase(type))
                        .filter(f -> f.getLabel().equalsIgnoreCase("E-Mail"))
                        .collect(Collectors.toList());
                if (temp.size()==0)
                    temp = fields.stream()
                        .filter(f -> f.getType().equalsIgnoreCase(type))
                        .collect(Collectors.toList());
                return temp;
            case "password":
                temp = fields.stream()
                        .filter(f -> f.getType().equalsIgnoreCase(type))
                        .filter(f -> f.getLabel().equalsIgnoreCase("Passwort"))
                        .collect(Collectors.toList());
                if (temp.size()==0)
                    temp = fields.stream()
                        .filter(f -> f.getType().equalsIgnoreCase(type))
                        .collect(Collectors.toList());
                return temp;
            case "url":
                temp = fields.stream()
                        .filter(f -> f.getType().equalsIgnoreCase(type))
                        .filter(f -> f.getLabel().equalsIgnoreCase("Webseite"))
                        .collect(Collectors.toList());
                if (temp.size()==0)
                    temp = fields.stream()
                        .filter(f -> f.getType().equalsIgnoreCase(type))
                        .collect(Collectors.toList());
                return temp;
            default:
                return fields.stream()
                        .filter(f -> f.getType().equalsIgnoreCase(type))
                        .collect(Collectors.toList());
        }
    }

    @Override
    public String toString() {
        return "Item{" + "category=" + category + ", note=" + note + ", title=" + title + ", updatedAt=" + updatedAt + ", fields=" + fields + '}';
    }
}
