package com.dionlan.estudos.Java8_Streams_Creation.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.dionlan.estudos.Java8_Streams_Creation.classes.Pessoa;

/**
 * https://www.youtube.com/watch?v=k7elQRq1Apg&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=191&ab_channel=DevDojo
 * Continuar: Curso Java Completo - Aula 190: Java 8 Streams pt 06, Gerando Streams
 * @author Dionlan
 * Pegar os tres primeiros nomes das pessoas com menos de 25 anos
 * Ordenar pelo nome
 */
public class PessoaTesteStream {

	public static void main(String[] args) {
		//Java 7
		List<Pessoa> pessoas = Pessoa.bancoDePessoas();
		Collections.sort(pessoas, (p1, p2) -> p1.getNome().compareTo(p2.getNome()));
		List<String> nomes = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			if(pessoa.getIdade() < 25) {
				nomes.add(pessoa.getNome());
				if(nomes.size() > 2) {
					break;
				}
			}
		}
		System.out.println(nomes);
		
		//Java 8
		List<String> nomes2 = pessoas
				.stream()
				.filter(p -> p.getIdade() < 25)
				.sorted(Comparator.comparing(Pessoa::getNome))
				.limit(3)
				.map(Pessoa::getNome)
				.collect(Collectors.toList());
		System.out.println(nomes2);
		
		
		System.out.println(pessoas
				.stream()
				.filter(p -> p.getIdade() < 25)
				.map(Pessoa::getNome)
				.distinct()
				.count());
		
		pessoas.stream().forEach(System.out::println);
	}
}
