package br.com.desafio.dio;

import java.time.LocalDate;

import br.com.desafio.dio.dominio.Conteudo;
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
		
		Conteudo conteudoJava = new Curso(); //polimorfismo
		conteudoJava.setTitulo("Curso de Java com paradigma de POO");
		conteudoJava.setDescricao("Conteúdo de herança e polimorfismo. Conteudo é uma classe abstract portanto não é possível intancia-la." +
		" Mas podemos instanciar um objeto do ''tipo Conteudo'' através da classe Curso que é filha da classe mãe Conteudo");
		//double tentativa1 = conteudoJava.calcularXp();

		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		System.out.println(conteudoJava);
		
	}

}
