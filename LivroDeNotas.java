public class LivroDeNotas{ //assinatura da classe

    //variável de instância
    //instância é sinônimo de objeto
    String nomeDisciplina;
    public void exibirMensagem(){ //assinatura do método
        System.out.printf("Bem vindo ao livro de notas de %s\n", nomeDisciplina);
    } 

    //construtor padrão (aquele cuja a lista de parâmetros é vazia)
    LivroDeNotas(String nomeDisciplina){
        // shadowing
        this.nomeDisciplina = nomeDisciplina;
    }

}
