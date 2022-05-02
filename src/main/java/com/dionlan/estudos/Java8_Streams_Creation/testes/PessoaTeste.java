package com.dionlan.estudos.Java8_Streams_Creation.testes;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author Dionlan
 * Testando o flatMap: extrair os valores de algum lugar. Ex: palavras de uma lista de String ou letras de uma String ou Palavras
 */
public class PessoaTeste {
	
	public static void main(String[] args) {
		List<List<String>> nomes = new ArrayList<>();
		nomes.add(asList("DevDojo", "Obrigado pelo curso gratuito de java!"));
		nomes.add(asList("Java 8", "Revisando as novidades do Java 8!"));
		List<String> listaStream = nomes.stream().flatMap(Collection::stream).collect(Collectors.toList());
		listaStream.forEach(System.out::println);
		System.out.println(listaStream);
		
		List<String> palavras = asList("Olá", "Mundo");
		String [] split = palavras.get(0).split("");
		
		System.out.println(Arrays.toString(split));
		//List<String[]> collect = palavras.stream().map(p -> p.split("")).collect(Collectors.toList()); 
	
		List<String> collect2 =
			palavras.stream() //Stream<String>
			.map(p -> p.split("")) //Stream<String[]>
			.flatMap(Arrays::stream) //Stream<String>
			.collect(Collectors.toList());
		System.out.println(collect2);
	}

}
