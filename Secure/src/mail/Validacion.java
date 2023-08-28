
package mail;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Miguel Jesus
 */


public class Validacion {
    
    public boolean VerificarMail(String dato){
        
        /**
* <h1>Hello, World!</h1>
* The HelloWorld program implements an application that
* simply displays "Hello World!" to the standard output.
* <p>
* Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
* 
*
* @author  Zara Ali
* @version 1.0
* @since   2014-03-31 
*/
        
        boolean respuesta;
        // Patrón para validar el email
            Pattern pattern = Pattern
				.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
						+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

            Matcher mather = pattern.matcher(dato);

            if (mather.find() == true) {
		respuesta = true;
            } else {
		respuesta= false;
            }
                
        return respuesta;
    }
            
    public String SugerirMail(String Nombre, String PrimerApellido, String SegundoApellido, int AñoNacimiento){
        String opcion1 = ""+ Nombre.charAt(0)+PrimerApellido;
            
        String opcion2 = "" + Nombre.charAt(0)+PrimerApellido+SegundoApellido.charAt(0)+AñoNacimiento;
        
        String opcion3 = "" + Nombre.charAt(0)+PrimerApellido+SegundoApellido+AñoNacimiento;
        
        String opcion4 = ""+ PrimerApellido+SegundoApellido.charAt(0)+AñoNacimiento;
        
        return "Opcion1: "+ opcion1 +"\n" + "Opcion2: "+ opcion2 +"\n"+ "Opcion3: "+ opcion3 +"\n" +"Opcion4: "+ opcion4  ;
    }
    public String SugerirPassword(){
        final String mayuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String resto = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        final String CaracterEspecial = "!¡?¿*./+-_";
        String password="";
        int len = 10;
        Random rd= new Random();
        
   
        for (int i=0; i < len ; i ++ ){
             int aux ;
            if(password.equals("")){
                aux = rd.nextInt(mayuscula.length());
                password = password + mayuscula.charAt(aux);
            }
            if(i== (len-1)){
               aux = rd.nextInt(CaracterEspecial.length());
                password = password + CaracterEspecial.charAt(aux); 
            }
            else{
                aux = rd.nextInt(resto.length());
                password = password + resto.charAt(aux); 
            }
        }
        
        return password;
    }
}
