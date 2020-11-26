import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Pessoa p1 = new Pessoa("Jurema",sdf.parse("10/10/2022"));

            p1.verificaDataNacimento();
        } catch (ParseException e) {
            e.getMessage();
        }
    }
}
