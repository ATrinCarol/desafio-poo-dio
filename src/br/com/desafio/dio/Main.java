package br.com.desafio.dio;

import java.time.LocalDate;

import br.com.desafio.dio.dominio.Bootcamp;
import br.com.desafio.dio.dominio.Conteudo;
import br.com.desafio.dio.dominio.Curso;
import br.com.desafio.dio.dominio.Dev;
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
		
		Curso curso3 = new Curso();
		curso3.setTitulo("Infraestrutura na nuvem");
		curso3.setDescricao("Conteúdo de redes");
		curso3.setCargaHoraria(3);

		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Conteúdo técnico");
		mentoria1.setDescricao("Abrange as melhores práticas");
		mentoria1.setData(LocalDate.now());

		Conteudo conteudoJava = new Curso(); // polimorfismo
		conteudoJava.setTitulo("Curso de Java com paradigma de POO");
		conteudoJava.setDescricao(
				"Conteúdo de herança e polimorfismo. Conteudo é uma classe abstract portanto não é possível intancia-la."
						+ " Mas podemos instanciar um objeto do ''tipo Conteudo'' através da classe Curso que é filha da classe mãe Conteudo");

		Conteudo conteudoCloud = new Curso();
		conteudoCloud.setTitulo("CLOUD: Os principais provedores");
		conteudoCloud.setDescricao("Conteúdo sobre serviços da AWS, Azure e Google");
		
		/*
		 * System.out.println(curso1); System.out.println(curso2);
		 * System.out.println(mentoria1); System.out.println(conteudoJava);
		 */

		Bootcamp bootcampJava = new Bootcamp();
		bootcampJava.setNome("Curso Java Developer");
		bootcampJava.setDescricao("Conteúdo de instanciação de classe e criação de objetos");
		bootcampJava.getConteudos().add(curso1);
		bootcampJava.getConteudos().add(curso2);
		bootcampJava.getConteudos().add(mentoria1);
		bootcampJava.getConteudos().add(conteudoJava);
		
		Bootcamp bootcampCloud = new Bootcamp();
		bootcampCloud.setNome("Iniciante Cloud");
		bootcampCloud.setDescricao("Compreender os conceitos de nuvem");
		bootcampCloud.getConteudos().add(curso3);
		bootcampCloud.getConteudos().add(conteudoCloud);
		bootcampCloud.getConteudos().add(mentoria1);
		
		Dev dev1 = new Dev();
		dev1.setNome("Tom");

		Dev dev2 = new Dev();
		dev2.setNome("Beca");
		
		dev1.inscreverBootcamp(bootcampJava);
		dev2.inscreverBootcamp(bootcampCloud);

		if (dev1.getConteudosInscritos().isEmpty()) {
			System.out.println(
					"Conteúdos inscritos de " + dev1.getNome() + " : Nenhuma matrícula realizada até o momento");
		} else {
			System.out.println("Conteúdos inscritos de " + dev1.getNome() + " : " + dev1.getConteudosInscritos());
		}
		
		if (dev2.getConteudosInscritos().isEmpty()) {
			System.out.println(
					"Conteúdos inscritos de " + dev2.getNome() + " : Nenhuma matrícula realizada até o momento");
		} else {
			System.out.println("Conteúdos inscritos de " + dev2.getNome() + " : " + dev2.getConteudosInscritos());
		}
		
		dev1.progredir();
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		
		System.out.println("A situação dos estudantes em relação a conclusão do bootcamp: \n" + dev1.getNome() + ": " + dev1.getConteudosConcluidos() + 
				"\n" + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
		System.out.println("E a situação dos estudantes em relação aos conteúdos inscritos: \n" + dev1.getNome() + ": " + dev1.getConteudosInscritos() + 
				"\n" + dev2.getNome() + ": " + dev2.getConteudosInscritos());
		
		System.out.println("XP " + dev2.getNome() + ": " + dev2.calcularTotalXp());
		System.out.println("XP " + dev1.getNome() + ": " + dev1.calcularTotalXp());
		 
	}

}
