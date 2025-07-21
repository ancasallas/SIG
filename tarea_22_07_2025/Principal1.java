public class Principal1 {
    public static void main(String args[]) {
        Carros sedan = new Carros("gris", "FTH456", "Hyndai", 1600, "automatica", "gasolina", 60);
        Carros SUV = new Carros("blanco", "ABC125", "Toyota", 2500, "automatico", "hibirdo", 80);
        Carros deportivo = new Carros("rojo", "SPD777", "Ferrari", 3900, "manual", "gasolina", 120);
        Celulares iphone = new Celulares(50,"negro",15,128,6,"IOS",2);
        Celulares samsung = new Celulares(10,"azul",24,128,5,"Android",1);
        Celulares Xiaomi = new Celulares(80,"blanco",12,128,7,"Android",3);


        sedan.encender();
        SUV.clasificar_motor();
        deportivo.frenar();
        sedan.apagarse();
        deportivo.acelerar();
        deportivo.acelerar();
        SUV.pitar();
        sedan.enceder_luces();
        iphone.reiniciar();
        samsung.reiniciar();
        Xiaomi.tomar_una_foto();
        samsung.almacenar();
        Xiaomi.reproducir();
        iphone.cargar();
        iphone.cargar();
        samsung.escribir();
        Xiaomi.jugar();


        System.out.println(sedan.getVelocidad());
        System.out.println(iphone.getBateria());
    }
}

