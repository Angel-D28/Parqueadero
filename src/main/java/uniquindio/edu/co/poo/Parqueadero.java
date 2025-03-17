package uniquindio.edu.co.poo;

import java.util.ArrayList;

public class Parqueadero {
    private String nombre;
    private String ubicacion;
    private String nit;
    ArrayList<Vehiculo> listaVehiculos;

    public Parqueadero(String nombre, String ubicacion, String nit, ArrayList<Vehiculo> listaVehiculos) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.nit = nit;
        this.listaVehiculos = listaVehiculos;
    }

    public void ordenarVehiculosPlaca(){
        int tamañoLista = listaVehiculos.size();
        for(int i = 0; i<tamañoLista - 1; i++){
            for (int j = 0; j< tamañoLista - i - 1; j++){
                if (listaVehiculos.get(j).getPlaca().compareTo(listaVehiculos.get(j+1).getPlaca()) > 0){
                    Vehiculo vehiculoAux = listaVehiculos.get(j);
                    listaVehiculos.set(j, listaVehiculos.get(j+1));
                    listaVehiculos.set(j+1, vehiculoAux);
                }
            }
        }
    }

    public Vehiculo BuscarVehiculo(String placa){
        Vehiculo vehEncontrado= null;
        for(Vehiculo vehiculoAux: listaVehiculos){
            if(vehiculoAux.getPlaca().equals(placa)){
                vehEncontrado = vehiculoAux;
                return vehEncontrado;
            }
        }
        return vehEncontrado;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
}
