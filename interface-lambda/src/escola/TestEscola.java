package escola;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestEscola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Secretario secretario = new Secretario();

        System.out.println();
        System.out.println("Informe o Login: ");
        String login = sc.next();
        secretario.setLogin(login);

        System.out.println("Informe a Senha:  ");
        String senha = sc.next();
        secretario.setSenha(senha);

         if(secretario.autenticar()) {
            Aluno aluno1 = new Aluno();
             aluno1.setNomeEscola("São Bento");
             aluno1.setDisciplinas("Física");
             aluno1.setDataMatricula("23/01/2023");
             aluno1.setSerieMatriculado("2a");


             List<Aluno> alunos = new ArrayList<>();

             alunos.add(aluno1);
             System.out.println(alunos);
         }

         sc.close();
    }
}
