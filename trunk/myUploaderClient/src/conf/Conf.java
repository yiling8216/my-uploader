/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conf;

/**
 *
 * @author DMHA
 */
public class Conf {

    public static String login="http://inmag.com.co/myuploader/login.php";
    public static String descarga="http://inmag.com.co/myuploader/upload/";
    public static String agregarUsuario="http://inmag.com.co/myuploader/addUsuario.php";
    public static String agregarArchivo="http://inmag.com.co/myuploader/subir.php?usuario=";
    public static String buscarArchivo="http://inmag.com.co/myuploader/misArchivos.php";

    public static String getAgregarArchivo() {
        return agregarArchivo;
    }

    public static void setAgregarArchivo(String agregarArchivo) {
        Conf.agregarArchivo = agregarArchivo;
    }

    public static String getAgregraUsuario() {
        return agregarUsuario;
    }

    public static void setAgregraUsuario(String agregraUsuario) {
        Conf.agregarUsuario = agregraUsuario;
    }

    public static String getBuscarArchivo() {
        return buscarArchivo;
    }

    public static void setBuscarArchivo(String buscarArchivo) {
        Conf.buscarArchivo = buscarArchivo;
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        Conf.login = login;
    }

    public static String getAgregarUsuario() {
        return agregarUsuario;
    }

    public static void setAgregarUsuario(String agregarUsuario) {
        Conf.agregarUsuario = agregarUsuario;
    }

    public static String getDescarga() {
        return descarga;
    }

    public static void setDescarga(String descarga) {
        Conf.descarga = descarga;
    }

    

}
