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
public class Field {
    
    private final String label;
    private final String type;
    private final String value;
    private final String valueUpdatedAt;
    
    private static final Logger LOG = Logger.getLogger(Field.class.getName());

    public Field(String label, String type, String value, String valueUpdatedAt) {
        this.label = label;
        this.type = type;
        this.value = value;
        this.valueUpdatedAt = valueUpdatedAt;
    }

    public String getLabel() {
        return label;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public String getValueUpdatedAt() {
        return valueUpdatedAt;
    }

    @Override
    public String toString() {
        return "Field{" + "label=" + label + ", type=" + type + ", value=" + value + ", valueUpdatedAt=" + valueUpdatedAt + '}';
    }
    
}
