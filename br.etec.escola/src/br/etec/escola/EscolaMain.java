package br.etec.escola;

import java.util.Date;

public class EscolaMain {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("José Francisco", "123.456.789-00", new Date(), "2025001");
        Professor professor = new Professor("Maria Oliveira", "987.654.321-00", new Date(), 5000.0, "Matemática");
        Funcionario funcionario = new Funcionario("Carlos Souza", "111.222.333-44", new Date(), 2500.0, "Secretário", new Date());

        int qtdCopias = 100;

        System.out.println("Aluno: " + aluno.nome + " | Gasto: R$ " + aluno.tirarCopias(qtdCopias));
        System.out.println("Professor: " + professor.nome + " | Gasto: R$ " + professor.tirarCopias(qtdCopias));
        System.out.println("Funcionario: " + funcionario.nome + " | Gasto: R$ " + funcionario.tirarCopias(qtdCopias));
    }
}
