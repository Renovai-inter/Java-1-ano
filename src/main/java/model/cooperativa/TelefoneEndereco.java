package model.cooperativa;

public class TelefoneEndereco {

    private int codigoTelefone;
    private String telefone;

    public TelefoneEndereco(int codigoTelefone, String telefone){
        this.codigoTelefone = codigoTelefone;
        this.telefone = telefone;
    }

    public int getCodigoTelefone() {
        return codigoTelefone;
    }

    public void setCodigoTelefone(int codigoTelefone) {
        this.codigoTelefone = codigoTelefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
