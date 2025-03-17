package uniquindio.edu.co.poo;

import java.time.LocalTime;

public class Vehiculo {
    private String placa;
    private String propietario;
    private LocalTime horaEntrada;

    public Vehiculo(String placa, String propietario, LocalTime horaEntrada) {
        this.placa = placa;
        this.propietario = propietario;
        this.horaEntrada = horaEntrada;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
}
