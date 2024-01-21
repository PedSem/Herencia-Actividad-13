public class Circulo {
    //Campo para almacenar el radio del circulo
    private double radio;
    //Constructor para el parámetro del radio
    public Circulo(double radio){
        if(radio<0){
            this.radio=0;
        }else{
            this.radio=radio;
        }

    }
    //Método para obtener el radio del circulo

    public double getRadio(){
        return radio;

    }
    //Método para obtener el area del circulo
    public double getArea(){
        return(radio*radio*Math.PI);

    }



}
class Cilindro extends Circulo{

    //Campo para almacenar la altura del cilindro
private double altura;
//Constructor para los parametros radio y altura
public Cilindro(double radio,double altura){
    super(radio);
    //Verificamos si la altura es inferior a 0 y se ajusta a ese resultado
    if(altura<0){
        this.altura=0;

    }else{
        this.altura=altura;
    }
}
//Metodo para obtener la altura del cilindro
public double getAltura(){
    return altura;
}
//Metodo para obtener el volumen del cilindro
public double getVolumen(){
    return getArea()*altura;
}
    public static void main(String[]args){
    //Se ejecuta el código con el mñetodo main
        Circulo miCirculo=new Circulo(5.0);
        System.out.println("Radio del circulo:"+miCirculo.getRadio());
        System.out.println("Area del circulo:"+miCirculo.getArea());
        Cilindro miCilindro=new Cilindro(3.0,4.0);
        System.out.println("Altura del cilindro:"+miCilindro.getAltura());
        System.out.println("Volumen del cilindro:"+miCilindro.getVolumen());
    }

}
