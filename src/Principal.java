public class Principal {
    public static void main(String[] args) {
        Persona persona1=new Persona();

        persona1.nombre="Ana";
        persona1.edad=20;

        System.out.println(persona1.nombre  + "tiene"  +  persona1.edad + "años");
         persona1.cumplirAnhos();
        System.out.println("La edad ahora es: " + persona1.edad);


        Persona persona2=new Persona();
        persona2.nombre="Carlos";
        persona2.edad=20;

        System.out.println(persona2.nombre  + "tiene"  +  persona2.edad + "años");
        persona2.cumplirAnhos();
        System.out.println("La edad ahora es: " + persona2.edad);



    }
}
