package agenda;

import java.util.ArrayList;

import contatos.Contato;

public class Agenda {
		
	//atributo do tipo array
	private ArrayList<Contato> listaDeContatos;
	private int numero = 1;
	
	public Agenda() {
		listaDeContatos = new ArrayList<>();
	}
	
	//inserir novos contatos
	public void inserirContato(Contato contato) {
		listaDeContatos.add(contato);
	}
	
	//listar Contatos
	
	public void listarContatos() {
		//Caso nao haja imprimir. Agenda vazia
		if (listaDeContatos.isEmpty()) {
			System.out.println("Não há nenhum contato na agenda!");
		} else {
			System.out.println("Total de contatos: " + listaDeContatos.size() + "\n-------------------------------------");
			for (Contato contato : listaDeContatos) {
				System.out.println("Contato: " + Integer.toString(numero) + contato);
				numero += 1;
			}
		
		}
	}
}
