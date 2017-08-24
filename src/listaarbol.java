
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio
 */
public class listaarbol {
    DefaultMutableTreeNode element;
    String name;

    public listaarbol(DefaultMutableTreeNode element, String name) {
        this.element = element;
        this.name = name;
    }

    public DefaultMutableTreeNode getElement() {
        return element;
    }

    public void setElement(DefaultMutableTreeNode element) {
        this.element = element;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
