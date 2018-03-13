package bertanha.com.br.passandodadosactivity;

import java.io.Serializable;

/**
 * Created by berta on 3/11/2018.
 */

public class Usuario implements Serializable{
    private String nome;
    private String email;

    public Usuario() {
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
