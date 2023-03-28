public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //downcast
        Vendedor vendedor1 = (Vendedor) new Funcionario(); // dá erro. Evitar downcast
    }

}
