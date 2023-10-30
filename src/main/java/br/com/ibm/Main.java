package br.com.ibm;

import br.com.ibm.models.Carro;
import br.com.ibm.models.Moto;
import br.com.ibm.models.Veiculo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static List<Veiculo> main() {

        Carro carro1 = new Carro();
        carro1.setMarca("Mitsubishi");
        carro1.setModelo("Lancer");
        carro1.setQuantidadePortas(4);
        carro1.desligar();

        Carro carro2 = new Carro();
        carro2.setMarca("Ford");
        carro2.setModelo("Focus");
        carro2.setQuantidadePortas(4);
        carro2.ligar();

        Carro carro3 = new Carro();
        carro3.setMarca("Ford");
        carro3.setModelo("Mustang");
        carro3.setQuantidadePortas(2);
        carro3.ligar();

        Carro carro4 = new Carro();
        carro4.setMarca("Chevrolet");
        carro4.setModelo("Camaro");
        carro4.setQuantidadePortas(2);
        carro4.ligar();

        Carro carro5 = new Carro();
        carro5.setMarca("BMW");
        carro5.setModelo("M5");
        carro5.setQuantidadePortas(4);
        carro5.ligar();

        Moto moto1 = new Moto();
        moto1.setMarca("Honda");
        moto1.setModelo("CBR");
        moto1.setCor("Azul");
        moto1.desligar();

        Moto moto2 = new Moto();
        moto2.setMarca("Suzuki");
        moto2.setModelo("GSX-R");
        moto2.setCor("Prata");
        moto2.ligar();

        Moto moto3 = new Moto();
        moto3.setMarca("Yamaha");
        moto3.setModelo("YZF-R1");
        moto3.setCor("Vermelha");
        moto3.ligar();

        Moto moto4 = new Moto();
        moto4.setMarca("BMW");
        moto4.setModelo("S1000RR");
        moto4.setCor("Preto");
        moto4.ligar();

        List<Veiculo> veiculosArray = new ArrayList<>();
        veiculosArray.add(carro1);
        veiculosArray.add(carro2);
        veiculosArray.add(carro3);
        veiculosArray.add(carro4);
        veiculosArray.add(carro5);
        veiculosArray.add(moto1);
        veiculosArray.add(moto2);
        veiculosArray.add(moto3);
        veiculosArray.add(moto4);

        return veiculosArray;

    }
}
