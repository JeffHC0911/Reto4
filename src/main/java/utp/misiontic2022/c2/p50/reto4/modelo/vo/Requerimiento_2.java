package utp.misiontic2022.c2.p50.reto4.modelo.vo;

public class Requerimiento_2 {
    private String Constructora, Ciudad;
    private double Porcentaje_Cuota_Inicial;
    private String Tipo;

    public Requerimiento_2(){

    }

    public Requerimiento_2(String constructora, String ciudad, double porcentaje_Cuota_Inicial, String tipo) {
        this.Constructora = constructora;
        this.Ciudad = ciudad;
        this.Porcentaje_Cuota_Inicial = porcentaje_Cuota_Inicial;
        this.Tipo = tipo;
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

    public double getPorcentaje_Cuota_Inicial() {
        return this.Porcentaje_Cuota_Inicial;
    }

    public void setPorcentaje_Cuota_Inicial(double porcentajeCuotaInicial) {
        this.Porcentaje_Cuota_Inicial = porcentajeCuotaInicial;
    }

    public String getTipo() {
        return this.Tipo;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

}
