package Programa;

import entidades.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Programa app = new Programa();
        app.start();
    }

    private void start() {

        Scanner sc = new Scanner(System.in);
        List<Funcionario> lista = new ArrayList<>();
        System.out.println("Quantos funcionarios vc quer registrar?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Funcionario #"+ (i+1) + ":");
            System.out.println("ID:");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("nome: ");
            String nome = sc.nextLine();
            System.out.println("Salario: ");
            double salario = sc.nextDouble();
            Funcionario funcionario = new Funcionario(id,nome,salario);
            lista.add(funcionario);

        }
        System.out.println("entre com o id de qual salario quer mudar: ");
        int id = sc.nextInt();
        int posicao = 0;
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId() == id){
//                System.out.println("Quantos por cento quer aumentar? ");
//                double porcentagem = sc.nextDouble();
//                lista.get(i).mudarSalario(porcentagem);
                posicao = i;

            }

        }
        if (lista.get(posicao).getId() == id){
            System.out.println("Quantos por cento quer aumentar? ");
            double porcentagem = sc.nextDouble();
            lista.get(posicao).mudarSalario(porcentagem);

        }else{
            System.out.println("ID de funcionario não existe!");
        }
        System.out.println();


        System.out.println("Lista de funcionarios: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));

        }
    }
}
