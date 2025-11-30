package controller;

import model.Professor;
import service.ProfessorService;

import java.util.List;
import java.util.Scanner;

public class ProfessorController {

    private ProfessorService professorService = new ProfessorService();

    public void cadastrarProfessor(Professor professor) {
        professorService.cadastrarProfessor(professor);
    }

    public void cadastrarProfessor(Scanner sc) {
        Professor p = new Professor();
        System.out.println("\n=== CADASTRO DE PROFESSOR ===");


        String nome = "";
        while(nome.trim().isEmpty()){
            System.out.print("Digite o nome do professor: ");
            nome = sc.nextLine();
        }
        p.setNome(nome);

        String area = "";
        while(area.trim().isEmpty()){
            System.out.print("Digite a especialização do professor: ");
            area = sc.nextLine();
        }
        p.setArea(area);


        String formacao = "";
        while(formacao.trim().isEmpty()){
            System.out.print("Digite a formação do professor: ");
            formacao = sc.nextLine();
        }
        p.setFormacao(formacao);

        professorService.cadastrarProfessor(p);
        System.out.println("Professor cadastrado com sucesso!");
    }

    public void listarProfessores() {
        List<Professor> professores = professorService.listarProfessores();
        System.out.println("\n--- Lista de Professores ---");
        for (Professor p : professores) {
            System.out.println(p);
        }
    }

    public void deletarProfessor(String nome) {
        professorService.deletarProfessor(nome);
    }

    public Professor buscarProfessor(String nome) {
        return professorService.buscarProfessor(nome);
    }
}
