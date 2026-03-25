Public class ListaEnlazada_SantiagoParraCadena{

    static class Nodo{
        String nombre;  
        Nodo Siguiente;

        Nodo (String nombre){
            this.nombre=nombre;
            this.siguiente=null;

        } 
    } 

    Public static void  main (String[]args{
        Nodo n1 = new nodo("Santiago")
        Nodo n2 = new nodo("Maria")
        Nodo n3 = new nodo("Fernanda")
        Nodo n4 = new nodo("Paula")
        Nodo n5 = new nodo("Felipe")

        n1.siguiente = n2;
        n2.siguiente = n3;
        n3.siguiente = n4;
        n4.siguiente = null;

        Nodo cabeza = n1;

        Nodo actual = cabeza;
        while (actual !=null){
            system.out.print("["+ actual.nombre + "]->");
            actual = actual.siguiente;
            }
            system.out.print("NULL");
        }

    }    
















}
