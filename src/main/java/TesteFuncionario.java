public class TesteFuncionario {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();


        Gerente will = new Gerente();
        will.setNome("Will Ferreira");
        will.setCpf("000.000.000-00");
        will.setSalario(3600.00);

        System.out.println(will.getNome());
        System.out.println(will.getBonificacao());
    }
}
