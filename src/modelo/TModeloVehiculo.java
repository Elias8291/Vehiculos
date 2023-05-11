/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Elias
 */
public class TModeloVehiculo extends AbstractTableModel {

    private List<Vehiculo> datos;
    private int nc;
    final private String columnas[] = {"ID vehiculo", "Placa", "Anio","Color","Marca","Tipo"};

    public TModeloVehiculo(List<Vehiculo> d) {
        datos = d;
    }
    // getColumnNames(int c);

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int r, int c) {
        switch (c) {
            case 0:
                return datos.get(r).getIdve();
            case 1:
                return datos.get(r).getPlaca();
            case 2:
                return datos.get(r).getAnio();
            case 3:
                return datos.get(r).getColor();
            case 4:
                return datos.get(r).getMarca();
            case 5:
                return datos.get(r).getTipo().getNombre();
            default:
                return null;
        }
    }

}
