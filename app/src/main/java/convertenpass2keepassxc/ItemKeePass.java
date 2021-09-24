/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertenpass2keepassxc;

import java.util.logging.Logger;

/**
 *
 * @author christoph
 */
public class ItemKeePass {
    
    final String group;
    final String title;
    String notes;
    String username = "";
    String password = "";
    String url = "";
    String updated = "";
    String created = "";
    private static final Logger LOG = Logger.getLogger(ItemKeePass.class.getName());

    public ItemKeePass(String group, String title, String notes) {
        this.group = group;
        this.title = title;
        this.notes = notes.trim();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void appendNotes(String notes) {
        if (!notes.isEmpty())
            this.notes += "\n";
        this.notes += notes;
    }

    @Override
    public String toString() {
        return "ItemKeePass{" + "group=" + group + ", title=" + title + ", notes=" + notes + ", username=" + username + ", password=" + password + ", url=" + url + ", updated=" + updated + ", created=" + created + '}';
    }
    
    public static String getHeaderline() {
        return "\"Group\",\"Title\",\"Username\",\"Password\",\"URL\",\"Notes\",\"Updated\",\"Created\"";
    }
    
    public String getDataline() {
        return "\""+group+"\",\""+title+"\",\""+username+"\",\""+password+"\",\""+url+"\",\""+notes+"\""+","+updated+","+created;
    }
}
