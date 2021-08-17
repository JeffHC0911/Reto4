package utp.misiontic2022.c2.p50.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p50.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p50.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        ArrayList<Requerimiento_3> respuesta = new ArrayList<>();
        Connection conexion = JDBCUtilities.getConnection();
        try {
            String consulta = "SELECT Nombre_Material , MAX(Precio_Unidad) FROM MaterialConstruccion group by Nombre_Material HAVING MAX(Precio_Unidad)>1500;";
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);

            while (resultSet.next()) {
                Requerimiento_3 requerimiento3 = new Requerimiento_3();
                requerimiento3.setNombre_Material(resultSet.getString("Nombre_Material"));
                requerimiento3.setPrecio_Unidad(resultSet.getInt("MAX(Precio_Unidad)"));
                respuesta.add(requerimiento3);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println("Error consultando Ranking de los materiales:  " + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }
        return respuesta;
    }
}