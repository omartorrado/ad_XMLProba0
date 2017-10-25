/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlproba0;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

/**
 *
 * @author oracle
 */
public class XMLProba0 {
    
    static XMLOutputFactory xmlof;
    static XMLStreamWriter xmlsw;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static void conectar(String ruta){
    xmlof=XMLOutputFactory.newInstance();
        try {
            xmlsw=xmlof.createXMLStreamWriter(new FileWriter(ruta));
        } catch (XMLStreamException ex) {
            Logger.getLogger(XMLProba0.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XMLProba0.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void CrearXML(){
        
    }
    
}
