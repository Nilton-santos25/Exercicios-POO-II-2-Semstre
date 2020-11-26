import java.util.Date;

public class Pessoa {

    private String nome;
    private Date nascimento;

    public Pessoa() {
    }

    public Pessoa(String nome, Date nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    //método para verificar a data de nascimento
    public void verificaDataNacimento() {
        Date now = new Date(); // pega a data atual
        if(nascimento.after(now)) {
            throw new DataInvalidaException("Você não pode nascer no futuro :) abestado!"); //recebendo os parametros da classe Datainvalida
        } else {
            System.out.println("Data válida");
        }
    }

}
