
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Desrição do Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Desrição do Curso JavaScript");
        curso2.setCargaHoraria(6);

        // Conteudo conteudo = new Curso(); -> Polimorfismo

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel g.");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos: " + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        devGabriel.progredir(); 
        System.out.println("\n->\n");
        System.out.println("Conteúdos incritos: " + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devGabriel.getConteudosConcluidos());
        System.out.println("XP == " + devGabriel.calcularXp());
        
        System.out.println("\n===\n");
        
        Dev devAna = new Dev();
        devAna.setNome("Ana c.");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos: " + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        devAna.progredir();
        System.out.println("Conteúdos incritos: " + devAna.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devAna.getConteudosConcluidos());
        System.out.println("XP == " + devAna.calcularXp());
        
        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        // Conteudo conteudo = new Conteudo(); -> Não é possível instanciar porque a
        // classe é do tipo Abstract
    }
}
