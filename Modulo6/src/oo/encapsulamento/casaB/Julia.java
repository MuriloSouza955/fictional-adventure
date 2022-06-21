package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

     void testeAcessos(){

         Ana sogra = new Ana();

         System.out.println(sogra.todosSabem); // somente consigo acessar este método
//         System.out.println(sogra.facoDentroDeCasa);
//         System.out.println(sogra.formaDeFalar);
//         System.out.println(sogra.segredo);
     }
}
