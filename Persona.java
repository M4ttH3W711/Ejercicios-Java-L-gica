public class Persona {
    //Todas las personas pueden hacer muchas cosas. Tienen nombre, edad, etc.
    //Así que vamos a simular algunas actividades mediante métodos.

    //Una buena práctica es declarar variables en la parte más alta del código.

    int edad = 20;
    void mayorDeEdad(){
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        } else{
            System.out.println("Eres un menor de edad");
        }
    }

    void descansar(boolean estaCansado){
        if(estaCansado){
            System.out.println("Vete a dormir 😴");
        } else {
            System.out.println("Sigue prácticcando código ✍️");
        }
    }
}

//Agregar 5 cosas más que hacen las personas
