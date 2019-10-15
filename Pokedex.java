
public class Pokedex
{
    public Integer capturados,noCapturados;
     
    public Pokedex(){}
    public Pokedex(Integer capturados, Integer noCapturados){
    
    this.capturados=capturados;
    this.noCapturados=noCapturados;
    }
    
    public Integer getCapturados(){
    return capturados;
    }
    
    public void setCapturados(Integer capturados){
    this.capturados=capturados;
    }
    
    public Integer getNoCapturados(){
    return noCapturados;
    }
    
    public void setNoCapturados(Integer noCapturados){
    this.noCapturados=noCapturados;
    }
    
    public void reiniciar(){    
    System.out.println("pokedex reiniciada");
    }
    
    public void mostrarPokedex(){
        System.out.println("esta viendo su pokedex ");
    }
}
