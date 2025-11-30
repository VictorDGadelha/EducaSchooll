package service;

import java.util.ArrayList;
import java.util.List;
import model.Professor;

public class ProfessorService {
    private static List<Professor> professores = new ArrayList<>();
    public void cadastrarProfessor(Professor professor) {
        professores.add(professor);
    }
    public List<Professor> listarProfessores() {
        return professores;
    }
    public void deletarProfessor(String nome) {
        for (int i = 0; i < professores.size(); i++) {
            if (professores.get(i).getNome().equalsIgnoreCase(nome)) {
                professores.remove(i);
                System.out.println("Deletado com sucesso!");
                return;
            }
        }
        System.out.println("Professor não encontrado.");
    }
    public Professor buscarProfessor(String nome) {
        for (Professor professor : professores) {
            if (professor.getNome().trim().equalsIgnoreCase(nome.trim())) {
                return professor;
            }
        }
        return null;
    }
}

