public class Matricula {
    private String nomeAluno;
    private String nomeDisciplina;
    private double primeiraNota;
    private double segundaNota;
    private double terceiraNota;

    public Matricula(String nomeAluno, String nomeDisciplina) {
        this.nomeAluno = nomeAluno;
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public double getPrimeiraNota() {
        return primeiraNota;
    }

    public void setPrimeiraNota(double primeiraNota) {
        if (primeiraNota >= 0 && primeiraNota <= 10) {
            this.primeiraNota = primeiraNota;
        } else {
            System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
        }
    }

    public double getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(double segundaNota) {
        if (segundaNota >= 0 && segundaNota <= 10) {
            this.segundaNota = segundaNota;
        } else {
            System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
        }
    }

    public double getTerceiraNota() {
        return terceiraNota;
    }

    public void setTerceiraNota(double terceiraNota) {
        if (terceiraNota >= 0 && terceiraNota <= 10) {
            this.terceiraNota = terceiraNota;
        } else {
            System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
        }
    }

 
    public double calcularMedia() {
        return (primeiraNota + segundaNota + terceiraNota) / 3;
    }

    public double calcularMedia(double peso1, double peso2, double peso3) {
        double totalPeso = peso1 + peso2 + peso3;
        return (primeiraNota * peso1 + segundaNota * peso2 + terceiraNota * peso3) / totalPeso;
    }

    public void imprimirDados() {
        System.out.println("Nome do Aluno: " + nomeAluno);
        System.out.println("Nome da Disciplina: " + nomeDisciplina);
        System.out.println("Média Final: " + calcularMedia());
    }
}
