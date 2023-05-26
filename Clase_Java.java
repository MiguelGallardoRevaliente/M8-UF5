
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clase_Java {

    private final String Autor = "Ryan Campbell";

    public String Frase_del_dia = "Comentar el código es como limpiar el cuarto de baño; nadie quiere hacerlo, pero el resultado es siempre una experiencia más agradable para uno mismo y sus invitados";
    
    public Clase_Java(){
        System.out.println( this.Autor + " te recuerda '" + this.Frase_del_dia + "'" );
    }

    public Date StringToDate( String value )
    {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
         try {
            date = (java.util.Date) formatter.parse( value );
        } catch (ParseException ex) {
            System.err.println( ex.getMessage() );
        }
        return date;
    }

    public int Suma( int a , int b)
    {
        return a + b;
    }

    public int suma_enteros( int a, int b)
    {
        int resultado = 0;
        if( a>0 && b>0)
            resultado = a + b;
        return resultado;
    }

}
