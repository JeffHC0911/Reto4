package utp.misiontic2022.c2.p50.reto4.modelo.vo;

public class Requerimiento_1 {
    private String Fecha_Inicio;
    private String Constructora;
    private String Ciudad;
    private String Acabados;
    private String Banco_Vinculado;
    private String Serial;

    public Requerimiento_1() {   
    }

    public Requerimiento_1(String fecha_Inicio, String constructora, String ciudad, String acabados,
            String banco_Vinculado, String serial) {
        this.Fecha_Inicio = fecha_Inicio;
        this.Constructora = constructora;
        this.Ciudad = ciudad;
        this.Acabados = acabados;
        this.Banco_Vinculado = banco_Vinculado;
        this.Serial = serial;
    }

    public String getFecha_Inicio() {
        return this.Fecha_Inicio;
    }

    public void setFecha_Inicio(String fechaInicio) {
        this.Fecha_Inicio = fechaInicio;
    }

    public String getConstructora() {
        return this.Constructora;
    }

    public void setConstructora(String constructora) {
        this.Constructora = constructora;
    }

    public String getCiudad() {
        return this.Ciudad;
    }

    public void setCiudad(String ciudad) {
        this.Ciudad = ciudad;
    }

    public String getAcabados() {
        return this.Acabados;
    }

    public void setAcabados(String acabado) {
        this.Acabados = acabado;
    }

    public String getBanco_Vinculado() {
        return this.Banco_Vinculado;
    }

    public void setBanco_Vinculado(String bancoVinculado) {
        this.Banco_Vinculado = bancoVinculado;
    }

    public String getSerial() {
        return this.Serial;
    }

    public void setSerial(String serial) {
        this.Serial = serial;
    }

}
