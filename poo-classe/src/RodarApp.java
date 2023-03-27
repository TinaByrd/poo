public class RodarApp {
    public static void main(String[] args) {

        Carro carro1 = new Carro(); //criando o objeto vazio para instanciar depois

        carro1.setCor("Amarelo");
        carro1.setModelo("Palio");
        carro1.setCapacidadeTanque(57);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(4.59));

        Carro carro2 = new Carro("Cinza", "Mercedez Benz", 66); //aproveitando a sobrecarga

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(5.59));
    }
}
