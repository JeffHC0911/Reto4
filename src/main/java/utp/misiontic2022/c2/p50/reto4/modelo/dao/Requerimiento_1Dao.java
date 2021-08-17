package utp.misiontic2022.c2.p50.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p50.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p50.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {

    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        ArrayList<Requerimiento_1> respuesta = new ArrayList<>();
        Connection conexion = JDBCUtilities.getConnection();
        try {
            String consulta="select Fecha_Inicio, Constructora, Ciudad,Acabados, Banco_Vinculado, Serial from Proyecto where Clasificacion = 'Casa' limit 25;";
            Statement statement=conexion.createStatement();
            ResultSet resultSet=statement.executeQuery(consulta);
            while(resultSet.next()){
                Requerimiento_1 requerimiento1 =new Requerimiento_1();
                requerimiento1.setFecha_Inicio(resultSet.getString("Fecha_Inicio"));
                requerimiento1.setConstructora(resultSet.getString("Constructora"));
                requerimiento1.setCiudad(resultSet.getString("Ciudad"));
                requerimiento1.setBanco_Vinculado(resultSet.getString("Banco_Vinculado"));
                requerimiento1.setAcabados(resultSet.getString("Acabados"));
                requerimiento1.setSerial(resultSet.getString("Serial"));
                respuesta.add(requerimiento1);
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.err.println("Error consultando Ranking de los 25 proyecto Clasificados por casa:  "+ e);
        }finally{
            if(conexion!= null){
                conexion.close();
            }
        }
    return respuesta;
    }
}