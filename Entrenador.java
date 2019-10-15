
public class Entrenador
{
   public String nombre;
   Pokemon pokemon;
   Pokedex pokedex;
   
   public Entrenador(){
   Pokedex pokedex = new Pokedex(); 
   }
   public Entrenador(String nombre, Pokemon pokemon, Pokedex pokedex){
    
   this.nombre=nombre;
   this.pokemon=pokemon;
   this.pokedex=pokedex;
   }
   
    public String getNombre(){
    return nombre;
    }
    
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    
     public Pokemon getPokemon(){
    return pokemon;
    }
    
    public void setPokemon(Pokemon pokemon){
    this.pokemon=pokemon;
    }
    
     public Pokedex getPokedex(){
    return pokedex;
    }
    
    public void setPokedex(Pokedex pokedex){
    this.pokedex=pokedex;
    }
    
    public void capturar(){
    
    System.out.println("Felicidades a capturado un pokemon "+pokemon.getNombre());
    }
    
    public void liberar(){
    
    System.out.println("a liberado a "+pokemon.getNombre());
    }
    
    public void intercambiar(){
    
    System.out.println("Felicidades a cambiado a "+pokemon.getNombre()+" por "+pokemon.getNombre());
    }
    
}
