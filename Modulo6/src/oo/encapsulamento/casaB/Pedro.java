package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos(){

        Ana mae = new Ana();

//        System.out.println(mae.segredo);
//        System.out.println(mae.facoDentroDeCasa);
//        System.out.println(mae.formaDeFalar); Acesso apenas acesso via herança,e nao através do objeto do tipo Ana
        System.out.println(mae.todosSabem);

//        System.out.println(segredo);
//        System.out.println(facoDentroDeCasa);
        System.out.println(formaDeFalar); //aqui consigo acesso, pois foi passado por herança
        System.out.println(todosSabem);
    }
}
