public class Carros {
    String color;
    String placa;
    String marca;
    int cilindraje;
    String transmision;
    String tipo_motor;
    int velocidad;

    public Carros(String color, String placa, String marca, int cilindraje, String transmision, String tipo_motor, int velocidad) {
        this.color = color;
        this.placa = placa;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.transmision = transmision;
        this.tipo_motor = tipo_motor;
        this.velocidad = velocidad;
    }

    public void encender() {
        System.out.println("El carro de " + marca + " está encendido");
    }

    public void clasificar_motor() {
        if (cilindraje < 1000) {
            System.out.println("El " + marca + " de " + placa + " tiene un motor pequeño");
        } else if (cilindraje <= 2000) {
            System.out.println("El " + marca + " de " + placa + " tiene un motor mediano");
        } else {
            System.out.println("El " + marca + " de " + placa + " tiene un motor grande");
        }
    }

    public void frenar() {
        System.out.println("El auto está frenando");
    }

    public void apagarse() {
        System.out.println("El auto está apagado");
    }

    public void acelerar() {
        System.out.println("la velocidad es: " +velocidad+ " km/h");
        if (velocidad >= 60) {
            velocidad = velocidad + 10;
            System.out.println("el auto esta acelerando.Nueva velocidad: " +velocidad+ " km/h");
        } else {
            velocidad = 0;
            System.out.println("el auto esta detenido.No puede acelerar");
        }
        
    }

    public void pitar() {
        System.out.println("El auto está pitando");
    }

    public void enceder_luces() {
        System.out.println("Las luces del auto están encendidas");
    }

    public int getVelocidad() {
        return velocidad;
    }
}

