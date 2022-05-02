package com.dionlan.estudos.Java8_Streams_Creation.testes;

import static java.util.Arrays.asList;

import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import com.dionlan.estudos.Java8_Streams_Creation.classes.Pessoa;

public class PessoaTesteReduce {
	
	public static void main(String[] args) {
		Optional<Integer> reduce = getStream().reduce((x, y) -> x + y);
		System.out.println(reduce.get());
		
		Integer soma = getStream().reduce(0, (x, y) -> x + y);
		System.out.println(soma);
		
		Optional<Integer> soma1 = getStream().reduce(Integer::sum);
		System.out.println(soma1.get());
		
		Integer mult = getStream().reduce(0,  (x, y) -> x * y);
		System.out.println(mult);
		
		Optional<Integer> max = getStream().reduce((x, y) -> x > y ? x : y);
		System.out.println(max.get());
		
		Optional<Integer> max2 = getStream().reduce(Integer::max);
		System.out.println(max2.get());
		
		/**
		 * Soma de todos os salários acima de 4000
		 */
		Stream<Pessoa> streamPessoa = Pessoa.bancoDePessoas().stream();
		Optional<Double> somaSalario = streamPessoa.filter(p -> p.getSalario() > 4000)
				.map(Pessoa::getSalario)
				.reduce(Double::sum);
		System.out.println(somaSalario.get());
		
		Pessoa.bancoDePessoas().stream();
		
		DoubleStream doubleStream = Pessoa.bancoDePessoas().stream().filter(p -> p.getSalario() > 4000)
				.mapToDouble(Pessoa::getSalario);
		
		System.out.println(doubleStream);
		
		Stream<Double> doubleStream2 = doubleStream.boxed();
		System.out.println(doubleStream2);
	}

	private static Stream<Integer> getStream() {
		return asList(1,2,3,4,5,6).stream();
	}

}
