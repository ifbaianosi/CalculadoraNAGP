package br.edu.ifbaiano.calculadora.utils;

import java.awt.Toolkit;

import javax.swing.text.AttributeSet;  
import javax.swing.text.BadLocationException;  
import javax.swing.text.PlainDocument;  
  
public class FixedLengthDocument extends PlainDocument {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int maxLength;  
  
    public FixedLengthDocument(int maxlen) {  
        super();  
          
        if (maxlen <= 0)  
            throw new IllegalArgumentException("You must specify a maximum length!");  
          
        maxLength = maxlen;  
    }  
  
    //@Override  
    public void insertString(int offset, String str, AttributeSet attr)   
    throws BadLocationException {  
        if (str == null || getLength() == maxLength)  
        {
        	Toolkit.getDefaultToolkit().beep();	
        	return;
        }  
  
        int totalLen = (getLength() + str.length());  
        if (totalLen <= maxLength) {  
            super.insertString(offset, str, attr);  
            return;  
        }  
          
        String newStr = str.substring(0, (maxLength - getLength()));  
        super.insertString(offset, newStr, attr);  
    }  
}  
