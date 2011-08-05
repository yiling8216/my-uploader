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

    public static String login="http://localhost/myUploaderServer/login.php";
    public static String agregarUsuario="http://localhost/myUploaderServer/addUsuario.php";
    public static String agregarArchivo="http://localhost/myUploaderServer/subir.php?usuario=";
    public static String buscarArchivo="http://localhost/myUploaderServer/misArchivos.php";

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

    

}
