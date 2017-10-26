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
        conectar("/home/oracle/Desktop/compartido/NetBeansProjects/XMLProba0/proba0.xml");
        crearXMLEjercicio();
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
    
    public static void crearXML(String rootElement){
        try {
            xmlsw.writeStartDocument("1.0");
            xmlsw.writeStartElement(rootElement);
        } catch (XMLStreamException ex) {
            Logger.getLogger(XMLProba0.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void cerrarXML(){
        try {
            xmlsw.writeEndDocument();
        } catch (XMLStreamException ex) {
            Logger.getLogger(XMLProba0.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void añadirElemento(String nombre){
        try {
            xmlsw.writeStartElement(nombre);
        } catch (XMLStreamException ex) {
            Logger.getLogger(XMLProba0.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void cerrarElemento(){
        try {
            xmlsw.writeEndElement();
        } catch (XMLStreamException ex) {
            Logger.getLogger(XMLProba0.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void añadirAtributo(String nombreAtributo, String valor){
        try {
            xmlsw.writeAttribute(nombreAtributo, valor);
        } catch (XMLStreamException ex) {
            Logger.getLogger(XMLProba0.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void escribirContenido(String contenido){
        try {
            xmlsw.writeCharacters(contenido);
        } catch (XMLStreamException ex) {
            Logger.getLogger(XMLProba0.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void crearXMLEjercicio(){
        crearXML("autores");
        añadirElemento("autor");
        añadirAtributo("codigo","a1");
        añadirElemento("nome");
        escribirContenido("Alexandre Dumas");
        cerrarElemento();
        añadirElemento("titulo");
        escribirContenido("El conde de montecristo");
        cerrarElemento();
        añadirElemento("titulo");
        escribirContenido("Los miserables");
        cerrarElemento();
        cerrarElemento();
        añadirElemento("autor");
        añadirAtributo("codigo","a2");
        añadirElemento("nome");
        escribirContenido("Fiodor Dostoyevski");
        cerrarElemento();
        añadirElemento("titulo");
        escribirContenido("El idiota");
        cerrarElemento();
        añadirElemento("titulo");
        escribirContenido("Noches blancas");
        cerrarElemento();
        cerrarElemento();
        cerrarXML();
        try {
            xmlsw.close();
        } catch (XMLStreamException ex) {
            Logger.getLogger(XMLProba0.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
