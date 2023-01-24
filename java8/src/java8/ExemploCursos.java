package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ExemploCursos {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Python", 1000));
		cursos.add(new Curso("Java", 2000));
		cursos.add(new Curso("Javscript", 1250));
		cursos.add(new Curso("C", 500));
		cursos.add(new Curso("C#", 120));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		
		cursos.stream()
			.filter(c -> c.getAlunos() >=1300)
			.forEach(c -> System.out.println(c.getNome()));
		
		int sum = cursos.stream()
			.filter(c -> c.getAlunos() >=1300)
			.mapToInt(Curso::getAlunos)
			.sum();
		
		OptionalDouble average = cursos.stream()
				.filter(c -> c.getAlunos() >=1300)
				.mapToInt(Curso::getAlunos)
				.average();
		
		Optional<Curso> optionalCurso = cursos.stream()
			.filter(c -> c.getAlunos() >= 1000)
			.findAny();
		
		
//		Curso curso = optionalCurso.orElse(null);
		
		optionalCurso.ifPresent(c -> System.out.println(c.getNome()));
		
		List<String> cursosFiltrados = cursos.stream()
		.filter(c -> c.getAlunos() >=1300)
		.map(c -> c.getNome())
		.collect(Collectors.toList());
		
		Map<String, Integer> mapaDeCursos = cursos.stream()
		.filter(c -> c.getAlunos() >=1300)
		.collect(Collectors.toMap(
				c -> c.getNome(),
				c-> c.getAlunos()
		));
		
		cursos.stream()
		.filter(c -> c.getAlunos() >=1300)
		.collect(Collectors.toMap(
				c -> c.getNome(),
				c-> c.getAlunos()
		))
		.forEach((chave, valor) -> System.out.println(chave + " -> " + valor ));
		
		System.out.println("mapa de cursos: " + mapaDeCursos);
		System.out.println("cursos filtrados: " + cursosFiltrados);
		
	}

}
