package br.edu.ifpb.pos.webservicelivrariaclient;

/**
 *
 * @author FILIPE
 */
public class App {
    
    public static void main(String[] args) {
        LivrariaService_Service livrariaService_Service = new LivrariaService_Service();
        LivrariaService livrariaService = livrariaService_Service.getLivrariaServicePort();
        
        Livro livro = new Livro();
        livro.setNumeroPaginas(120);
        livro.setPreco(20.0);
        livro.setTitulo("Aula de POS");
        //
        Livro livro1 = new Livro();
        livro.setNumeroPaginas(120);
        livro.setPreco(20.0);
        livro.setTitulo("Guia do mochileiro");
        //
        Livro livro2 = new Livro();
        livro.setNumeroPaginas(120);
        livro.setPreco(20.0);
        livro.setTitulo("O monge e o executivo");
        
        System.out.println(livrariaService.salvar(livro));
        System.out.println(livrariaService.salvar(livro1));
        System.out.println(livrariaService.salvar(livro2));
        
        System.out.println(livrariaService.recuperarLivro("O monge e o executivo"));
    }
    
}
