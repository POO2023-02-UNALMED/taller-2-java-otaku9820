package test;



 class Asiento {
    String color;
    int precio;
    int registro;
    public void cambiarColor(String color){
        if(color.equals("rojo")|| color.equals("verde")||color.equals("amarillo")||color.equals("negro")||color.equals("blanco") ){
            this.color= color;

        }
    }

}

