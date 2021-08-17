package utp.misiontic2022.c2.p50.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p50.reto4.controlador.ControladorRequerimientos;

import utp.misiontic2022.c2.p50.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p50.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p50.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {

        System.out.println("25 Proyectos Clasificados por Casa");
        try {
            System.out.println("Clasificación por Casa");
            ArrayList<Requerimiento_1> requerimiento1 = controlador.consultarRequerimiento1();
            for (Requerimiento_1 req1 : requerimiento1) {
                System.out.printf("%s %s %s %s %s %s %n", 
                req1.getFecha_Inicio(), 
                req1.getConstructora(), 
                req1.getCiudad(),
                req1.getAcabados(), 
                req1.getBanco_Vinculado(), 
                req1.getSerial());
            }

        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void requerimiento2() {
        System.out.println("INNER JOIN");
        try {
            System.out.println("Concatenacion");
            ArrayList<Requerimiento_2> requerimiento2 = controlador.consultarRequerimiento2();
            for (Requerimiento_2 req2 : requerimiento2) {
                System.out.printf("%s %s %f %s %n",
                req2.getConstructora(),
                req2.getCiudad(),
                req2.getPorcentaje_Cuota_Inicial(),
                req2.getTipo());
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3() {
        System.out.println("-----Ranking Materiales-------");
        try {
            System.out.println("Materiales");
            ArrayList<Requerimiento_3> requerimiento3 = controlador.consultarRequerimiento3();
            for (Requerimiento_3 req3 : requerimiento3) {
                System.out.printf("%s %d %n", 
                req3.getNombre_Material(), 
                req3.getPrecio_Unidad());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
