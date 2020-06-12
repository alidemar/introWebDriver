package homeworks;

public class LoginSongsBySinatra extends SongsBySinatraParent{

    public static void main(String[] args) {
        navegar("https://evening-bastion-49392.herokuapp.com/");
        validarHomePage();
        realizarLoginCorrecto("frank", "sinatra");
        validateSongsPage();
        validarMensajeBienvenida("You are now logged in as frank");
        cerrarBrowser();
    }



}
