package test;



public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
   static int cantidadCreados;

   int cantidadAsientos(){
       int numAsientos=0;
       for(int i=0; i<asientos.length;i++){
           if (asientos[i]!=null){
               numAsientos++;
           }
       }
       return numAsientos;
   }
   String verificarIntegridad() {
       for (int i = 0; i < asientos.length; i++) {
           if ((motor.registro != registro) || (asientos[i].registro != motor.registro)) {
               return "Las piezas no son originales";

           }


       }
       return "Auto original";


   }






}
