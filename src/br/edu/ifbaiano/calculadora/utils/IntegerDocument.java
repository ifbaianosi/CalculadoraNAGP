package br.edu.ifbaiano.calculadora.utils;

/* FixedLengthDocument.java */  

import java.awt.Toolkit;

import javax.swing.text.AttributeSet;  
import javax.swing.text.BadLocationException;  
  
public class IntegerDocument extends FixedLengthDocument 
{  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IntegerDocument(int maxlen) {  
        super(maxlen);  
    }  
  
    //@Override  
    public void insertString(int offset, String str, AttributeSet attr)  
            throws BadLocationException {  
        if (str == null)  
            return;  
          
        try {  
            Integer.parseInt(str);  
        } catch (Exception e) {
        	Toolkit.getDefaultToolkit().beep();	
            return;  
        }  
          
        super.insertString(offset, str, attr);  
    }  
}  
