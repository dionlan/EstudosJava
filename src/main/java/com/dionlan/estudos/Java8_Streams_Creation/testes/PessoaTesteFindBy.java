package com.dionlan.estudos.Java8_Streams_Creation.testes;

import java.util.Comparator;
import java.util.List;

import com.dionlan.estudos.Java8_Streams_Creation.classes.Pessoa;

public class PessoaTesteFindBy {

	public static void main(String[] args) {
		List<Pessoa> pessoas = Pessoa.bancoDePessoas(); 
		
		System.out.println(pessoas.stream().anyMatch(p -> p.getSalario() > 4000));
		System.out.println(pessoas.stream().allMatch(p -> p.getIdade() > 10));
		pessoas.stream()
			.filter(p -> p.getIdade() < 25)
			.findAny()
			.ifPresent(p -> System.out.println(p.getNome()));
		
		pessoas.stream()
			.filter(p -> p.getIdade() > 30)
			.sorted(Comparator.comparing(Pessoa::getIdade).reversed())
			.findFirst()
			.ifPresent(p -> System.out.println(p.getNome()));
	}
}
