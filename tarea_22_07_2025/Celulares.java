public class Celulares {
    int bateria;
    String color;
    int modelo;
    int almacenamiento;
    int tamaño_pantalla;
    String sistema_operrativo;
    int camaras;


    public Celulares (int bateria, String color, int modelo, int almacenamiento,int tamaño_pantalla, String sistema_operrativo, int camaras) {
        this.bateria = bateria;
        this.color = color;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.tamaño_pantalla = tamaño_pantalla;
        this.sistema_operrativo = sistema_operrativo;
        this.camaras = camaras;
    }
    public void reiniciar(){
        System.out.println("el celular " +modelo+ " se esta reiniciando");
    }
    public void tomar_una_foto(){
        System.out.println("el celular esta tomando una foto");
    }
    public void almacenar(){
        System.out.println("el celular guardo un número");
    }
    public void reproducir(){
        System.out.println("en el celular esta sonando una canción");

    }
    public void cargar(){
        System.out.println("la bateria del celular es: " +bateria+ " % ");
        if(bateria >= 10){
            bateria = bateria-5;
            System.out.println("la  bateria disminuyo a: " +bateria+ " % ");
        } else if (bateria >=5){
            System.out.println("bateria baja. cargue el celular");
        }else {
            System.out.println("el celular se apagara");
        }
        
    }
    public void escribir(){
        System.out.println("por medio del celular se esta enviando un mensaje ");
    }
    public void jugar(){
        System.out.println("el celular "+modelo+" tiene instalado el juego call of duty");
    }

    public int getBateria(){
        return bateria;
    }

    
}
