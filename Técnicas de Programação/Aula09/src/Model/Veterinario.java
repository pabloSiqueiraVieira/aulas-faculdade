
package Model;

/**
 *
 * @author autologon
 */
public class Veterinario {
    private int id;
    private  String nome;
    private String crmv;
    private String formacao;
    
    public int getId(){
        return id;
}
    public void setId(){
        this.id = id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String setNome(String string){
        return nome;
    }
    
    public String getCrmv(){
        return crmv;
    }
    
    public void setCrmv(String crmv1){
        this.crmv = crmv;
    }
    
    public String getFormacao(){
        return nome;
    }
    
    public String setFormacao(){
        return formacao;
    }

    public void setFomacao(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}

