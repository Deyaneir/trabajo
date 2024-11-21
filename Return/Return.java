package Return;
//Suma de valores tipo primitivo
public class Return {
    double a;
    double l;
    double r;
    public Return(double a, double l, double r){
        this.a=a;
        this.l=l;
        this.r=r;
    }
    public double suma(){
        return (a+l-r);
    }
    public void imprimir(){
        System.out.println(suma());
    }


}
//Return con objetos complejos
class Persona{
    String nombre;
    int edad;
    double altura;
    public Persona(String nombre, int edad, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.altura=altura;
    }

    public String obnombre(){
        return nombre;
    }
    public int obedad(){
        return edad;
    }
    public double obaltura(){
        return altura;
    }
    public void imprimir2(){
        System.out.println("Nombre: "+obnombre()+"edad: "+obedad()+" altura: "+obaltura());
    }
}
//Control de errores
class divicion{
    int a=1;
    int b=0;
    public int div() {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("No hay división para 0");
            return 0;
        }

    }
    public void imprimir3(){
        System.out.println(div());
    }
}
//Diferentes tipos de datos
class multiplicacion{
    int a=1;
    double b=0.25;
    public double mult(){
        return a*b;
    }
    public void imprimir4(){
        System.out.println(mult());
    }
}