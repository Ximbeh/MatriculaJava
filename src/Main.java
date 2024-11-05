public class Main {
    public static void main(String[] args) {
        Matricula matricula = new Matricula("João Silva", "Matemática");

        matricula.setPrimeiraNota(8.5);
        matricula.setSegundaNota(7.0);
        matricula.setTerceiraNota(9.0);

        matricula.imprimirDados();

        double mediaComPesos = matricula.calcularMedia(0.4, 0.3, 0.3);
        System.out.println("Média com pesos: " + mediaComPesos);
    }
}
