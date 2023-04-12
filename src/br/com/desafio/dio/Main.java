package br.com.desafio.dio;

import java.time.LocalDate;

import br.com.desafio.dio.dominio.Curso;
import br.com.desafio.dio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Conteúdo de Programação orientada a objetos - POO");
		curso1.setCargaHoraria(4);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("AWS");
		curso2.setDescricao("Conteúdo de Cloud - Nuvem");
		curso2.setCargaHoraria(2);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Conteúdo técnico");
		mentoria1.setDescricao("Abrange as melhores práticas");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		
	}

}
