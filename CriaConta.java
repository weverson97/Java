public class CriaConta {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200.56;

        Conta segundaConta = new Conta();
        segundaConta.saldo = 500;

        System.out.println("A primeira conta tem " + primeiraConta.saldo);
        System.out.println("A segunda conta tem " + segundaConta.saldo);

    }
}
