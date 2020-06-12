package intro;

public class TelcelSeleccionarArticulo extends TelcelPadre{

    public static void main(String[] args) {
        navegarSitio("https://www.telcel.com");
        verificarLangingPage();
        listarTelefonos();
        seleccionarEstado("Jalisco");
        verificarPaginaResultados();
        Celular primerCelular = capturarDatosCelular(1);
        seleccionarCelular(1);
        validarDatosCelular(primerCelular);
        cerrarBrowser();
    }

}
